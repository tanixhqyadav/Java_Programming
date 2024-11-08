import java.util.Scanner;
public class pttrn{
    public static void main(String[] args) {
        Scanner hj=new Scanner(System.in);
        System.out.println("Ebter any number");
        int n=hj.nextInt();
        int c=0;
        for(int i=0;i<n;i++){
            c++;
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int k=0;k<2*i+1;k++){
                if((k==0)||(k==(2*i+1)-1))
                System.out.print(c);
                else
                System.out.print("0");
            }
            System.out.println();
        }
    }
}