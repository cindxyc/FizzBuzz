public class Multiples {

    public static int multiples(int n, int a, int b) {

        int count = 0;
        for (int i = 1; i <= n; i++) {

            // Find out which numbers divide i.
            boolean divisibleBy3 = i % a == 0;
            boolean divisibleBy5 = i % b == 0;

            if (divisibleBy3 || divisibleBy5) {

                count++;

            }
        }
        return count;
    }
}