import java.util.Scanner;
public class condtional5 {
    public static void main(String[] args) {
        Scanner f=new Scanner(System.in);
        int a=f.nextInt();
        int b=f.nextInt();
        String fg=(a>b) ? "greater"+a : "greater"+b;
        System.out.println(fg);
    }
}
