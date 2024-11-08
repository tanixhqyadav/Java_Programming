import java.util.Scanner;
class hjk{
    static void eveodd(int x){
        if(x%2==0)
        System.out.println("even");
        else
        System.out.println("odd");
    }
}
public class loops16 {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        hjk o=new hjk();
        System.out.println("enter the no of element:  ");
        int h=k.nextInt();
        for(int i=0;i<h;i++){
            int l=k.nextInt();
            o.eveodd(l);
        }
    }
}
