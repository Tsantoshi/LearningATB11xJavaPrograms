package ex_32_Collection_Framework_DSA.MAP;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class Ex_Hashtable {
    public static void main(String[] args) {
        // Map - K, V,  null values allows

        // Hashtable - Synchronised, Slow and Legacy Class - Thread Safe
        // T1, T2 - they will use one by one.

        Hashtable<Integer,String> ht1 = new Hashtable<>();
        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3, "three");
       // ht2.put(3, null);  // java.lang.NullPointerException
       // ht2.put(null, null);
        System.out.println(ht1);
        System.out.println("  ---- ");


        HashMap<Integer,String> ht2 = new HashMap<>();
        // Not Thread Safe, or Not Synchronised
        ht2.put(1, "one");
        ht2.put(2, "two");
        ht2.put(3, "three");
        ht2.put(3, null);
        ht2.put(null, null); // null values allowed
        System.out.println(ht2);

        System.out.println("  ---- ");

        Enumeration<Integer> e = ht1.keys();
            while (e.hasMoreElements()){
                System.out.println(e.nextElement());
            }
        System.out.println("---------");
        Enumeration<String> s = ht1.elements();
        while (s.hasMoreElements()){
            System.out.println(s.nextElement());
        }
        }

    }

