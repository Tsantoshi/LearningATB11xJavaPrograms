package ex_32_Collection_Framework_DSA.MAP;

import java.util.HashMap;
import java.util.Map;

public class Ex_HashMap {
    public static void main(String[] args) {
//One null key is allowed, and multiple null values are allowed.
        Map map = new HashMap();
        map.put("id1",1);
        map.put("id2",2);
        map.put("id",2);
        map.put("id",2); // In a HashMap, keys are unique.
        // When you use put() with a key that already exists, it replaces the previous value.
        map.put("id3",34);
        map.put("id4",34);
        map.put("id4",null);
        map.put("id5",null);
        map.put(null,102);
        map.put(null,103);
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("id2"));
        System.out.println(map.containsValue(99));

        System.out.println(map.keySet());
        System.out.println(map.values());

        System.out.println(map.get("id3"));
    }
}
