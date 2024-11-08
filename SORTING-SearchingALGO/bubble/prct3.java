import java.util.Scanner;

public class prct3 {
    static String strsort(String x) {
        char[] charArray = x.toCharArray();
        int n = charArray.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (charArray[j] < charArray[i]) {

                    char temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;
                }
            }
        }

        return new String(charArray);
    }

    public static void main(String[] args) {
        Scanner hj = new Scanner(System.in);
        System.out.println("Enter String: ");
        String n = hj.nextLine();
        String sortedString = strsort(n);
        System.out.println("Sorted String: " + sortedString);
    }
}
