import java.util.ArrayList;

public class Handshakes {
    static int func(boolean[] arr, int pairsRemaining) {
        if (pairsRemaining == 0) {
            return 1; // Base case: All pairs are made successfully
        }

        int count = 0;
        int firstFree = -1;

        // Find the first free person
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i]) {
                firstFree = i;
                break;
            }
        }

        if (firstFree == -1) return 0; // No free person found (shouldn't happen if pairsRemaining > 0)

        // Try pairing this first free person with each remaining person
        for (int j = firstFree + 1; j < arr.length; j++) {
            if (!arr[j]) { // Check if j is also unpaired
                // Pair firstFree and j
                arr[firstFree] = true;
                arr[j] = true;

                // Recursively try to pair the remaining people
                count += func(arr, pairsRemaining - 1);

                // Backtrack
                arr[firstFree] = false;
                arr[j] = false;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int N = 10; // Number of people seated in a circle, even number
        if (N % 2 != 0) {
            System.out.println("N must be even.");
            return;
        }

        boolean[] arr = new boolean[N];
        int totalWays = func(arr, N / 2);

        System.out.println("Total non-crossing handshake combinations: " + totalWays);
    }
}

