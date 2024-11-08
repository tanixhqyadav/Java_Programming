import java.util.*;
public class nextgraterwithEOneMoreBit{
    public static void main(String[] args) {
        Scanner jk=new Scanner(System.in);
        int n=jk.nextInt();
        int y=n+1;
        while(y!=n){
            int h=n&y;
            if(h==n){
                break;
            }
            y++;
        }
        System.out.println(y);
        
    }
}