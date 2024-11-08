import java.util.ArrayList;
import java.util.LinkedList;

public class adjancenyListrep {
    public static void main(String[] args) {
        int vertices = 5; // Number of vertices
        ArrayList<LinkedList<Integer>> adjacencyList = new ArrayList<>(vertices);

        for (int i = 0; i < vertices; i++) {
            adjacencyList.add(new LinkedList<>());
        }

        addEdge(adjacencyList, 0, 1);
        addEdge(adjacencyList, 0, 4);
        addEdge(adjacencyList, 1, 2);
        addEdge(adjacencyList, 1, 3);
        addEdge(adjacencyList, 1, 4);
        addEdge(adjacencyList, 2, 3);
        addEdge(adjacencyList, 3, 4);

        printGraph(adjacencyList, vertices);
    }

    // Add edge
    public static void addEdge(ArrayList<LinkedList<Integer>> adjacencyList, int source, int destination) {
        adjacencyList.get(source).add(destination);
    }

    public static void printGraph(ArrayList<LinkedList<Integer>> adjacencyList, int vertices) {
        for (int i = 0; i < vertices; i++) {
            System.out.print("Vertex " + i + ":");
            for (Integer node : adjacencyList.get(i)) {
                System.out.print(" -> " + node);
            }
            System.out.println();
        }
    }
}
