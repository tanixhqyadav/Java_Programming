import java.util.*;
public class setInterface {
    // !A collection that contains no duplicate elements.
    static void hashset(){
        HashSet<Integer> hsh=new HashSet<>();
        // !elements in a Hash set are unique and unordered
        //! hash set is using Hashing internally a hash or can be called secret key  is generated 
        hsh.add(1);
        hsh.add(1);
        hsh.add(1);
        hsh.add(67);
        hsh.add(3);
        hsh.add(4);
        hsh.add(78);
        hsh.add(5);
        System.out.println(hsh);// */ order is entirely random
        // System.out.println(hsh.size());
        // System.out.println(hsh);
    }
    static void LnkHashset(){
        LinkedHashSet<Integer> lhsh=new LinkedHashSet<>();
        //! it keeps the order same
        lhsh.add(1);
        lhsh.add(1);
        lhsh.add(1);
        lhsh.add(67);
        lhsh.add(3);
        lhsh.add(4);
        lhsh.add(78);
        lhsh.add(5);
        System.out.println(lhsh);
        //* Order of intertion is preserved in Linked hash set  */
        //! linkedHashSet = Linkedlist + HashTable
    }
    static void treeHshset(){
        TreeSet<Integer> trset=new TreeSet<>();
        // sorted data
        // it internally uses a Self Balancing binary search tree
        trset.add(1);
        trset.add(1);
        trset.add(1);
        trset.add(67);
        trset.add(3);
        trset.add(4);
        trset.add(78);
        System.out.println(trset);
    }

    public static void main(String[] args) {
        // hashset();
        // LnkHashset();
        treeHshset();

    }
}
