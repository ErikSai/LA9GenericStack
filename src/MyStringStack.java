/**
 * This class implements the simplest form of String stack.
 */
public class MyStringStack implements Stack<String> {

    // The storage for the values
    private String[] storage;
    // The count of active elements in the stack
    private int count;

    /**
     * Create a string stack with space for ten elements.
     */
    public MyStringStack() {
        storage = new String[10];
        count = 0;
    }


    /**
     * Add to the top of the stack.
     * @param element The value to be added to the top
     * of the stack
     */
    public void push(String element) {
        // check the preconditions
        if(count == 10) {
            throw new IllegalStateException("No room in stack");
        }
        // normal processing, add to the stack
        storage[count] = element;
        count++;
    }

    /**
     * Remove from the top of the stack.
     * @return The value from the top of the stack
     */
    public String pop() {
        // precondition check
        if(count == 0) {
            throw new IllegalStateException("Nothing in the stack");
        }
        // normal processing, remove from the stack
        count --;
        return storage[count];
    }

    /**
     * Peek at the top of the stack.
     * @return The value at the top of the stack
     */
    public String peek() {
        // precondition check
        if(count == 0) {
            throw new IllegalStateException("Nothing in the stack");
        }
        // normal processing, query the top of the stack
        // do not change the state of the stack
        return storage[count - 1];
    }

    /**
     * Check for elements in the stack.
     * @return True if the stack is empty
     */
    public boolean isEmpty() {
        return count == 0;
    }

}
