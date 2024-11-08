public class ArrayImplementation {
    public static class queue {
        static int f = -1;
        static int r = -1;
        static int ar[] = new int[100];
        static int size = 0;

        public static void add(int x) {
            if (r == ar.length - 1) {
                System.out.println("Queue is full !!");
                return;
            }
            if (f == -1)
                f = 0;
            ar[++r] = x;
            size++;
        }

        public static int remove() {
            if (size == 0) {
                System.out.println("Queue is empty !!");
                return -1;
            }
            int element = ar[f];
            f++;
            size--;
            return element;
        }

        public static int peek() {
            if (size == 0) {
                System.out.println("Queue is empty !!");
                return -1;
            }
            return ar[f];
        }

        public static int Size() {
            return size;
        }

        public static boolean isEmpty() {
            return size == 0;
        }
        public static void printQueue() {
            if (size == 0) {
                System.out.println("Queue is empty !!");
                return;
            }
            System.out.print("Queue: ");
            for (int i = f; i <= r; i++) {
                System.out.print(ar[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        queue qt = new queue();
        qt.add(1);
        qt.add(2);
        qt.add(3);
        qt.add(4);
        qt.add(5);
        qt.printQueue();
        System.out.println("Peek: " + qt.peek());
        qt.printQueue();
        System.out.println("Removed: " + qt.remove());
        qt.printQueue();
        System.out.println("Size: " + qt.Size());
        System.out.println("Is Empty: " + qt.isEmpty());
    }
}
