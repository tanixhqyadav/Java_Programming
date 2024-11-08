import java.util.Scanner;
public class loops9 {
    public static void main(String[] args){
        Scanner b=new Scanner(System.in);
        int f=b.nextInt();
        int s=0;
        while(f!=0){
            f=f/10;
            s++;
        }System.out.println(s);
    }
}
