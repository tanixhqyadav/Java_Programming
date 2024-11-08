import java.util.*;
public class InsertAtBottomInStack {
    public static void main(String[] args) {
        // can be done using another by emptying it util where you want element and
        // pushing the element and againg pushibg elemnt to previous stack
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(12);
        st.push(13);
        st.push(134);
        st.push(13);
        System.out.println(st);
        Stack<Integer> rt=new Stack<>();
        while(st.size()>0){
            rt.push(st.pop());
        }
        int x=9;
        st.push(x);
        while(rt.size()>0){
            st.push(rt.pop());
        }
        System.out.println(st);
    }
}
