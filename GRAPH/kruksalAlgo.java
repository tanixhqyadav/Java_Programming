import java.util.*;
public class kruksalAlgo{
    static int res=0;
    static int parent[];
    static int rank[];
    public static int find(int n){
        if(parent[n]==n){
            return n;
        }
        return parent[n]=find(parent[n]);
    }
    public static void union(int x,int y,int op_bolte){
        int ulp=find(x);
        int vlp=find(y);
        if(ulp==vlp){
            return ;
        }
        else{
            res+=op_bolte;
            if(rank[vlp]>rank[ulp]){
                parent[ulp]=vlp;
                rank[ulp]++;
            }
            else{
                parent[ulp]=vlp;
                rank[vlp]++;
            }
        }
    }
    public static void main(String[] args) {
        int ar[][]={{0,1,2},{0,3,6},{1,3,8},{1,4,5},{1,2,3},{2,4,7}};
        int x=6;
        parent=new int[x];
        rank=new int[x];
        for(int i=0;i<x;i++){
            parent[i]=i;
            rank[i]=0;
        }
        Arrays.sort(ar,Comparator.comparingInt(a -> a[2]));
        for(int i=0;i<ar.length;i++){
            union(ar[i][0],ar[i][1],ar[i][2]);
        }
        System.out.println(res);
    }
}