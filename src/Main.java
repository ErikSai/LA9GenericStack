/**
 * Main class to run test cases for the MyStringStack and GenericStack classes
 */
public class Main {
    /**
     * Main method - application entry point
     * @param args command line arguments
     */
    public static void main(String[] args) {
// create and instance of the generic stack
        MyGenericStack<String> stack = new MyGenericStack<String>();
// push sample data to the stack
        stack.push("451");
// peek to read the top data element in the stack
        System.out.println("Stack's top element: " + stack.peek());
// push sample data to the stack
        stack.push("415");
// peek to read the top data element in the stack
        System.out.println("Stack's top element: " + stack.peek());
// push sample data to the stack
        stack.push("233");
// peek to read the top data element in the stack
        System.out.println("Stack's top element: " + stack.peek());
// push sample data to the stack
        stack.push("132");
// peek to read the top data element in the stack
        System.out.println("Stack's top element: " + stack.peek());
// push sample data to the stack
        stack.push("131");
// peek to read the top data element in the stack
        System.out.println("Stack's top element: " + stack.peek());
// while the stack is not empty, remove top element and print its value
        while (! stack.isEmpty()) {
            System.out.println("Stack element removed: " + stack.pop());
        }
        System.out.println("Stack is empty!");
    }
}

