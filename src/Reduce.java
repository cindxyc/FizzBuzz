public class Reduce {
    public static void main(String[] args) {

        int count = 0;
        int i = 100;
        while (i > 0) {

        // Find out which numbers divide i.
        boolean even = i % 2 == 0;

        if (even) {

            i /= 2;

        } else {

            i -= 1;

        }
            count++;
        }
        System.out.println(count);
    }
}
