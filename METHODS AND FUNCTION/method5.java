import java.util.Scanner;
class function{
    int factorail(int x){
        int f=1;
        for(int i=1;i<=x;i++)
        f*=i;
        return f;
    }
}
class combo{
    function  j= new function();
    int combination(int k,int y){
        int n=j.factorail(k);
        int d=j.factorail(k-y)*j.factorail(y);
        return n/d;
    }
}
public class method5 {
    public static void main(String[] args) {
        Scanner kl=new Scanner(System.in);
        combo mn=new combo();
        System.out.println("enter comibation");    
        int g=kl.nextInt();
        int l=kl.nextInt();
        System.out.println(g+"C"+l);
        System.out.println("Result:--  "+mn.combination(g, l));
    }
}
