import java.util.*;

public class stringsplit {
    // static void prinstr(String str[]) {
    //     for (int i = 0; i < str.length; i++) {
    //         System.out.print(i + " ");
    //     }
    }

    public static void main(String[] args) {
        Scanner jk = new Scanner(System.in);
        String s = jk.nextLine();
        String h[] = s.split(" ");
        //  by split you can split any String >>>
        String k[]=s.split("*");
        // prinstr(h);
        // prinstr(k);

    }
}
