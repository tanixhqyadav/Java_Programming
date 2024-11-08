import java.util.*;
public class sqrt{
    // yha code break ki condition par hai jesi l<h hai vwese h print l krdia
    public static void main(String[] args) {
                int x=25;
                long l=0;
                long h= (long) x;
                while(l<=h){
                    long m=(l+h)/2;
                    long z=m*m;
                    if(z<=x){
                        l=m+1;
                    }
                    else{
                        h=m-1;
                    }
                    System.out.println(l+"  "+h);
                }
                
    }
}