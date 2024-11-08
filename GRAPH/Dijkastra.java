import java.util.*;
import java.util.ArrayList;

import java.util.PriorityQueue;
class Pair implements Comparable<Pair>{
    int node;
    int distance;
    public Pair(int n, int d){
        this.distance=d;
        this.node=n;
    }
    @Override
    public int compareTo(Pair x){
        return this.distance-x.distance;
    }
}
public class Dijkastra{
    public static int[] dijkastra(int v, ArrayList<ArrayList<ArrayList<Integer>>> adj, int s){
        int dis[]=new int[v];
        Arrays.fill(dis,(int)1e9);
        dis[s]=0;
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        pq.add(new Pair(s,dis[s]));
        while(!pq.isEmpty()){
            Pair op=pq.poll();
            int curr_node=op.node;
            int curr_dis=op.distance;
            for(ArrayList<Integer> nbrs:adj.get(curr_node)){
                int nbr_node=nbrs.get(0);
                int nbr_wt=nbrs.get(1);
                if(dis[nbr_node]> curr_dis+nbr_wt){
                    dis[nbr_node]=curr_dis+nbr_wt;
                    pq.add(new Pair(nbr_node, dis[nbr_node]));
                }
            }
        }
        return dis;
    }
    public static void main(String[] args) {
        
    }
}