import java.util.Scanner;
class subtraction{
int sub (int a, int b){
    return a-b;
}
}
public class methods2 {
    public static void main(String[] args) {
        subtraction s=new subtraction();
        Scanner g=new Scanner(System.in);
        int x=g.nextInt();
        int y=g.nextInt();
        int res=s.sub(x,y);
        System.out.println(res);

    }
    
}
