import java.util.*;
public class Maping {
    public static void main(String[] args) {
        // mapEx();
        linkedhshmp();
    }
    static void mapEx(){
        Map<Integer,String> mp =new HashMap<>();
        mp.put(2,"aman");
        mp.put(1,"rohan");
        mp.put(3, "rahul");
        mp.put(1, "tanishq");//! the past value id over-ridden by thw new value
        mp.putIfAbsent(6, "xo_xo");
        System.out.println(mp.entrySet());// it also print the whole map

        // System.out.println(mp);
        // System.out.println(mp.get(2));
        System.out.println(mp.containsKey(5));
        System.out.println(mp.keySet());
        System.out.println(mp.values());
        //! Itreating over a key set in a map
        for(Integer i : mp.keySet()){
            System.out.println(i);
        }

        // ! Itreate over key value mapping
        for( var i: mp.entrySet()){
            System.out.println(i);
        }
    }
    static void linkedhshmp(){
        //* in linked hashmap the order of intertion is preserved */
        Map<Integer,String> mp =new LinkedHashMap<>();
        mp.put(2,"aman");
        mp.put(1,"rohan");
        mp.put(3, "rahul");
        mp.put(1, "tanishq");
        System.out.println("Hello git hub Repo");
        System.out.println(mp);
    }
}
