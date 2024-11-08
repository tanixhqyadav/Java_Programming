import java.util.Stack;

public class basicStacks {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(99);
        st.push(99);
        st.push(99);// tc =O(1)

        // System.out.println(st);

        st.pop();// removing upper element no arguement req Tc=O(1)
        // System.out.println(st);

        System.out.println(st.size());// tells the size

        System.out.println(st.peek());// returns the top most element tc= O(1)

        System.out.println(st.empty());// return boolean
        // System.out.println(st.capacity());

    }
}
