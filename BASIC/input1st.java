import java.util.Scanner;
// All about scanner class and taking input and output in JAVA 
public class input1st {
    public static void main(String[] args){
        Scanner i=new Scanner(System.in);//object is made here
        System.out.println("enter your name:--");
        String name=i.next();
        System.out.println("your name is printed:"+name);
        System.out.println("enter any number");
        int num1=i.nextInt();
        System.out.println("your number is printed"+ num1);
        System.out.println("enter any line");
        String line=i.nextLine();
        System.out.println("your line is"+line);
    }
}
