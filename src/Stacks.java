import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        /*  Stack = LIFO data structure. Last-In First-Out
            stores object similar to a "vertical tower"
            push() to add to the top
            pop() to remove from the top
        */
        Stack<String> stack = new Stack<String>();

//        System.out.println(stack.isEmpty());

        stack.push("First");
        stack.push("Second");
        stack.push("Third");
        stack.push("Fourth");
        stack.push("Fifth");

//        String order = stack.pop();
//        System.out.println(stack.peek());
//        System.out.println(stack.search("Fifth"));

//        for (int i=0;i<1000000000;i++){
//            stack.push("Hello");
//        } //out of memory error - heap space

//        System.out.println(stack);

        /*
        Uses of stack
        1. undo/redo features in a text editor
        2. moving back/forward through browser history
        3. backtracking algorithms (maze, file directories)
        4. calling functions (call stack)
        */

    }
}
