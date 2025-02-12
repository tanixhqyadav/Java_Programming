public class AvengerAndEndGame {
    public static void main(String[] args) {
        int n=1000;
        int ar[]={2,3,5};
        System.out.println(avenger(3,ar));
    }
    public static int avenger(int n, int[] arr){
        int ans = 0;
        for(int i=1;i<(1<<n);i++){
            int setBits = setBit(i);
            if(setBits%2==0){
                ans -= Count_Div(arr,i,n);
            }else{
                ans += Count_Div(arr,i,n);
            }
        }
        return ans;
    }
    private static int Count_Div(int ar[],int i, int n){
        int p=1;
        int idx=0;
        while(i>0){
            if((i&1)==1){
                p*=ar[idx];
            }
            idx++;
            i=i>>1;
        }
        return n/p;
    }
    public static int setBit(int x){
        int count = 0;
        while(x>0){
            x = x & (x-1);
            count++;
        }
        return count;
    }
}
