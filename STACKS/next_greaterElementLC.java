import java.util.Stack;

public class next_greaterElementLC {
    public static void main(String[] args) {
        removeConsecutiveSubsequence jk = new removeConsecutiveSubsequence();
        // remove res add
        int ar[] = { 1, 5, 3, 2, 1, 6, 3, 4 };
        jk.show(ar);
        int n = ar.length;
        int res[] = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(ar[n - 1]);
        for (int i = n - 2; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= ar[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = st.peek();
            }
            st.push(ar[i]);
        }
        jk.show(res);
    }
}