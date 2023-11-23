import java.util.Stack;

public class TwoStacks {

     private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    // Enqueue operation: Add a new element to the end of the queue
    public void enqueue(int x) {
        stack1.push(x);
    }

    // Dequeue operation: Remove the element from the front of the queue and return it
    public void dequeue() {
        if (stack2.isEmpty()) {
            transferStack1ToStack2();
        }

        if (!stack2.isEmpty()) {
            stack2.pop();
        }
    }

    // Print operation: Print the element at the front of the queue
    public int printFront() {
        if (stack2.isEmpty()) {
            transferStack1ToStack2();
        }

        if (!stack2.isEmpty()) {
            int front = stack2.peek();
            System.out.println(front);
            return front;
        }

        return -1; // Assuming -1 as an indicator of an empty queue
    }

    private void transferStack1ToStack2() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
    }

    public static void main(String[] args) {
        TwoStacks queue = new TwoStacks();

        // Example queries
        queue.enqueue(35);
        queue.enqueue(15);
        queue.printFront(); // Output: 35
        queue.dequeue();
        queue.printFront(); // Output: 15
    }
    
   
}
