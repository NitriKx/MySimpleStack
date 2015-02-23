package dcll.sauvere;

import java.util.EmptyStackException;

/**
 * Created by Benoît Sauvère on 09/02/15.
 *
 * @author Benoît Sauvère
 */
public interface SimpleStack {

    /**
     * Tests if this stack is empty.
     * @return true if the stack is empty
     */
    boolean isEmpty();

    /**
     * Returns the number of items in this stack.
     * @return the number of items in this stack.
     */
    int getSize();

    /**
     * Pushes an item onto the top of this Stack.
     * null item is allowed.
     * @param item the item to add in the Stack, null is allowed
     */
    void push(Item item);

    /**
     * Looks at the object at the top of this stack without removing it from
     * the stack.
     * @return the first item of the Stack
     * @throws EmptyStackException if this stack is empty
     */
    Item peek() throws EmptyStackException;

    /**
     * Removes the object at the top of this stack and returns that object as
     * the value of this function.
     * @return the removed element
     * @throws EmptyStackException if this stack is empty
     */
    Item pop() throws EmptyStackException;
}
