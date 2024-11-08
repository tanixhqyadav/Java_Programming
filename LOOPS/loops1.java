import java.util.Scanner;

public class loops1 {
    public static void main(String[] args) {
        Scanner df = new Scanner(System.in);
        System.out.println("enter any integer");
        int g = df.nextInt();
        int h = g;
        int s = 0;
        while (h != 0) {
            s = s * 10 + h % 10;
            h = h / 10;
        }
        if (s == g)
            System.out.println("plaindrome");
        else
            System.out.println("no");
    }
}
