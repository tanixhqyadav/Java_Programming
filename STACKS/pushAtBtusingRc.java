import java.util.Stack;

public class pushAtBtusingRc {
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
    public static void end_mein_hta_do(Stack <Integer> st){
        if(st.size()==1){
            st.pop();
            return;
        }
        int t=st.pop();
        end_mein_hta_do(st);
        st.push(t);
    }
    public static void main(String[] args) {
        Stack<Integer> jt=new Stack<>();
        jt.push(1);
        jt.push(2);
        jt.push(3);
        jt.push(4);
        jt.push(5);
        int x=8;
        end_mein_dal_do(jt,x);
        System.out.println(jt);
        end_mein_hta_do(jt);
        System.out.println(jt);
    }
}
