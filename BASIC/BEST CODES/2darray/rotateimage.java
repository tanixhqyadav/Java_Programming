public class rotateimage {
    public static void rotate(int[][] ar) {
        int n=ar.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int t=ar[i][j];
                ar[i][j]=ar[j][i];
                ar[j][i]=t;
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=n-1;j>=0;j--){
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int ar[][]= {{1,2,3},
                    {4,5,6},
                    {7,8,9}};
        rotate(ar);
    }
}
