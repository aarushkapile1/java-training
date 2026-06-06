import java.util.ArrayList;

public class QueueUsingArrayList {

    static class Queue {
        ArrayList<Integer> list = new ArrayList<>();

        public boolean isEmpty() {
            return list.size() == 0;
        }

        public void add(int data) {
            list.add(data);
        }

        public int remove() {
            if (isEmpty()) {
                return -1;
            }

            int front = list.get(0);
            list.remove(0);
            return front;
        }

        public int peek() {
            if (isEmpty()) {
                return -1;
            }

            return list.get(0);
        }
    }

    public static void main(String[] args) {

        Queue q = new Queue();

        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println("Front Element: " + q.peek());

        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}