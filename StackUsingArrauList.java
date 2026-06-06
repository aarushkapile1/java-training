import java.util.ArrayList;

public class StackUsingArrauList {

    static class Stack {
        ArrayList<Integer> list = new ArrayList<>();

        public void push(int data) {
            list.add(data);
        }

        public int pop() {
            if (list.isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        public int peek() {
            if (list.isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);
        }

        public boolean isEmpty() {
            return list.isEmpty();
        }
    }

    public static void main(String[] args) {

        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Top Element: " + s.peek());

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
