import java.util.*;

public class noofpalindromicsubstring {
    static String palindrome(String s){
        int i=0;
        int j=s.length()-1;
        int c=0;
        while(i<j){
            char h=s.charAt(i);
            char t=s.charAt(j);
            if(h==t){
                c++;
            }
            i++;
            j--;
        }
        if(c==s.length()/2){
            return s;
        }
        else {
            return null;
        }
    }
    public static void main(String[] args) {
        Scanner jk = new Scanner(System.in);
        int v=0;
        String st = jk.next();
        for (int i = 0; i < st.length(); i++) {
            for (int j = i + 1; j <=st.length(); j++) {
                System.out.print(st.substring(i, j) + " ");
                String mn=st.substring(i, j);
                if(palindrome(mn)!=null){
                    v++;
                }
            }
        }
        System.out.println(v);
    }
}
