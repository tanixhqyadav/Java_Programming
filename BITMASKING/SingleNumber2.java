public class SingleNumber2{
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,2,5};
        System.out.println(Single_Number_2(arr));
    }
    public static int[] Single_Number_2(int ar[]){
        int ans=0;
        for(int i=0;i<ar.length;i++){
            ans^=ar[i];
        }
        int mask=(n&(~(n-1)));
        int a=0;
        for(int i=0;i<ar.length;i++){
            if((ar[i]&ans)!=0){
                a^=ar[i];
            }
        }
        int b=ans^a;
        return new int[] {a,b};
    }
}