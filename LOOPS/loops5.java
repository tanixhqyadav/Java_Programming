import java.util.Scanner;
public class loops5 {
    public static  void main(String[] args){
        Scanner fg=new Scanner(System.in);
        System.out.println("enter upper limit:");
        int u=fg.nextInt();
        System.out.println("enter lower limit:");
        int l=fg.nextInt();
        for(int i=u;i<=l;i++){
            int flag=0;
            for(int j=2;j<=i;j++){
                if(i%j==0)
                flag++;
            }
            if(flag==1)
            System.out.print(" "+i);
        }
    }
    
}
