import java.util.*;

public class test5_7 {

    public static void main(String[] args) {

        double score1, // first Score
                score2, // Second Score
                score3, // Third Score
                score4, // fourth Score
                score5;        // fifth score     
        double averageReturned;        // Average test score

        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        // Get score 1
        System.out.print("Enter your first score ");
        score1 = keyboard.nextDouble();
        double grade1 = determineGrade(score1);
        // Get score 2
        System.out.print("Enter your second score ");
        score2 = keyboard.nextInt();
        double grade2 = determineGrade(score2);
        // Get score 3
        System.out.print("Enter your third score ");
        score3 = keyboard.nextInt();
        double grade3 = determineGrade(score3);
        // Get score 4
        System.out.print("Enter your fourth score ");
        score4 = keyboard.nextInt();
        double grade4 = determineGrade(score4);
        // Get score 5
        System.out.print("Enter your fifth score ");
        score5 = keyboard.nextInt();
        double grade5 = determineGrade(score5);
        averageReturned = calcAverage(score1, score2, score3, score4, score5);
        System.out.println(" Your average is :" + averageReturned);
    }
          // This methods calculates the average
    public static double calcAverage(double test1, double test2,
            double test3, double test4, double test5) {

        double average = ((test1 + test2 + test3 + test4 + test5) / 5);
        //System.out.println(average);  // tester code
        return average;
    }
    // This methods\ determines the letter grade
    public static double determineGrade(double test) {
        if (test >= 90) {
            System.out.println("You got an A");
        } else if (test >= 80) {
            System.out.println("You got a B");
        } else if (test >= 70) {
            System.out.println("You got a C");
        } else if (test >= 60) {
            System.out.println("You got a D");
        } else if (test < 60) {
            System.out.println("You got an F");
        }
        return 0; // here is the return statement.
    }

}
