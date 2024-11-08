import java.util.*;
public class HashSetBasic{
    // ! Hashset provide uniqueness , it does not allow duplicate elements inside it
    // * Hashset can store only one value  
    public static void main(String[] args) {
        HashSet<Integer> hsh=new HashSet<>();
        hsh.add(190);
        hsh.add(199);
        hsh.add(190);
        hsh.add(190);
        System.out.println(hsh);
        System.out.println(hsh.contains(190));
        hsh.remove(190);
        System.out.println(hsh.size());
        hsh.add(78);
        hsh.add(99);
        hsh.add(7);
        for(int i:hsh){
            System.out.print(i+" ");
        }
    }
}