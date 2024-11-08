import java.util.*;

public class heapq {
    public static void main(String[] args) {
        ArrayList<Integer> heap = new ArrayList<>();
        // insert(5,heap);
        // insert(10,heap);
        // insert(15,heap);
        // insert(2,heap);
        // System.out.println(heap);
        // heap.add(60);
        // heap.add(5);
        // heap.add(10);
        // heap.add(20);
        // heap.add(50);
        // heap.add(25);
        // heapify(heap,0,heap.size()-1);
        // System.out.println(heap);
        // heap.add(2);
        // heap.add(5);
        // heap.add(10);
        // heap.add(20);
        // heap.add(50);
        // heap.add(25);
        // extractmin(heap);
        ArrayList<Integer> ll = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        ll.add(10);
        ll.add(7);
        ll.add(3);
        ll.add(12);
        ll.add(5);
        // extractmin(ll);
        // heapsort(ll, ans);
        // System.out.println(ans);

    }

    public static int parent(int x) {
        return (int) Math.floor((x - 1) / 2);
    }

    public static int left(int x) {
        return 2 * x + 1;
    }

    public static int right(int x) {
        return 2 * x + 2;
    }

    public static void insert(int x, ArrayList<Integer> heap) {
        heap.add(x);
        int curr = heap.size() - 1;
        int parent = parent(curr);
        while (parent >= 0 && heap.get(parent) > heap.get(curr)) {
            int temp = heap.get(parent);
            heap.set(parent, heap.get(curr));
            heap.set(curr, temp);
            curr = parent;
            parent = parent(curr);
        }
    }

    public static void heapify(ArrayList<Integer> heap, int i, int size) {
        int smallest = i;
        int left = left(i);
        int right = right(i);
        if (left <= size && heap.get(left) < heap.get(smallest)) {
            smallest = left;
        }
        if (right <= size && heap.get(right) < heap.get(smallest)) {
            smallest = right;
        }
        if (smallest != i) {
            int temp = heap.get(i);
            heap.set(i, heap.get(smallest));
            heap.set(smallest, temp);
            heapify(heap, smallest, size);
        }
    }

    public static void extractmin(ArrayList<Integer> heap) {
        int temp = heap.get(0);
        heap.set(0, heap.get(heap.size() - 1));
        heap.set(heap.size() - 1, temp);
        heapify(heap, 0, heap.size() - 2);
        System.out.println(heap.get(heap.size() - 1));
    }

    public static void decreaseKey(int i, ArrayList<Integer> heap) {
        int curr = i;
        int p = parent(curr);
        while (p >= 0 && heap.get(curr) < heap.get(p)) {
            int temp = heap.get(curr);
            heap.set(curr, heap.get(p));
            heap.set(p, temp);
            curr = p;
            p = parent(curr);
        }
    }

    public static void arrtoheap(ArrayList<Integer> ans) {
        for (int i = (ans.size() - 2) / 2; i >= 0; i--) {
            heapify(ans, i, ans.size() - 1);
        }
    }

    public static void heapsort(ArrayList<Integer> ll, ArrayList<Integer> ans) {
        int a = ll.size();
        for (int i = 0; i < a; i++) {
            extractmin(ll);
            ans.add(ll.get(ll.size() - 1));
            ll.remove(ll.size() - 1);
        }
    }
}