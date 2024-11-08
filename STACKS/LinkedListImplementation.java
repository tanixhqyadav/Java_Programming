import java.util.*;
public class LinkedListImplementation {
    public static class Node {// user Defined datatype
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public class Stack {// user Defined data Structure
        Node head = null;
        int size=0;

        void push(int x) {
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size() {
            return size;
        }

        int pop() {
            if (head == null) {
                System.out.println("EMPTY!!!!!!!!!!!!");
                return -1;
            }
            int g = head.val;
            head = head.next;
            return g;
        }

        int peak() {
            if (head == null) {
                System.out.println("EMPTY!!!!!!!!!!!!");
                return -1;
            }
            return head.val;
        }

        boolean isEmpty() {
            if (head == null)
                return true;
            else
                return false;
        }

    }

    public static void main(String[] args) {
        Stack jj = new Stack();
        jj.push(1);
        jj.push(2);
        jj.push(3);
        jj.display();
        System.out.println(jj.size());
        jj.pop();
        jj.display();
        System.out.println(jj.isEmpty());
    }
}
