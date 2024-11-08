import java.util.Scanner;

public class random {
    public static void main(String[] args) {
        Scanner hj = new Scanner(System.in);
        StringBuilder str = new StringBuilder(hj.nextLine());
        System.out.println("before toggle case: " + str);
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;
            
            if (ascii >= 65 && ascii <= 90) { // Uppercase letters (A-Z)
                ascii += 32; // Convert to lowercase by adding 32
            } else if (ascii >= 97 && ascii <= 122) { // Lowercase letters (a-z)
                ascii -= 32; // Convert to uppercase by subtracting 32
            }
            
            char dh = (char) ascii;
            str.setCharAt(i, dh);
        }
        
        System.out.println("after toggle case: " + str);
    }
}
