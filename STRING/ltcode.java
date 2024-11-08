import java.util.*;

public class ltcode {

    public static void main(String[] args) {
        Scanner hj = new Scanner(System.in);
        String s = hj.next();
        String ans = "";
        int c = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == s.charAt(i)) {
                c++;
            } else {
                ans += s.charAt(i-1) + Integer.toString(c);
                c = 1;
            }

        }
        ans += s.charAt(s.length() - 1) + Integer.toString(c);
        System.out.println(ans);

    }
}
