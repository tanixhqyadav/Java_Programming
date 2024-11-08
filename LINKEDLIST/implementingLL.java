public class implementingLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    // here it self is a DATA STRUCTURE<< making a ll and inserting elements and having its own features
    public static class linkedlist{
        // this method is working as we are inserting a element to a new node and then adding to the linkedlist initally it is empty 
        Node head=null;
        Node tail=null;
        void insertAtEnd(int val){
            Node temp= new Node(val);
            //intially the head is empty and tail too thats why writing this if else condition
            if(head==null){
                head=temp;
                tail=temp;
            }else{
                tail.next=temp;
                tail=temp;
            }
        }
        void display(){
            Node flag=head;
            while(flag!=null){
                System.out.print(flag.data+" ");
                flag=flag.next;
            }
            System.out.println();
        }
        int size(){
            int c=0;
            Node r=head;
            while(r!=null){
                c++;
                r=r.next;
            }
            return c;
        }
        void insertAtStart(int val){
            Node temp= new Node(val);
            //intially the head is empty and tail too thats why writing this if else condition
            if(head==null){
                head=temp;
                tail=temp;
            }else{//non empty
                temp.next=head;
                head=temp;
            }
        }
        void insertAt(int index, int da){
            Node x=new Node(da);
            Node go=head;
            if(index==size()){// because here it means you are ending at end of the linked list
                insertAtEnd(da);
                return ;
            }
            else if(index==0){
                insertAtStart(da);
                return ;
            }
            for(int i=1;i<=index-1;i++){
                go=go.next;                
            }
            x.next=go.next;
            go.next=x;
        }
        int getAt(int index){
            Node go=head;
            if(index==0){
                return go.data;
            }
            for(int i=1;i<=index;i++){
                go=go.next;                
            }
            return go.data;
        }
    }
    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        ll.insertAtStart(7);
        ll.insertAtStart(78);
        ll.insertAtEnd(6);
        ll.insertAtEnd(9);
        ll.insertAtEnd(34);
        ll.display();
        System.out.println(ll.size());
        ll.insertAt(0, 10);
        ll.display();
        System.out.println(ll.getAt(0));
    }
}
