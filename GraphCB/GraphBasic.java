import java.util.*;
public class GraphBasic{
    private HashMap<Integer, HashMap<Integer,Integer>> map;
    public GraphBasic(int v){
        map=new HashMap<>();
        for(int i=1;i<=v;i++){
            map.put(i,new HashMap<>());
        }
    }
    public void AddEdge(int v1,int v2,int cost){
        map.get(v1).put(v2,cost);
        map.get(v2).put(v1,cost);
    }
    public boolean ContainsEdge(int v1, int v2){
        return map.get(v1).containsKey(v2);
    }
    public boolean ContainsVertex(int v1){
        return map.containsKey(v1);
    }
    public int noofEdge(){
        int no=0;
        for(int vtx:map.keySet()){
            no+=map.get(vtx).size();
        }
        return no/2;
    }
    public void removeEdge(int v1,int v2){
        map.get(v1).remove(v2);
        map.get(v2).remove(v1);
    }
    public void removevertex(int v1){
        for(int nbrs:map.get(v1).keySet()){
            map.get(nbrs).remove(v1);
        }
        map.remove(v1);
    }
    public void Display(){
        for(int vt:map.keySet()){
            System.out.println(vt+" "+map.get(vt));
        }
    }
}