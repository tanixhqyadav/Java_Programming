import java.util.Scanner;
public class bitwise {
    public static void main(String[] args){
        Scanner fv=new Scanner(System.in);
        System.out.println("BITWISE OPERATOR");
        System.out.println("enter first number");
        int x=fv.nextInt();
        System.out.println("enter second input");
        int c=fv.nextInt();
        int d=x|c;
        System.out.println("bitwise or operator"+d);
        System.out.println("bitwise and operator"+(x&c));
        System.out.println("bitwise exor opeartor"+(x^c));
        System.out.println("leftshift bitwise operator"+(x<<3));
        System.out.println("rightshift bitwise operator"+(c>>3));
        System.out.println("bitwise nor"+(~x));
        System.out.println("bitwise nor"+(~c));


    }
}
