import java.util.Scanner;

public class TempDays {

    public static void main(String[] args) {

        // get Inputs from users
        Scanner getDays = new Scanner(System.in);
        System.out.println("Input Days :");
        // read input
        int days = getDays.nextInt();

        // check for conditions
        if (days > 7 || days < 7) {
            System.out.println("The days should not be less than 7 nor greater than 8");
        } else {
            System.out.println("Correct days");
            int[] temp = { 45, 44, 39, 48, 37, 46, 53 };
            int sum = 0;

            for (int i = 0; i < temp.length; i++) {
                System.out.println("Day " + (i + 1) + "'s high temp : " + temp[i]);
                sum += temp[i];
            }

            // get average days / sum of all temps
            Double average = (double) sum / days;

            // get days that were above average
            int count = 0;
            for (int i = 0; i < days; i++) {
                if (temp[i] > Math.floor(average)) {
                    count++;
                }
            }

            System.out.println("Average temp = " + Math.floor(average));
            System.out.println(count + " Days were above average.");

        }
    }
}