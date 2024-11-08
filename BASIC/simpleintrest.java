import java.util.Scanner;
public class simpleintrest {
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        System.out.println("enter Principle");
        int p=x.nextInt();
        System.out.println("Enter Rate");
        int r=x.nextInt();
        System.out.println("enter Time");
        int t=x.nextInt();
        float f=(p*r*t)/100;
        System.out.println("SIMPLE INTREST IS "+f);

    }
}
