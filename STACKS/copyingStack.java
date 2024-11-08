import java.util.*;

public class copyingStack {
    public static void main(String[] args) {
        Scanner jk = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        // System.out.println("enetr the number of elements : ");
        // int n = jk.nextInt();
        // for (int i = 1; i <= n; i++) {
        // int x = jk.nextInt();
        // st.push(x);
        // }
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        Stack<Integer> rt = new Stack<>();
        while (st.size() > 0) {
            int x = st.peek();
            rt.push(x);
            st.pop();
            // rt.push(st.pop()); it wil also work
        }
        System.out.println(rt);// here reverse of the copied to rt from st

        // we are using another stack to reverse it 
        Stack<Integer> gt = new Stack<>();
        while(rt.size()>0){
            gt.push(rt.pop());
        }
        System.out.println(gt);// can als o be done using recursion with same space and tc 
    }
}
