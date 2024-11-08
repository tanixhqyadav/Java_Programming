import java.util.*;//generally everything is imported in this case:: 

public class stringbasicfunction1 {
    public static void main(String[] args) {
        Scanner jk = new Scanner(System.in);
        String str = "HELWLO WORLD";
        System.out.println(str);
        String j = jk.next();
        System.out.println(j);
        System.out.println(str.length());
        System.out.println(str.charAt(3));
        // for(int i=0;i<str.length();i++){
        // System.out.print(str.charAt(i)+" ");
        // }
        System.out.println(str.indexOf("WORLD"));
        String hk = "ABC";
        String lk = "ABC";
        String gh = "bnm";
        System.out.println(hk.compareTo(lk));// giving 0 because bot are zero
        System.out.println(hk.compareTo(gh));// giving -ve value
        // values are giving by comparing them lexogtraphically order
        System.out.println(gh.compareTo(hk));// giving positive value 
    }
}