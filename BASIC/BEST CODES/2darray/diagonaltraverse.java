import java.util.*;
public class diagonaltraverse{
    public static void main(String[] args) {
        int ar[][]={{1,2,3},{4,5,6},{7,8,9}};
        Diagonal(ar);
    }
    public int [] void Diagonal(int arr[][]){
        int n=arr.length;
        int m=arr[0].length;
        int ans[]=new int [n*m];
        int i=0;
        for(int d=0;d<n+m-1;d++){
            int r=0,c=0;
            if(d<m){
                c=d;
            }
            else{
                c=m-1;
                r=d-m+1;
            }
            ArrayList<Integer> ll=new ArrayList<>();
            while(r<n && c>=0){
                ll.add(arr[r][c]);
                r++;
                c--;
            }
            if(d%2==0){
                Collections.reverse(ll);
            }
            for(int j=0;j<ll.size();j++){
                ans[i]=ll.get(j);
                i++;
            }
        }
        return ans
    }
}
