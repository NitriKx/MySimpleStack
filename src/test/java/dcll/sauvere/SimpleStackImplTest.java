package dcll.sauvere;

import junit.framework.TestCase;

import java.util.EmptyStackException;

/**
 * Created by Benoît Sauvère on 09/02/15.
 *
 * @author Benoît Sauvère
 */
public class SimpleStackImplTest extends TestCase {

    /**
     *
     */
    public void testSimpleStackImpl() {

        SimpleStack ss = new SimpleStackImpl();

        assertEquals(ss.getSize(), 0);
        assertTrue(ss.isEmpty());

        Item newItem = new Item("Test1");
        ss.push(newItem);

        assertEquals(ss.peek(), newItem);
        assertFalse(ss.isEmpty());
        assertEquals(ss.getSize(), 1);

        assertEquals(ss.pop(), newItem);
        assertTrue(ss.isEmpty());
        assertEquals(ss.getSize(), 0);

        ss.push(newItem);

    }

    /**
     *
     */
    public void testEmptyStackPeek() {

        SimpleStack ss = new SimpleStackImpl();

        try {
            ss.peek();
            fail("Exception has not been thrown");
        } catch (EmptyStackException e) {
        }
    }

    /**
     *
     */
    public void testEmptyStackPop() {

        SimpleStack ss = new SimpleStackImpl();

        try {
            ss.pop();
            fail("Exception has not been thrown");
        } catch (EmptyStackException e) {
        }
    }
}
