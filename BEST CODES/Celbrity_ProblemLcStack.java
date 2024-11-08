import java.util.Stack;

public class Celbrity_ProblemLcStack{
    public static void main(String[] args) {
        int[][] arr = { { 0, 1, 1, 1 }
        , { 1, 0, 1, 1 }
        , { 0, 0, 0, 0 }, 
        { 1, 1, 1, 0 } };
		System.out.println(Celebrity(arr));
    }
    public static int Celebrity(int arr[][]){
        Stack<Integer> op=new Stack<>();
        for(int i=0;i<arr.length;i++){
            op.push(i);
        }
        while(op.size()>1){
            int a=op.pop();
            int b=op.pop();
            if(arr[a][b]==1){
                op.push(b);
            }
            else{
                op.push(a);
            }
        }
        int candidate=op.pop();
        for(int i=0;i<arr.length;i++){
            if(i==candidate){
                continue;
            }
            if(arr[candidate][i]==1 || arr[i][candidate]==0){
                return -1;
            }
        }
        return candidate;
    }
}