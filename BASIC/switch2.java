import java.util.Scanner;
// program to make calculator :::=====------
public class switch2 {
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        System.out.println("Enter any  operator");
        char op = f.next().charAt(0);
        System.out.println("enter number 1");
        int a = f.nextInt();
        System.out.println("enter number 2");
        int b = f.nextInt();
        int re;
        switch (op) {
            case '+': {
                re = a + b;
                System.out.println(re);
                break;
            }
            case '-': {
                re = a - b;
                System.out.println(re);
                break;
            }
            case '*': {
                re = a * b;
                System.out.println(re);
                break;
            }
            case '/': {
                float dfg = a / b;
                System.out.println(dfg);
            }
            default:
                System.out.println("invalid case");

        }

    }
}
