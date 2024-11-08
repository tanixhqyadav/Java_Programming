import java.util.*;
public class stringbasicfunction2 {
    public static void main(String[] args) {
        Scanner jk=new Scanner(System.in);
        System.out.println("String functions  ::: " );
        String str="tanishq2yadav";
        String jkd="NAINCEYYADAV";
        String aa="abcd";
        String kj="ishq";
        System.out.println(str.contains(kj));//true 
        System.out.println(str.startsWith("t"));//true 
        System.out.println(str.endsWith("v"));//true 
        System.out.println(str.toUpperCase());
        System.out.println(jkd.toLowerCase());
        String hjk=str.concat(jkd);
        System.out.println(hjk);//same
        System.out.println(str.concat(jkd));//same
        System.out.println(str.substring(1, 5));// first one is included and last one is not included
        System.out.println(str.substring(4));//it means after this index
        System.out.println(aa.substring(1));



    }
}
