import java.util.*;
public class listInterface{
    static void VectExp(){
        Vector<Integer> vc =new Vector<>();
        vc.add(1);
        vc.add(1);
        vc.add(1);
        System.out.println(vc.size());
        vc.clear();
        System.out.println(vc.size());
    }
    static void StackExp(){
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(1);
        st.push(1);
        st.push(1);
        System.out.println(st);
        System.out.println(st.remove(1));
        System.out.println(st);
    }
    static void ArraylistExp(){
        ArrayList<Integer> op=new ArrayList<>();
        op.add(8);
        System.out.println(op.size());
        System.out.println(op.contains(8));
    
    }
    static void LLExp(){
        LinkedList ll=new LinkedList<>();
        ll.add(1); 
        ll.add(1); 
        ll.add(1);
        System.out.println(ll);
        // ll.isEmpty();
    }
    public static void main(String[] args) {
        //StackExp();
        // LLExp();
        VectExp();
    }
}
