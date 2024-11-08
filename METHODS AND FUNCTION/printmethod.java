import java.util.Scanner;

public class printmethod {
    static void prrr(int a, String j) {
        System.out.print(j + "\n");
        System.out.print(a);
    }

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        String d = n.nextLine();
        int k = n.nextInt();
        prrr(k,d);
    }
}
