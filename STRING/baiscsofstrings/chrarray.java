
import java.util.*;

public class chrarray {
    public static void main(String[] args) {
        Scanner hj = new Scanner(System.in);
        String s = hj.next();
        char chr[] = s.toCharArray();
        int c=0;
        for (int i = 0; i < chr.length; i++) {
            System.out.print(chr[i] + " ");
            if(chr[i]=='a'){
                c++;
            }
        }
        System.out.println(c);

    }
}
