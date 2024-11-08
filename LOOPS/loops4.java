import java.util.Scanner;
public class loops4 {
    public static void main(String[] args){
        Scanner fg=new Scanner(System.in);
        System.out.println("enter:");
        int s=fg.nextInt();
        int d=s;
        int g=0;
        while(d!=0){
            int f=d%10;
            int p=1;
            for(int i=1;i<=f;i++)
            p=p*i;
            g=g+p;
            d=d/10;
        }
        if(g==s)
        System.out.println("Strong");
        else
        System.out.println("No");
    }
    
}
