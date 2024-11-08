import org.w3c.dom.Node;
Class Node{
    int item;
    int left, right;
    public Node(int item){
        key=item;
        left=right=null;
    }
}

public class tree_implemenatation{
    
    public static void main(String[] args) {
        Node root=new Node(3);
        Node first =new Node(5);
        root.left=first;
        Node second=new Node(6);
        root.right=second;
        System.out.println(root.item);
    }
}