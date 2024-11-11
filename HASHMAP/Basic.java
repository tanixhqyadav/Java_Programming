import java.util.*;

public class Basic {
    public static void hash_basics(){
    Map<Integer, String> map=new HashMap<>();
    map.put(1,"tanishq");
    map.put(1000,"madhav");
    map.put(999, "rohan");
    map.put(99, "n");
    map.put(1,"op");    
    System.out.println(map);
    System.out.println(map.keySet());
    System.out.println(map.values());
    map.replace(99, "hosiyar");
    map.remove(1000);
    System.out.println(map.containsKey(1));
    System.out.println(map.containsValue("rohan"));
    // System.out.println(map);
    System.out.println(map.entrySet());
    for(Integer i : map.keySet()){
        System.out.println("key = "+i+" Values  : "+map.get(i));
        // printinf changes
    }
    for(var ok: map.entrySet()){
        System.out.println(ok);
    }
    for(Map.Entry<Integer,String> e: map.entrySet()){
        System.out.print(e+" ");
    }
    }
        public static void main(String[] args) {
        hash_basics();
    }
}
