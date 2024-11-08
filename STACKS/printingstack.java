import java.util.Stack;

public class printingstack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        int ar[]=new int [st.size()];
        for(int i=ar.length-1;i>=0;i--){
            ar[i]=st.pop();
        }
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
    }
}
