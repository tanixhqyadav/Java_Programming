
public class ArrayImplementation {
    public static class Stack {
        private int arr[] = new int[10];
        private int idx = 0;

        void push(int x) {
            if (isFull()) {
                System.out.println("Stack is Full!");
            }
            arr[idx] = x;
            idx++;
        }

        int pop() {
            if (idx == 0) {
                System.out.println("Stcak is empty");
            }
            int t = arr[idx - 1];
            arr[idx - 1] = 0;
            idx--;
            return t;
        }

        int peak() {
            if (idx == 0) {
                System.out.println("Stcak is empty");
            }
            return arr[idx - 1];
        }

        int size() {
            return idx;
        }

        boolean isEmpty() {
            if (idx == 0)
                return true;
            else
                return false;
        }

        boolean isFull() {
            if (idx == arr.length)
                return true;
            else
                return false;
        }

        int capacity() {
            return arr.length;
        }

        void display() {
            for (int i = 0; i <= idx - 1; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
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
        System.out.println(jj.capacity());
        System.out.println(jj.isEmpty());
        System.out.println(jj.isFull());
    }
}
