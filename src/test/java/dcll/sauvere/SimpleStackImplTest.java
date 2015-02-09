package dcll.sauvere;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by benoit on 09/02/15.
 */
public class SimpleStackImplTest extends TestCase {

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

}
