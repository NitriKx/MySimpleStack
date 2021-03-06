package dcll.sauvere;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Benoît Sauvère on 09/02/15.
 *
 * @author Benoît Sauvère
 */
public class SimpleStackImpl implements SimpleStack {

    /**
     * The items holder.
     */
    private List<Item> itemCollection;

    /**
     * Create the simple stack.
     */
    public SimpleStackImpl() {
        this.itemCollection = new LinkedList<Item>();
    }


    @Override
    public boolean isEmpty() {
        return getSize() <= 0;
    }


    @Override
    public int getSize() {
        return this.itemCollection.size();
    }


    @Override
    public void push(final Item item) {
        this.itemCollection.add(item);
    }


    @Override
    public Item peek() throws EmptyStackException {
        if (getSize() == 0) {
            throw new EmptyStackException();
        }
        return this.itemCollection.get(this.itemCollection.size() - 1);
    }

    @Override
    public Item pop() throws EmptyStackException {
        if (getSize() == 0) {
            throw new EmptyStackException();
        }
        return this.itemCollection.remove(this.itemCollection.size() - 1);
    }

}
