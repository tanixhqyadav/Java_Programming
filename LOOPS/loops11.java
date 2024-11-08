import java.util.Scanner;

public class loops11 {
    public static void main(String[] args) {
        Scanner jk = new Scanner(System.in);
        int gh = jk.nextInt();
        int s = 0;
        for (int i = 0; i <= gh; i++) {
            if (i % 2 == 1) {
                s = s + i;
            } else {
                s = s - i;
            }
        }
        System.out.println(s);
    }

}
