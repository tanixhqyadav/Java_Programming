import java.util.Random;

public class randomNo {
    public static void main(String[] args) {
        int si = 10;
        int ei = 100;
        Random rn = new Random();
        for (int i = 0; i < 10; i++) {
            int val = rn.nextInt(ei - si + 1) + si;
            System.out.print(val + " ");
        }
    }
}
