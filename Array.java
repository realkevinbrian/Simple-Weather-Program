public class Array {

    public static void main(String[] args) {

        // String[] employee = new String[5];
        // employee[0] = "Kevin Brian";
        // employee[1] = "Kim PHD";
        // employee[2] = "John LM";
        // employee[3] = "Jackson M.";
        // employee[4] = "Cooke";

        int[] numb = new int[10];


        // =>Loop show all employees
        for (int i = 0; i < numb.length; i++) {
            // System.out.println("Employee " + i + " => " + employee[i]);
            numb[i] = (i * 2) + 10 * (30 + 2);
            System.out.println("Numb => " + numb[i]);

            // => Find CEO if found break
            // if (employee[0] == "Kevin Brian") {
            //     System.out.println("Found the CEO is :" + employee[0]);
            //     break;
            // }
        }

    }
}