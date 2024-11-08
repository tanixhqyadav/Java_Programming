public class random1 {
    static void dispaly(int ar[]){
        for(int h: ar){
            System.out.print(h+" ");
        }
    }
    static void swap(int ar[], int x ,int y){
        int t=ar[x];
        ar[x]=ar[y];
        ar[y]=t;
    }
    public static void main(String[] args) {
        int ar[]={10,5,6,7,8,9,3};
        dispaly(ar);
        System.out.println();
        int c=0;
        for(int i=0;i<ar.length-1;i++){
            if(ar[i]>ar[i+1]){
                c=i; break;
            }
        }
        int k=0;
        for(int i=ar.length-1;i>=1;i--){
            if(ar[i]<ar[i-1]){
                k=i;
                break;
            }
        }
        swap(ar, c, k);
        dispaly(ar);
    }
}
