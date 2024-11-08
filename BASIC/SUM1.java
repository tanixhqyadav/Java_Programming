import java.util.Scanner;
public class SUM1 {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        System.out.println("enter first number");
        int a=z.nextInt();
        System.out.println("enter 2nd number");
        int b=z.nextInt();
        int sum=a+b;
        System.out.println("sum of two numbers is "+(sum));
    }
}
