public class basicsofLL{
    public static class Node{
        int data;// Value 
        Node next;//address of next Node
        Node(int data){//CONUSTRATOR 
            this.data=data;
        }
    }
    

    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(3);
        Node c=new Node(9);
        Node d=new Node(8);
        Node e=new Node(16);
        //5 -> 3 -> 9-> 8-> 16 it should be connected 
        // System.out.println(a.next);
        // 5 3 9 8 16// 
        a.next=b;// here b ka address a ke andr dal diya hai   toh connect hogye 5->3
        // System.out.println(a.data);//5
        // System.out.println(a.next.data);// b ka data 3
        // System.out.println(b.data);// b ka data 3
        // System.out.println(a);
        // System.out.println(a.next);//same a.next =b 
        // System.out.println(b);//same bmj  
        b.next=c;
        c.next=d;
        d.next=e;// now the linklist is connected
        System.out.println(e.next);
    }
}