import java.util.Scanner;
public class contional6 {
    public static void main(String[] args) {
        Scanner f=new Scanner(System.in);
        int a=f.nextInt();
        int b=f.nextInt();
        int c=f.nextInt();
        String gh=((a>b) && (a>c)) ? ((b>a)&&(b>c)) ?  "greater"+a : "greater"+b : "greater"+c; //wrong done
        System.out.println(gh);
    }
}
