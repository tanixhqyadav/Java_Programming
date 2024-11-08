import java.util.Stack;

public class reversing_st_Rc {
    public static void stack_ko_ulta(Stack<Integer> st){
        if(st.size()==1){
            return ;
        }
        int t=st.pop();
        stack_ko_ulta(st);
        end_mein_dal_do(st, t);
    }
    public static void end_mein_dal_do(Stack <Integer> st, int x){
        Stack<Integer> kk=new Stack<>();
        if(st.empty()){
            st.push(x);
            return;
        }
        kk.push(st.pop());
        end_mein_dal_do(st, x);
        st.push(kk.pop());
    }
    public static void main(String[] args) {
        Stack<Integer> ll=new Stack<>();
        ll.push(1);
        ll.push(2);
        ll.push(3);
        ll.push(4);
        ll.push(5);
        System.out.println(ll);
        stack_ko_ulta(ll);
        System.out.println(ll);
    }
}
