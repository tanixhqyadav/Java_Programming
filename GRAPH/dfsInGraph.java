import java.util.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class dfsInGraph {
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

        graphdfs(graph, vertices);
    }
    public static void graphdfs(ArrayList<ArrayList<Integer>> graph, int v){
        boolean  visited[]=new boolean[v];
        for(int i=0;i<v;i++){
            if(!visited[i]){
                dfs(i,graph,v,visited);
            }
        }
    }
    public static void dfs(int i,ArrayList<ArrayList<Integer>> graph, int v,boolean visited[]){
        System.out.println(i);
        visited[i]=true;
        ArrayList<Integer> l=graph.get(i);
        for(Integer e:l){
            if(!visited[e]){
                dfs(e, graph, v, visited);
            }
        }
    }
}
