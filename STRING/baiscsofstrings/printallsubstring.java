import java.util.Scanner;

public class printallsubstring {
    public static void main(String[] args) {
        Scanner hj = new Scanner(System.in);
        String s = hj.next();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                System.out.print(s.substring(i, j) + " ");
            }
        }
    }
}
