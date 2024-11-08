import java.util.Scanner;
public class conditional7 {
    public static void main(String[] args){
        Scanner gfh=new Scanner(System.in);
        System.out.println("enter quatratic equation");
        System.out.println("enter value of a");
        int a=gfh.nextInt();
        System.out.println("enter value of b");
        int b=gfh.nextInt();
        System.out.println("enter value of c");
        int c=gfh.nextInt();
        System.out.println("postive root");
        float d=(b*b)+(4*a*c)/(2*a);
        System.out.println(d);
        System.out.println("negative root");
        float e=(b*b)-(4*a*c)/(2*a);
        System.out.println(e);
    }
}
