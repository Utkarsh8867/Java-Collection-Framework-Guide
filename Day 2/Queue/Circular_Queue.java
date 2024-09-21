// package Day 2.Queue;

public class Circular_Queue {
    static class Queue {
        static int arr[];
        static int size;
        static int rear = -1;
        static int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;

        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;

        }

        public static boolean isFull() {
            return (rear + 1) % size == front;

        }

        public static void add(int data) {
            if (isFull()) {
                System.out.println("Queue is fulled");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

    }
}
