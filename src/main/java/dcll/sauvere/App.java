package dcll.sauvere;

/**
 * Hello world!
 *
 * @author Benoît Sauvère
 *
 */
public final class App {

    /**
     *
     */
    private App() { }

    /**
     *
     * @param args program arguments
     */
    public static void main(final String[] args) {
        SimpleStack s = new SimpleStackImpl();
        s.push(new Item("qdsmlkd"));
    }
}
