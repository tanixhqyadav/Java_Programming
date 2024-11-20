public class gridvsdp{
    public static void main(String[] args) {
        int ar[]={3,7,1,2};
        int dp[][]=new int[ar.length][ar.length];
        System.out.println(st(ar, 0, ar.length-1));
    }
    public static int st(int lr[],int i, int j){
        if(i>j){
            return 0;
        }
        if(i+1==j){
            return Math.max(lr[i],lr[j]);
        }
        int a=lr[i]+Math.min(st(lr,i+2,j),st(lr, i+1, j-1));
        int b=lr[i]+Math.min(st(lr,i+1,j-1),st(lr, i, j-2));
        return Math.max(a, b);
    }
}