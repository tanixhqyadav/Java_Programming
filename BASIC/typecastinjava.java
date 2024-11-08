import java.util.Scanner;

public class typecastinjava {
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        int g = f.nextInt();
        char j = f.next().charAt(0);
        char h = (char) g;
        // int k=(int) j;
        System.out.println(h);
        System.out.println((int) j);
    }
}
