import java.util.*;

public class noofspaces {
    static int spaces(String s) {
        char chr[] = s.toCharArray();
        int c = 0;
        for (int i = 0; i < chr.length; i++) {
            if (chr[i] == ' ') {
                c++;
            }
        }
        return c;

    }

    public static void main(String[] args) {
        function ob=new function();
        Scanner hj = new Scanner(System.in);
        System.out.println("enter any String   : ");
        String s = hj.nextLine();
        System.out.println("Spaces in this sentencse ==  " + spaces(s));
    }
}