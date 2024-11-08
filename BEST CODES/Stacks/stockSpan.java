import java.util.Stack;

public class stockSpan {
    public static void main(String[] args) {
        int arra[] = { 30, 35, 40, 38, 35 };
        Cal_span(arra);
    }

    public static void Cal_span(int arr[]) {
        int ans[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[i] >= arr[st.peek()]) {
                st.pop();
            }
            if (!st.isEmpty()) {
                ans[i] = i - st.peek();
            } else {
                ans[i] = i + 1;
            }
            st.push(i);
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

}