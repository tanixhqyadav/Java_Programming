import java.util.*;
public class Graph2{
    private HashMap<Integer, HashMap<Integer,Integer>> mp;
    public Graph2(int v){
        mp=new HashMap<>();
        for(int i=1;i<=v;i++){
            mp.put(i,new HashMap<>());
        }
    }
    public void AddEdge(int v1,int v2,int cost){
        mp.get(v1).put(v2,cost);
        mp.get(v2).put(v1,cost);
    }
    public  boolean hasPath(int src, int des,HashSet<Integer> visited){
        if(src==des){
            return true;
        }
        visited.add(src);
        for(int nbrs:mp.get(src).keySet()){
            if(!visited.contains(nbrs)){
                boolean ans=hasPath(nbrs,des,visited);
                if(ans){
                    return true;
                }
            }
        }
        return false;
    }
    public  void hasPathprint(int src, int des,HashSet<Integer> visited,String ans){
        if(src==des){
            System.out.println(ans+des);
            return ;
        }
        visited.add(src);
        for(int nbrs:mp.get(src).keySet()){
            if(!visited.contains(nbrs)){
                hasPathprint(nbrs, des, visited, ans+nbrs);
            }
        }
        visited.remove(src);
    }
    public boolean BFS(int src, int des){
        Queue<Integer> q=new LinkedList<>();
        HashSet<Integer> visited=new HashSet<>();
        q.add(src);
        while(!q.isEmpty()){
            // remove
            int h=q.poll();
            // ignore
            if(visited.contains(h)){
                continue;
            }
            // mark visited
            visited.add(h);
            // self work
            if(h==des){
                return true;
            }
            // Add unvisited
            for(int nbrs:mp.get(h).keySet()){
                if(!visited.contains(nbrs)){
                    q.add(nbrs);
                }
            }
        }
        return false;
    }

    public boolean DFS(int src, int des){
        Stack<Integer> st=new Stack<>();
        HashSet<Integer> visited=new HashSet<>();
        st.add(src);
        while(!st.isEmpty()){
            // remove
            int h=st.pop();
            // ignore
            if(visited.contains(h)){
                continue;
            }
            // mark visited
            visited.add(h);
            // self work
            if(h==des){
                return true;
            }
            // Add unvisited
            for(int nbrs:mp.get(h).keySet()){
                if(!visited.contains(nbrs)){
                    st.push(nbrs);
                }
            }
        }
        return false;
    }
    public void Display(){
        for(int vt:mp.keySet()){
            System.out.println(vt+" "+mp.get(vt));
        }
    }
    //! Connected graph if only one componenet
    // ! disconnected Graph more than one componnet
    // !Count the Componets 
    public void BFT(){
        Queue<Integer> q=new LinkedList<>();
        HashSet<Integer> visited=new HashSet<>();
        for(int src:mp.keySet()){
            if(visited.contains(src)){
                continue;
            }
            q.add(src);
                    while(!q.isEmpty()){
            // remove
                    int h=q.poll();
            // ignore
                    if(visited.contains(h)){
                        continue;
                    }
            // mark visited
                    visited.add(h);
            // self work
                    System.out.println(h);
            // Add unvisited
                for(int nbrs:mp.get(h).keySet()){
                    if(!visited.contains(nbrs)){
                        q.add(nbrs);
                    }
                }
            }
        System.out.println();
        }
    }
    public static void main(String[] args) {
        Graph2 g=new Graph2(7);
        HashSet<Integer> visited=new HashSet<>();
        g.AddEdge(1, 2, 4);
        g.AddEdge(1, 4, 7);
        g.AddEdge(2, 3, 4);
        g.AddEdge(4, 3, 1);
        g.AddEdge(5, 2, 2);
        g.AddEdge(5, 6, 7);
        g.AddEdge(5,7,4);
        g.AddEdge(6,7,3);
        System.out.println(g.hasPath(1, 6, visited));
        g.hasPathprint(1,6,visited,"");
        System.out.println(g.BFS(1,6));
        System.out.println(g.DFS(1,6));

        g.Display();
    }
}