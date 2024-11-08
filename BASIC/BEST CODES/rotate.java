public class rotate {
    public static void main(String[] args) {
        int ar[]={1,2,3,4,5,6,7};
        int k=3;
        rotata(ar, k);
        for(int v:ar){
            System.out.print(v+" ");
        }
    }
    static void rotata(int arr[],int k){
        k=k%arr.length;
        for(int j=1;j<=k;j++){
        int o=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            arr[i+1]=arr[i];
        }
        arr[0]=o;
    }
    }
}
