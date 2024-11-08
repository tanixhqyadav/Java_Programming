import java.util.Stack;

public class displayingStUsingRc {
    public static void rev_Stack(Stack <Integer> st){
        Stack<Integer> tt=new Stack<>();
        if(st.size()==0){
            return;
        }
        tt.push(st.pop());
        rec_Stack(st);
        st.push(tt.pop());
    }
    public static void rec_Stack(Stack <Integer> st){
        if(st.size()==0){
            return;
        }
        int temp=st.pop();
        rec_Stack(st);
        System.out.print(temp+" ");
        st.push(temp);

    }
    public static void main(String[] args) {
        Stack<Integer> jt=new Stack<>();
        jt.push(1);
        jt.push(2);
        jt.push(3);
        jt.push(4);
        jt.push(5);
        rev_Stack(jt);
        System.out.println(jt);
    }
}
