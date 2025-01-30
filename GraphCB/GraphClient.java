import java.util.*;
public class GraphClient {
    public static void main(String[] args) {
        GraphBasic g=new GraphBasic(7);
        g.AddEdge(1, 2, 4);
        g.AddEdge(1, 4, 7);
        g.AddEdge(2, 3, 4);
        g.AddEdge(4, 3, 1);
        g.AddEdge(5, 4, 2);
        g.AddEdge(5, 6, 7);
        g.AddEdge(5,7,4);
        g.AddEdge(6,7,3);
        g.noofEdge();
        g.Display();
        // g.removeEdge(0, 0);
    }
}
