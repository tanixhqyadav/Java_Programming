import java.util.Scanner;

public class condtional1 {
    public static void main(String[] args) {
        Scanner cv = new Scanner(System.in);
        System.out.println("enter any number");
        int c = cv.nextInt();
        if (c % 2 == 0)
            System.out.println("EVEN");
        else
            System.out.println("ODD");
    }
}
