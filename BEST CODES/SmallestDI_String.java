import java.util.Stack;

public class SmallestDI_String{
    public static void main(String[] args) {
        String op="IIIDIDDD";
        System.out.println(Construct(op));
    }
    public static String Construct(String str){
        int ans[]=new int[str.length()+1];
        Stack<Integer> st=new Stack<>();
        int count=1;
        for(int i=0;i<=st.length();i++){
            if(i==str.length() || str.charAt(i)=='I'){
                ans[i]=count;
                count++;
                while(!st.empty()){
                    ans[st.pop()]=count;
                    count++;
                }
            }
            else{
                st.push(i);
            }
        }
        String s="";
        for(int i=0;i<ans.length;i++){
            s=s+ans[i];
        }
        return s;
    }
}
