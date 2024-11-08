import java.util.Scanner;
public class loops2 {
    public static void main(String[] args){
        Scanner yu=new Scanner(System.in);
        System.out.println("enter any integer");
        int n=yu.nextInt();
        int i=0,s=0;
        while(i<n){
            i++;
            s=s+i;
        }
        System.out.println(s);
    }
}
