package dcll.sauvere;

/**
 * Created by Benoît Sauvère on 09/02/15.
 *
 * @author Benoît Sauvère
 */
public class Item {

    /**
     * The item stored as string.
     */
    private String item;

    /**
     *
     * @param itemAsString the item as String
     */
    public Item(final String itemAsString) {
        this.item = itemAsString;
    }

    /**
     *
     * @param itemAsString the new item as String
     */
    public final void setItem(final String itemAsString) {
        this.item = itemAsString;
    }

    /**
     *
     * @return the current item as String
     */
    public final String getItem() {
        return item;
    }
}
