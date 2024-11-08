// ! topological sort in only applied to Directed Acyclic graph 
// Topological sorting is a dependency problem in which completion of one task depends 
// upon the completion of several other tasks whose order can vary. 
// * could be understand by course Scheluder and prerequists for Full Stack think and refer of example
// # Linear ordering in such a way that  if theer is  a  edge between u and v then u appers before V

import java.util.ArrayList;

public class topologicalSort{
    public static void main(String[] args) {
        
    }
    
    static int[] topoSort(int v, ArrayList<ArrayList<Integer>> adj) 
    {
        Stack<Integer> st=new Stack<>();
        boolean vis[]=new boolean[v];
        for(int i=0;i<v;i++){
            if(!vis[i]){
                dfs(adj,st,vis,i);
            }
        }
        int[] topo = new int[v];
        int index = 0;
        while (!st.isEmpty()) {
            topo[index++] = st.pop();
        }
        return topo;
    }
    public static void dfs(ArrayList<ArrayList<Integer>> adj , Stack<Integer> st , boolean vis[], int x){
        vis[x]=true;
        ArrayList<Integer> jk=adj.get(x);
        for(int el : jk){
            if(!vis[el]){
                vis[el]=true;
                dfs(adj,st,vis,el);
            }
        }
        st.push(x);
    }
}