import java.util.Scanner;
public class swap {
    public static void main(String[] args){
        Scanner c=new Scanner(System.in);
        System.out.println("enter first number");
        int d=c.nextInt();
        System.out.println("enter second number");
        int a=c.nextInt();
        int temp=d;
        d=a;
        a=temp;
        System.out.println("after swapping::::-----");
        System.out.println("first number"+d);
        System.out.println("second number"+a);

    }
}
