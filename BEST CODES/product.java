public class product{
    public static void main(String[] args) {
        int p[]={1,2,3,4};
        int j[]=pro(p);

        for( int l=0;l<j.length;l++){
            System.out.print(j[l]+" ");
        }
    }
    static int [] pro(int arr[]){
        int n=arr.length;
        int left[]=new int[n];
        left[0]=1;
        for(int i=1;i<arr.length;i++){
            left[i]=arr[i-1]*left[i-1];
        }
        int right[]=new int[n];
        right[n-1]=1;
        for(int j=n-2;j>=0;j--){
            right[j]=arr[j+1]*right[j+1];
        }
        int ans[]=new int [n];
        for(int i=0;i<n;i++){
            ans[i]=left[i]*right[i];
        }
        return ans;

    }
}