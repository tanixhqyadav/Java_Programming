public class CBnumbers {
    static boolean iscbNUmber(long num){
        if(num==0 || num==1){
            return false;
        }
        int ar[]={2,3,5,7,11,13,17,19,23,29};
        for(int i=0;i<ar.length;i++){
            if(ar[i]==num){
                return true;
            }
        }
        for(int i=0;i<ar.length;i++){
            if(num%ar[i]==0){
                return false;
            }
        }
        return true;
    }
    static int countCB(String str){
        int c=0;
        boolean visited[]=new boolean[str.length()]; 
            for(int i=1;i<=str.length();i++){
                for(int j=i;j<=str.length();j++){
                    int k=j-i;
                    String kl=str.substring(k,j);
                    if(iscbNUmber(Long.parseLong(kl))&& Isvisited(visited,k,j-1)){
                        c++;
                        for(int loi=k;loi<=j-1;loi++){
                            visited[loi]=true;
                        }
                    }
                }
            }
            return c;
        }
        static boolean Isvisited(boolean visited[],int si,int ei){
            for(int i=si;i<=ei;i++){
                if(visited[i]==true){
                    return false;
                }
            }
            return true;
        }
    public static void main(String[] args) {
        int n=5;
        String lok="81615";
        // we need maximum thats why usibg approach of substirng length by length;
        // parse mathod is used for string to int or long any other datatype conversion>>>
        // int x=Integer.parseInt(s);
        System.out.println(countCB(lok));
    }
}
