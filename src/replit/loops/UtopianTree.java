package replit.loops;

public class UtopianTree {

    public static void main(String[] args) {

        /*
        The Utopian Tree grows exactly 1 cm for the first three years, and after that it grows by 2 cm every year. Show 10 years of growth of the Utopian Tree.

Output:

year 1 - growth 1 cm
tree size: 1cm

year 2 - growth 1 cm
tree size: 2cm

year 3  - growth 1 cm
tree size:3cm

year 4 - growth 2 cm
tree size: 5cm

year 5 - growth 2 cm
tree size: 7cm

year 6 - growth 2 cm
tree size: 9cm

... until you reach year 10
         */


        // 1 sm first 3 year
        // 2 sm after 3 year

        int growThreeYear = 1;
        int growNextThreeYear = 2;

        int growCount = 0;
        int year = 0;

        for (year = 1; year <= 10; year++) {

            if (year == 1 || year == 2 || year == 3) {

                growCount++;

                System.out.println("year " + year + " - " + " growth " + growThreeYear + "cm");
                System.out.println("tree size: " + growCount + "cm");

            } else {

                growCount += 2;

                System.out.println("year " + year + " - " + " growth " + growNextThreeYear + "cm");
                System.out.println("tree size: " + growCount + "cm");


            }


        }
    }
}