import java.util.*;

public class LinkedListImplement {
    public class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public class queueL {
        Node head = null;
        Node tail = null;
        int size = 0;

        public void add(int x) {
            Node temp = new Node(x);
            if (head == null) {
                head = temp;
                tail = temp;
                size++;
            } else {
                tail.next = temp;
                tail = temp;
                size++;
            }
        }

        public int remove() {
            if (head == null) {
                System.out.println("Queue is empty!");
                return -1;
            } else {
                int l = head.val;
                head = head.next;
                size--;
                return l;
            }
        }

        public int peek() {
            if (head == null) {
                System.out.println("Queue is empty!");
                return -1;
            }
            return head.val;
        }

        public boolean isEmpty() {
            return head == null;
        }

        public int size() {
            return size;
        }

        public void display() {
            Node t = head;
            while (t != null) {
                System.out.print(t.val + " ");
                t = t.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        LinkedListImplement li = new LinkedListImplement();
        queueL bt = li.new queueL();
        bt.add(1);
        bt.add(9);
        bt.add(8);
        bt.add(5);
        bt.add(4);
        bt.display();
        bt.remove();
        bt.display();
        System.out.println(bt.size());
        System.out.println(bt.peek());
    }
}
