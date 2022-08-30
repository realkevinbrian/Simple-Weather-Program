
/***
 * ================Weather Challenge Solved with Java===============
 * Coded by Kevin Brian
 * Email : realkevinbrian@gmail.com
 */

import java.util.Scanner;

public class WeatherChallenge {

    public static void main(String[] args) {

        // Get input
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter Days :");
        int days = getInput.nextInt();

        // declare temp array
        int[] temp = new int[days];

        // set temps
        temp[0] = 45;
        temp[1] = 42;
        temp[2] = 39;
        temp[3] = 48;
        temp[4] = 37;
        temp[5] = 46;
        temp[6] = 53;

        // declare sum variable
        int sum = 0;

        // loop & find sum
        for (int i = 0; i < days; i++) {

            // prints all temp according to days
            System.out.println("Day " + (i + 1) + "'s high temp :" + temp[i]);

            // sum temps
            sum += temp[i];
        }

        // get average
        double average = (double) sum / days;

        // count
        int count = 0;

        for (int i = 0; i < days; i++) {
            if (temp[i] > average) {
                // increment the count if found a temp greater than average
                count++;
            }
        }

        // Print
        System.out.println("Average temp = " + average);
        System.out.println(count + " days were above average.");
    }
}