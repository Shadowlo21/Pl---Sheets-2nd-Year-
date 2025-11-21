public class Main {

    static class Queue {
        private int[] elements;
        private int size;
        public Queue() {
            elements = new int[8];
            size = 0;
        }
        public void enqueue(int v) {
            if (size >= elements.length) {
                int[] temp = new int[elements.length * 2];
                System.arraycopy(elements, 0, temp, 0, elements.length);
                elements = temp;
            }
            elements[size] = v;
            size++;
        }
        public int dequeue() {
            if (empty()) {
                throw new RuntimeException("Queue is empty!");
            }
            int first = elements[0];
            // shift elements to left
            for (int i = 1; i < size; i++) {
                elements[i - 1] = elements[i];
            }
            size--;
            return first;
        }
        public boolean empty() {
            return size == 0;
        }
        public int getSize() {
            return size;
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        for (int i = 1; i <= 20; i++) {
            q.enqueue(i);
        }
        while (!q.empty()) {
            System.out.print(q.dequeue() + " ");
        }
    }
}
