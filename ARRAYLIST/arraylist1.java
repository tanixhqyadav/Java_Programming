import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

// alternate class
import java.util.Collections;

public class arraylist1 {
    static void reversearraylist(ArrayList<Integer> list) {
        int m = list.size();
        for (int j = m - 1; j >= 0; j--) {
            System.out.print(list.get(j) + " ");
        }
    }

    public static void main(String[] args) {
        Scanner lk = new Scanner(System.in);
        ArrayList<Integer> l1 = new ArrayList<>();
        int m = lk.nextInt();
        for (int i = 0; i < m; i++) {
            int n = lk.nextInt();
            l1.add(n);
        }
        System.out.println("using function made my me");
        reversearraylist(l1);
        System.out.println();
        System.out.println("now by using collection class");
        Collections.reverse(l1);
        System.out.print(l1 + "," + " \n");
        System.out.println("Sorting >> ");
        Collections.sort(l1);// working ASCENDING
        System.out.println(l1 + "*" + "\n");
        System.out.println("Descinding Order>> ");
        Collections.sort(Collections.reverseOrder(l1));
        System.out.println(l1 + " & ");

    }
}
