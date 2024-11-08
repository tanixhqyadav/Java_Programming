public class rotatedhard {
    static boolean searchva(int ar[][],int t){
        int st=0;
        int end=ar.length-1;
        while(st<ar.length && end>=0){
            if(ar[st][end]==t){
                return true;
            }
            else if(ar[st][end]<t){
                st++;
            }
            else{
                end--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int ar[][]={{2,3,4,5},
                {10,11,12,13},
                {14,15,16,17},
                {18,19,20,21}
            };
        System.out.println(searchva(ar,99));
    }
}
