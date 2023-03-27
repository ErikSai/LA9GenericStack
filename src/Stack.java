/**
 * This interface describes the simplest form of stack.
 */
public interface Stack<E> {
    /**
     * Add to the top of the stack.
     * @param element The value to be added to the top
     * of the stack
     */
    public void push(E element);
    /**
     * Remove from the top of the stack.
     * @return The value from the top of the stack
     */
    public E pop();
    /**
     * Peek at the top of the stack.
     * @return The value at the top of the stack
     */
    public E peek();
    /**
     * Check for elements in the stack.
     * @return True if the stack is empty
     */
    public boolean isEmpty();
}