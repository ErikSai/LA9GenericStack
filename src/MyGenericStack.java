/*
Aaron Howe
LA9: Generic Stack
Check
 */

/**
 * Custom implementation of the generic stack class using the Stack interface
 * @author Aaron Howe
 * @version JDK17
 */
public class MyGenericStack<E> implements Stack<E> {

    // private field to instantiate the array for the generic stack
    private final E[] storage;
    // private field to return count of the number of elements
    private int count;

    /**
     * Default constructor for the generic stack using an array of size 10
     */
    @SuppressWarnings("unchecked")
    public MyGenericStack() {
        // casting the array of type generic to type object and instantiating a constant size
        storage = (E[]) new Object[10];
        count = 0;
    }

    /**
     * method to add an element at the top of the stack
     * @param element The value to be added to the top
     */
    @Override
    public void push(E element) {
        // check if the number of elements is equal to the size of the array, throw an error
        if (count == 10) {
            System.out.println("Stack is full");
        }
        // push the new element into the top of stack using the next available index of the array
        storage[count] = element;
        // increment the stack's element count
        count++;
    }

    /**
     * method to pop an element from the top of the stack
     * @return the element which has been popped
     */
    @Override
    public E pop() {
        // check if the stack is empty, throw an error
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        // create a temporary generic and assign it to the top-most element of the stack
        E element = storage[count - 1];
        // remove the element by setting it to null
        storage[count - 1] = null;
        // decrement the element count of the stack
        count--;
        return element;
    }

    /**
     * method to "peek" at an element to be removed without removing
     * @return the element
     */
    @Override
    public E peek() {
        // check if the stack is empty, throw an error
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        return storage[count - 1];
    }

    /**
     * method to check if the stack is empty
     * @return the empty stack
     */
    @Override
    public boolean isEmpty() {
        return count == 0;
    }
}
