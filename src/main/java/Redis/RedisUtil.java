package Redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.params.SetParams;

import java.util.Collections;

public class RedisUtil {

    private static final String host = "192.168.0.122";

    private static final int port = 6379;

    private static JedisPool jedisPool;

    static {
        jedisPool = new JedisPool(host, port);
    }

    public static Jedis getJedis() {
        return jedisPool.getResource();
    }

    public boolean tryLock(String key, String request, int timeout) {
        try(Jedis jedis = getJedis()) {
            Long result = getJedis().setnx(key, request);
            //非原子性操作, 如果此时应用异常, 锁将不会过期
            if (result == 1L) {
                return jedis.expire(key, timeout) == 1L;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean tryLockWithSet(String key, String uniqueId, int seconds) {
        try(Jedis jedis = getJedis()) {
            SetParams params = new SetParams();
            params.ex(seconds);
            params.nx();
            return "OK".equals(jedis.set(key, uniqueId, params));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public  boolean releaseLockWithLua(String key, String value) {
        try(Jedis jedis = getJedis()) {
            String luaScript = "if redis.call('get', KEYS[1]) == ARGV[1] then return redis.call('del', KEYS[1]) else " +
                    "return 0 end";
            return jedis.eval(luaScript, Collections.singletonList(key), Collections.singletonList(value)).equals(1L);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
