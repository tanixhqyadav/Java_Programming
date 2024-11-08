import java.util.Scanner;
class factorial{
    public int fact(int x){
        int f=1;
        for(int i=1;i<=x;i++)
        f=f*i;
        return f;
    }
}
public class methods3 {
    public static void main(String[] args) {
        Scanner j=new  Scanner(System.in);
        factorial fa=new factorial();
        System.out.println("Enter Any Number::--");
        int t=j.nextInt();
        System.out.println("factorial="+fa.fact(t));
    }
}
