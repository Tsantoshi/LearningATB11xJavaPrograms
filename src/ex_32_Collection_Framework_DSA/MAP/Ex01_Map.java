package ex_32_Collection_Framework_DSA.MAP;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Ex01_Map {
    public static void main(String[] args) {

        Map m1 = new HashMap();
        // Map is key and value pair
        // name -> santoshi
        m1.put("name", "Santoshi");
        m1.put("Id",101);
        m1.put("phoneNo", 123456789);
        System.out.println(m1);
        System.out.println("..........");

        Map m2 = new LinkedHashMap();
        m2.put("name", "Santoshi");
        m2.put("Id",101);
        m2.put("phoneNo", 123456789);
        System.out.println(m2);

        System.out.println("...........");

        Map m3 = new TreeMap();
        // Map is key - value
        // name : pramod,
        // rollno : 1
        // phone : 9876543210
        m3.put("firstname","pramod");
        m3.put("lastname","dutta");
        m3.put("rollno",1);
        m3.put("phone",987654321);
        System.out.println(m3);
        // {phone=987654321, name=pramod, rollno=1}
    }
}
