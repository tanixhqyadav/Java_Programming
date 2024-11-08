import java.util.Scanner;

public class palindromestring {
    static String palindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        int c = 0;
        while (i < j) {
            char h = s.charAt(i);
            char t = s.charAt(j);
            if (h == t) {
                c++;
            }
            i++;
            j--;
        }
        if (c == s.length() / 2) {
            return s;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        Scanner jk = new Scanner(System.in);
        String s = jk.next();
        if (s.equals(palindrome(s))) {
            System.out.println("palindrome");
        } else {
            System.out.println("no ");
        }
    }
}
