import java.util.Scanner;

class aryan {
    String USername;
    int Rollno;
    String College;
    int Moblieno;   
}

public class classes1 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        aryan obj1 = new aryan();
        String u = n.nextLine();
        int m = n.nextInt();
        String g = n.nextLine();
        int d = n.nextInt();
        obj1.USername = u;
        obj1.Rollno = m;
        obj1.College = g;
        obj1.Moblieno = d;
        System.out.println(u);
        System.out.println(m);
        System.out.println(g);
        System.out.println(d);
    }
}
