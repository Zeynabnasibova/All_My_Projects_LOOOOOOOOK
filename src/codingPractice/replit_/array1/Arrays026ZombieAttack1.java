package codingPractice.replit_.array1;
import java.util.Scanner;
import java.util.Arrays;

public class Arrays026ZombieAttack1 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        //TODO. Write you code below this line.


        System.out.println("Day 0 " + Arrays.toString(inhabitants));

        for(int i = 0; i < inhabitants.length; i++){

            int count = 0;

            for(int j = 0; j < inhabitants.length; j++){


                inhabitants[j] /= 2;

                if(inhabitants[j] == 0){

                    count++;

                }

            }

            System.out.println("Day " + (i + 1) + " " + Arrays.toString(inhabitants));
            if(count == inhabitants.length){

                break;
            }
        }
        System.out.println("---- EXTINCT ----");

    }
}
/*
An array inhabitants represents cities and their respective populations. For example, the following arrays shows 8 cities and their respective populations:

[3, 6, 0, 4, 3, 2, 7, 1]

Some cities have a population of 0 due to a pandemic zombie disease that is wiping out the human lives. After each day, every city will lose half of its population.

Write a program to loop though each city population and make it lose half of its population until all cities have no humans left. Make updates to each element in the array And print the array like below for each day:

Day 0 [3, 6, 0, 4, 3, 2, 7, 1]
Day 1 [1, 3, 0, 2, 1, 1, 3, 0]
Day 2 [0, 1, 0, 1, 0, 0, 1, 0]
Day 3 [0, 0, 0, 0, 0, 0, 0, 0]
---- EXTINCT ----

Write the program in a way that it will handle any number of people in cities, above was just an example

Hint:

Below expression will print array in this format:

System.out.println(Arrays.toString(inhabitants)));

[3, 6, 0, 4, 3, 2, 7, 1]

 */