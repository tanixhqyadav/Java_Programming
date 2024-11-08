import java.util.ArrayList;

public class basicarraylist {
    public static void main(String[] args) {
        //Integer i=new Integer( 3); this way in wrapper  class is deprecetd.
        ArrayList<Integer> l1=new ArrayList<Integer>();// once you have witten at left side then no need to in right side  
        //ArrayList<Boolean> l2=new ArrayList<>();
        //ArrayList<Float> l3=new ArrayList<>();
        // Add a new element>>>
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(9);
        // get an element of index i =0
        System.out.println(l1.get(0));

        // print through for loop
        for(int i=0;i<l1.size();i++)
        System.out.print(l1.get(i)+" ");
        System.out.println();

        
        // Print th array list directly>>
        System.out.print(l1);//[5,6 7,9]


        // Adding any elemet at any index
        l1.add(0,100);
        System.out.print(l1);

        // Modifying an element at i
        l1.set(2, 999);

        // removing an element at i
        l1.remove(2);
        System.out.print(l1);

        // removing  an element e
        l1.remove(Integer.valueOf(7));

        // if any value doesnot exist it return boolean
        System.out.println(l1.remove(Integer.valueOf(7)));

        // check if any elemnt exist>>
        boolean ans=l1.contains(89);
        System.out.println(ans);

        // If You Did not specify class ,you any put anything inside in l>>

        Arraylist l2=new  ArrayList();
        l2.add("tauahau");
        l2.add(999);
        System.out.println(l2);


    }

}
