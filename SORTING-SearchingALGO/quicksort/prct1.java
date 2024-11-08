public class prct1 {
    static void dispaly(int ar[]){
        for(int h: ar){
            System.out.print(h+" ");
        }
        System.out.println();
    }
    static void swap(int ar[],int x, int y){
        int ttt=ar[x];
        ar[x]=ar[y];
        ar[y]=ttt;
    }
    static int parti(int ar[]){
        int c=0;
        int k=0;
        for(int i=0;i<ar.length;i++){
            if(ar[i]<0){
                c++;
            }
            else{
                k++;
            }
        }
        int h=Math.max(c,k);
        return ar.length-h-1;
    }
    public static void main(String[] args) {
        // question segreste +ve and -ve sequence does not matter
        int araa[]={19 ,-20 ,7 ,-4 ,-13 ,11 ,-5 ,3 };
        dispaly(araa);
        int n=araa.length;
        int i=0,j=n-1;
        int pv=parti(araa);
        while(i<pv && j>pv){
            while (araa[i]<0) {
                i++;
            }
            while (araa[j]>0) {
                j--;
            }
            if(i<pv  && j>pv){
            swap(araa, i ,j);
            i++;
            j--;
            }
        }
        dispaly(araa);
    }
}
