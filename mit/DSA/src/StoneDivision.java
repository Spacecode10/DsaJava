import java.util.*;

public class StoneDivision {

    public static int maxMoves(int n, List<Integer> divisors) {
        // Sort divisors in descending order to maximize the reduction of pile size
        Collections.sort(divisors, Collections.reverseOrder());
        int moves = 0;

        // Perform divisions as long as we can find a divisor in S
        while (true) {
            boolean moveMade = false;
            for (int d : divisors) {
                if (n % d == 0) {
                    n /= d;  // Split the pile
                    moves++;  // Increment the move count
                    moveMade = true;
                    break;
                }
            }
            if (!moveMade) {
                // No further moves possible
                break;
            }
        }

        return moves;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();  // Number of queries

        for (int i = 0; i < q; i++) {
            int n = scanner.nextInt();  // Initial pile size
            int m = scanner.nextInt();  // Number of divisors in S
            List<Integer> divisors = new ArrayList<>();

            for (int j = 0; j < m; j++) {
                divisors.add(scanner.nextInt());
            }

            System.out.println(maxMoves(n, divisors));
        }

        scanner.close();
    }
}
