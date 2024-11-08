import java.util.*;

// Class for the heap
class Heap {
	List<Integer> v;
	int n; // Size of the heap

	Heap(int i) {
		n = i;
		v = new ArrayList<Integer>(Collections.nCopies(n, 0));
	}
}

// Main class
public class heap {
	// Generic function to swap two integers
	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	// Returns the index of the parent node
	public static int parent(int i) {
		return (i - 1) / 2;
	}

	// Returns the index of the left child node
	public static int left(int i) {
		return 2 * i + 1;
	}

	// Returns the index of the right child node
	public static int right(int i) {
		return 2 * i + 2;
	}

	// Maintains the heap property
	public static void heapify(Heap h, int i) {
		int l = left(i), r = right(i), m = i;
		if (l < h.n && h.v.get(i) > h.v.get(l))
			m = l;
		if (r < h.n && h.v.get(m) > h.v.get(r))
			m = r;
		if (m != i) {
			Collections.swap(h.v, m, i);
			heapify(h, m);
		}
	}

	// Extracts the minimum element
	public static int extractMin(Heap h) {
		if (h.n == 0)
			return -1;
		int m = h.v.get(0);
		h.v.set(0, h.v.get(h.n - 1));
		h.n--;
		heapify(h, 0);
		return m;
	}

	public static int findKthSmallest(Heap h, int k) {
		for (int i = 1; i < k; ++i)
			extractMin(h);
		return extractMin(h);
	}

	public static void main(String[] args) {
		Heap h = new Heap(7);
		h.v = Arrays.asList(10, 50, 40, 75, 60, 65, 45);
		int k = 2;
		System.out.println(findKthSmallest(h, k));
	}
}
