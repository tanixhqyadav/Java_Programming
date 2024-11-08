public class prct1{
    static int firxticc(int araa[], int t){
        int lo=0;
        int hi=araa.length-1;
        int ans=0;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(araa[mid]==t){
                ans=mid;
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int ar[]={5,5,5,6,7,8,9};
        int t=5;
        System.out.println(firxticc(ar, t));
    }
}