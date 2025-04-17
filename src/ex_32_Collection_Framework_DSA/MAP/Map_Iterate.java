package ex_32_Collection_Framework_DSA.MAP;

import java.util.HashMap;
import java.util.Map;

public class Map_Iterate {
    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap();
        map.put("id", 1);
        map.put("id2", 2);
        map.put("id3", 34);
        map.put("id4", null);
        map.put("id5", null);
        map.put(null, 100);

       for(Map.Entry<String ,Integer> a: map.entrySet()){
           System.out.println(a.getKey()+"-"+a.getValue());
       }
    }


}
