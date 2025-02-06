public class Setbit {
    public static void main(String[] args) {
        int n=84;
        int idx=4;
        System.out.println(setBit(n,idx));
        System.out.println(noOfSetBits(n));
        System.out.println(SetbitOp(n));
    }
    public static boolean setBit(int n,int idx){
        int mask=1<<idx;
        if((n&mask)!=0){
            return true;
        }
        return false;
    }
    public static int SetbitOp(int n){
        int count=0;
        while(n>0){
            n=n&(n-1);
            count++;
        }
        return count;
    }
    public static int noOfSetBits(int n){
        int count=0;
        while(n>0){
            if((n&1)==1){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
}
