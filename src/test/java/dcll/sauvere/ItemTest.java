package dcll.sauvere;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by Benoît Sauvère on 09/02/15.
 *
 * @author Benoît Sauvère
 */
public class ItemTest extends TestCase {

    /**
     *
     */
    @Test
    public void testItemGetterSetterAndConstructor() {

        String testString = "Test Item";
        String testStringSetter = "Test Item 2";

        Item itemTestes = new Item(testString);
        assertEquals(itemTestes.getItem(), testString);

        itemTestes.setItem(testStringSetter);
        assertEquals(itemTestes.getItem(), testStringSetter);

    }

}
