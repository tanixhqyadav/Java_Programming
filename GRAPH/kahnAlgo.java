import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class kahnAlgo{
    public static void main(String[] args) {
        
    }
    public boolean kahn(int v, ArrayList<ArrayList<Integer>> adj) {
        int inord[]=new int [v];
        for(int i=0;i<v;i++){
            for (int kl : adj.get(i)) {
                inord[kl]++;
            }
        }
        boolean vis[]=new boolean[v];
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<v;i++){
            if(inord[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            dfs(adj,q,q.poll(),inord,vis);
        }
        for(int i=0;i<v;i++){
            if(inord[i]!=0){
                return true;
            }
        }
        return false;
    }
    public static void dfs(ArrayList<ArrayList<Integer>> adj,Queue<Integer> q,int i, int inord[],boolean vis[]){
        vis[i]=true;
        ArrayList<Integer> l=adj.get(i);
        for(int el: l){
            inord[el]--;
            if(!vis[el] && inord[el]==0){
                dfs(adj,q,el,inord,vis);
            }
            
        }
    }
}