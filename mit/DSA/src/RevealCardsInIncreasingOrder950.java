import java.util.Arrays;
public class RevealCardsInIncreasingOrder950 {
    public static int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int[] res = new int[deck.length];
        boolean[] filled = new boolean[deck.length];
        boolean skip = false;
        int i = 0, j = 0;
        while(i < deck.length) {
            if(filled[j]) {
                j = (j + 1) % deck.length;
                continue;
            }

            if(skip) {
                skip = false;
            } else {
                res[j] = deck[i++];
                filled[j] = true;
                skip = true;
            }
            j = (j + 1) % deck.length;
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(deckRevealedIncreasing(new int[]{1,2,3,4,5})));
    }
}
