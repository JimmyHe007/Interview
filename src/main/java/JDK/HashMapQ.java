package JDK;

import java.util.HashMap;
import java.util.Map;

public class HashMapQ {

    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("a",1);
        map.put(null,2);
        map.put(1, 3);
        map.put(1L, 3);
        map.put(1F, 3);
        map.put(new test(), 3);
    }

}

class test {

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
