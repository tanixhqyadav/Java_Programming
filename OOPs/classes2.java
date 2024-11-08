import java.util.Scanner;

class tanishq {
    int on;
    String e;
}

public class classes2 {
    public static void main(String[] args) {
        Scanner hj = new Scanner(System.in);
        System.out.println("this is a how we can acess a class inside a class ");
        System.out.print("Enter a string: ");
        String d = hj.nextLine();
        System.out.print("enter Any number : ");
        int y = hj.nextInt();
        tanishq j = new tanishq();
        j.e = d;
        j.on = y;
        System.out.println(j.e);
        System.out.println(j.on);
    }
}
