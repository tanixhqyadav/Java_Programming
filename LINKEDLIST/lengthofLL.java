public class lengthofLL {
    static int c = 0;

    public static class Node {
        int data;
        Node Next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void recuriveLength(Node head) {
        if (head == null)
            return;
        c++;
        recuriveprintll(head.Next);
    }

    public static int ItrativeLength(Node head) {
        while (head != null) {
            head = head.Next;
            c++;
        }
        return c;
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
        // System.out.println(recuriveLength(a));
        System.out.println(condtional8);
        System.out.println();
        System.out.println(ItrativeLength(a));
    }
}
