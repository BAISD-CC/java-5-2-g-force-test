import java.util.Scanner;

// INFO: Ch. 5 Challenge 2: G-Force Test
// INFO: main is already written. You write three methods below main.
// INFO: Each method's documentation comment is already written. Use it to
//       work out the header: the name, the parameters, and the type of value
//       the method sends back. Every method in this chapter is public static.
// INFO: The calls in main are commented out. After you write a method,
//       uncomment its call block, run the program, and check the output.
//       To uncomment several lines, select them and press Ctrl + /.
// INFO: Lines marked GIVEN are provided. Do not change them.

public class GForceTest {

    public static void main(String[] args) {
        // GIVEN: Read the candidate's five scores.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the first score:");
        double score1 = keyboard.nextDouble();
        System.out.println("Enter the second score:");
        double score2 = keyboard.nextDouble();
        System.out.println("Enter the third score:");
        double score3 = keyboard.nextDouble();
        System.out.println("Enter the fourth score:");
        double score4 = keyboard.nextDouble();
        System.out.println("Enter the fifth score:");
        double score5 = keyboard.nextDouble();
        keyboard.close();

        // GIVEN: The results header.
        System.out.println("Test results:");

        // TODO 1 (call): Uncomment the two lines below after you write
        //                calcAverage.
        // double average = calcAverage(score1, score2, score3, score4, score5);
        // System.out.printf("Average score: %.2f%n", average);

        // TODO 2 (call): Uncomment the six lines below after you write
        //                determineGrade. TODO 1 must be done first.
        // System.out.println("Score 1: " + determineGrade(score1));
        // System.out.println("Score 2: " + determineGrade(score2));
        // System.out.println("Score 3: " + determineGrade(score3));
        // System.out.println("Score 4: " + determineGrade(score4));
        // System.out.println("Score 5: " + determineGrade(score5));
        // System.out.println("Average grade: " + determineGrade(average));

        // GIVEN: The safety check header.
        System.out.println("Safety check:");

        // TODO 3 (call): Uncomment the if/else below after you write
        //                isDangerous.
        // if (isDangerous(score1) || isDangerous(score2) || isDangerous(score3)
        //         || isDangerous(score4) || isDangerous(score5)) {
        //     System.out.println("Medical review required.");
        // } else {
        //     System.out.println("Cleared for flight.");
        // }

        // GIVEN: Close the program.
        System.exit(0);
    }

    // TODO 1 (method): Write the calcAverage method right below its
    //                  documentation comment.
    /**
     * Calculates the average of five scores.
     * @param score1 The first score, a double.
     * @param score2 The second score, a double.
     * @param score3 The third score, a double.
     * @param score4 The fourth score, a double.
     * @param score5 The fifth score, a double.
     * @return The average of the five scores, as a double.
     */


    // TODO 2 (method): Write the determineGrade method right below its
    //                  documentation comment.
    /**
     * Determines the grade for one score.
     *   Over 9.0:                  "Warning"
     *   Over 6.0, up to 9.0:       "Excel"
     *   Over 3.0, up to 6.0:       "Pass"
     *   3.0 or below:              "Fail"
     * @param score The score to grade, a double.
     * @return The grade, as a String.
     */


    // TODO 3 (method): Write the isDangerous method right below its
    //                  documentation comment.
    /**
     * Checks whether a score is dangerous.
     * @param score The score to check, a double.
     * @return true if the score is over 9.0, false if it isn't.
     */


}
