import java.util.Scanner;

public class plaindrome {
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        System.out.println("enter any number");
        int s=x.nextInt();
        int d=0;
        while(s!=0){
            d=d*10+s%10;
            s=s/10;
        }
        if(s==d){
            System.out.println("Plaindrome"+s);
        }
        else{
            System.out.println("NOT");
        }
    }
}
