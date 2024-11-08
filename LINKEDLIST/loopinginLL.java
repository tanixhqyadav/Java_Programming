import org.w3c.dom.Node;

public class loopinginLL {
    public static class Node {
        int data;
        Node Next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void printll(Node head) {
        Node x = head;
        while (x != null) {
            System.out.print(x.data + " ");
            x = x.Next;
        }
    }

    public static void insertatend(Node head,int val){
        Node tem=new Node(val);
        Node o=head;
        while(o.Next!=null){
            o=o.Next;
        }
        head.Next=tem;
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
        Node temp = a;
        System.out.println(a.data);
        // METHOD FOR FIXED LENGTH WHAT IF LENGTH IS NOT GIVEN THEN
        // for(int i=1;i<=5;i++){
        // System.out.print(temp.data+" ");
        // temp=temp.Next;
        // }/

        // HERE USE THE METHOD OF TAIL WHERE PRINT UNTILL WHERE NODE.NEXT=NULL
        insertatend(e, 99999);
        printll(a);
    }
}
