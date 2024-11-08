import java.util.*;
public class practise{
    public static void main (String args[]) {
        Scanner jk=new Scanner(System.in);
        int n=jk.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=2*n;k>2*i-1;k--){
                System.out.print("*");
            }
            System.out.println();
            
        }

    }
}