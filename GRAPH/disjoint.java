import java.util.*;
public class disjoint {
    public static Integer[] parent;
    public static Integer[] rank;
    public static int find(int n){
        if(parent[n]==n){
            return n;
        }
        return parent[n]=find(parent[n]);
    }
    public static void union(int u,int v){
        int ulpu=find(u);
        int ulpv=find(v);
        if(ulpu==ulpv){
            return;
        }
        if(rank[ulpu]>rank[ulpv]){
            parent[ulpv]=ulpu;
            rank[ulpu]++;
        }
        else{
            parent[ulpu]=ulpv;
            rank[ulpv]++;
        }
    }
    public static void initialize(int n) {
        parent=new Integer[n+1];
        for(int i=0;i<parent.length;i++){
            parent[i]=i;
            rank[i]=0;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        initialize(5);
        union(1, 2);
        union(3,4);
        union(2,5);
        System.out.println(Arrays.toString(parent));
    }
}