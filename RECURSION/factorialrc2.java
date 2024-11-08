import java.util.Scanner;
public class factorialrc2 {
    static int  fact(int n){
        if(n==0){
            return 1;
        } 
        return n*fact(n-1);

    } 
    public static void main(String[] args) {
        Scanner kl=new Scanner(System.in);
        System.out.println("enter any number:: ");
        int n=kl.nextInt();
        System.out.println(fact(n));
    }
}
