import java.util.Scanner;
public class loops12 {
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int a=g.nextInt();
        int b=g.nextInt();
        int v=1;
        for(int i=1;i<=b;i++){
            v=v*a;
        }
        System.out.println(v);
    }
}
