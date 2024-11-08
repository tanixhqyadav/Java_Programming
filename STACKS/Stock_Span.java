import java.util.Stack;

public class Stock_Span {
    public static void main(String[] args) {
        int ar[] = { 100, 80, 60, 70, 60, 75, 85 };
        Stack<Integer> ik = new Stack<>();
        int res[] = new int[ar.length];
        ik.push(0);
        res[0] = 1;
        for (int i = 1; i < ar.length; i++) {
            while (!ik.isEmpty() && ar[i] >= ar[ik.peek()]) {
                ik.pop();
            }
            if (ik.isEmpty()) {
                res[i] = i + 1;
            } else {
                res[i] = i - ik.peek();
            }
            ik.push(i);
        }
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
