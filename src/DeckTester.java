/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */

        String[] rank = {"one", "two"};
        String[] suit = {"spade", "heart", "club"};
        int[] value = {1, 2};

        Deck aDeck = new Deck(rank, suit, value);
        System.out.println(aDeck);
        System.out.println(aDeck.isEmpty());
        System.out.println(aDeck.size());


        System.out.println(aDeck.deal());

    }
}
