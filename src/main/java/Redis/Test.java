package Redis;

public class Test {

    private static String key = "lock";

    public static void main(String[] args) {
        RedisUtil redisUtil = new RedisUtil();
        String val = "123";
        new Thread(() -> {
            System.out.println(val);
            System.out.println(redisUtil.tryLockWithSet(key, val+1, 2)+"---1");
            System.out.println(redisUtil.releaseLockWithLua(key, val+1)+"---11");
        }).start();

        new Thread(() -> {
            System.out.println(redisUtil.tryLockWithSet(key, val+2, 2)+"---2");
            System.out.println(redisUtil.releaseLockWithLua(key, val+2)+"---22");
        }).start();
    }

}
