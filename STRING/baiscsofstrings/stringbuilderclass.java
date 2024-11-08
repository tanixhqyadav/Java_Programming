import java.util.*;
public class stringbuilderclass {
    public static void main(String[] args) {
        Scanner jk=new Scanner(System.in);
        StringBuilder str=new StringBuilder("hello");// default it is 16 but you can change the capacity too
        // str.append("world");
        System.out.println(str);
        // hello   >   mello
        str.setCharAt(0, 'm');
        System.out.println(str);
        // insert
        str.insert(2,'y');
        //meyllo
        System.out.println(str);
        //delete
        str.deleteCharAt(0);
        // eyllo
        System.out.println(str);
        StringBuilder er=new StringBuilder("tanishq");
        er.reverse();
        String s = "abcde";
        int l=s.length()-1;
        int i=0;
        StringBuilder rs = new StringBuilder();
        while (i != l) {
            char y = s.charAt(0);
            rs.append(s,i+1,l+1);
            rs.append(y);
            i++;
        }
        System.out.println(rs);

    }
}
