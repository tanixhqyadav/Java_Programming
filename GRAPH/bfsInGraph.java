import java.util.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bfsInGraph {
    public static void addEdge(ArrayList<ArrayList<Integer>> graph, int source, int destination) {
        graph.get(source).add(destination);
    }
     public static void main(String[] args) {
        int vertices = 6;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>(vertices);

        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        addEdge(graph, 0, 1);
        addEdge(graph, 0, 4);
        addEdge(graph, 1, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 1, 4);
        addEdge(graph, 2, 3);
        addEdge(graph, 3, 4);
        addEdge(graph, 5, 4);

        graphbfs(graph, vertices);
    }
    public static void graphbfs(ArrayList<ArrayList<Integer>> graph, int v){
        boolean  visited[]=new boolean[v];
        for(int i=0;i<v;i++){
            if(!visited[i]){
                bfs(i,graph,v,visited);
            }
        }
    }
    public static void bfs(int i,ArrayList<ArrayList<Integer>> graph, int v,boolean visited[]){
        visited[i]=true;
        Queue<Integer> q=new LinkedList();
        System.out.println(i);
        q.add(i);
        while(!q.isEmpty()){
            int x=q.poll();
            ArrayList<Integer> l=graph.get(x);
            for(Integer e:l){
                if(!visited[e]){
                    visited[e]=true;
                    bfs(e,graph,v,visited);
                    q.add(e);
                }
            }
        }
    }
}
