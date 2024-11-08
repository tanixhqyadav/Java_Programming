import java.util.Scanner;
public class operator2 {
    public static void main(String[] args){
        Scanner z=new Scanner(System.in);
        System.out.println("enter Three number");
        int s=z.nextInt();
        int u=z.nextInt();
        int x=z.nextInt();
        int larger;
        if((s>u) && (s>x)){
            larger=s;
        }
        else if((u>s) && (u>x)){
            larger=u;
        }
        else{
            larger=x;
        }
        System.out.println("larger number among three is"+larger);

    }
}
