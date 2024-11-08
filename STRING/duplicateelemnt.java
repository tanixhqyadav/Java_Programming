import java.util.*;
public class duplicateelemnt {
    static class hjk{
        static int bn(String s){
            char chr[]=s.toCharArray();
            int c=0;
            for(int i=0;i<chr.length-1;i++){
                for(int j=i+1;j<chr.length-1;j++){
                    if(chr[i]==chr[j]){
                    c++;
                    }
                }
            }
            return c;
        }
    }
    public static void main(String[] args) {
        Scanner hj=new Scanner(System.in);
        hjk n=new hjk();
        String s=hj.next();
        System.out.println("STRING "+s);
        System.out.println(n.bn(s));
    }
}
