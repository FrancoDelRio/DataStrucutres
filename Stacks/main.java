package Stacks;

public class main {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(9);
        stack.push(4);
        stack.push(7);

        stack.getHeight();
        stack.getTop();
        stack.printStack();
    }
}
