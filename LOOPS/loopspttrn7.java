import java.util.Scanner;
public class loopspttrn7 {
    public static void main(String[] args) {
        Scanner g=new Scanner(System.in);
        System.out.println("Enter any number");
        int d=g.nextInt();
        int c=1;
        for(int i=1;i<=d;i++){
            for(int j=1;j<=i;j++){
                System.out.print(c++ +" ");
            }
            System.out.println();
        }
    }
}
