import java.util.Scanner;
public class condtional2 {
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        System.out.println("enter your age");
        int age=x.nextInt();
        if(age<12)
        System.out.println("Child");
        else if((age>12) && (age<18))
        System.out.println("Teenage");
        else
        System.out.println("Adult");
    }
}
