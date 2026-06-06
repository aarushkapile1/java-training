public class Stacks {
public static void main(String[] args) {
    java.util.Stack<Integer> Stack = new java.util.Stack<>();
    Stack.push(10);
    Stack.push(20);

    System.out.println("Stack: " + Stack);
    System.out.println("Top element: " + Stack.peek());
}
}
