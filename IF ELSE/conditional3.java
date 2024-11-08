import java.util.Scanner;
public class conditional3 {
    public static void main(String[] args){
        Scanner c=new Scanner(System.in);
        int fg=c.nextInt();
        String d;
        d=fg%2==0 ? "even": "Odd";
        System.out.println(d);
    }
}
