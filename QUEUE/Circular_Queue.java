import java.util.*;
public class Circular_Queue {
    private int[] array;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public Circular_Queue(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];
        this.front = -1;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public int size() {
        return size;
    }

    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue element: " + element);
            return;
        }

        if (isEmpty()) {
            front = 0;
        }

        rear = (rear + 1) % capacity;
        array[rear] = element;
        size++;
        System.out.println("Enqueued: " + element);
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }

        int removedElement = array[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % capacity;
        }
        size--;
        System.out.println("Dequeued: " + removedElement);
        return removedElement;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No front element.");
            return -1;
        }
        return array[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Nothing to display.");
            return;
        }

        System.out.print("Circular Queue: ");
        if (front <= rear) {
            for (int i = front; i <= rear; i++) {
                System.out.print(array[i] + " ");
            }
        } else {
            for (int i = front; i < capacity; i++) {
                System.out.print(array[i] + " ");
            }
            for (int i = 0; i <= rear; i++) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Circular_Queue queue = new Circular_Queue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.display();

        queue.dequeue();
        queue.dequeue();
        queue.display();

        queue.enqueue(60);
        queue.enqueue(70);
        queue.display();
    }
}
