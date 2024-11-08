import org.w3c.dom.Node;

public class recursivelyprintingll {
    public static class Node {
        int data;
        Node Next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void recuriveprintll(Node head) {
        if(head==null) return;
        System.out.print(head.data+" ");
        recuriveprintll(head.Next);
    }
    public static void ultarecuriveprintll(Node head) {
        if(head==null) return;
        recuriveprintll(head.Next);
        System.out.print(head.data+" ");
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(9);
        Node c = new Node(100);
        Node d = new Node(89);
        Node e = new Node(7);
        a.Next = b;
        b.Next = c;
        c.Next = d;
        d.Next = e;
        recuriveprintll(a);
        System.out.println();
        ultarecuriveprintll(a);
    }
}
