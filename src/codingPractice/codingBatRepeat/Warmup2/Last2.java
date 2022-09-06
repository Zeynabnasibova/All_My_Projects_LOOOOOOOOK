package codingPractice.codingBatRepeat.Warmup2;

public class Last2 {

    public static void main(String[] args) {

    }


    public int last2(String str) {

        if (str.length() < 2) {

            return 0;
        } else {

            String end = str.substring(str.length() - 2);

            int count = 0;

// Check each substring length 2 starting at i
            for (int i = 0; i < str.length() - 2; i++) {

                String sub = str.substring(i, i + 2);

                if (sub.equals(end)) {

                    count++;
                }
            }

            return count;
        }
    }
}