import java.util.Scanner;

class df {

    public static void main(String[] args) {

        /*********************************************************************
         Notes: Write a while loop for that asks the question from CodeChallenge2
         if a specific condition is not met. Use the same code else if code from
         Code Challenge 2 but put it inside a while loop. Try this challenge
         again.
         *********************************************************************/

        // HINT: initialize score before asking input from the user.
        int score = 0;
        Scanner scanner = new Scanner(System.in);


        while (score <= 0 || score >= 100) {
            System.out.println("What is your score?");
            score = scanner.nextInt();

            if (score >= 0 && score <= 59) {
                System.out.println("you got an F, try harder next time");
                break;
            }
            else if (score >= 60 && score <= 69) {
                System.out.println("you got an D, Not bad but not good");
                break;
            }
            else if (score >= 70 && score <= 79) {
                System.out.println("you got an C, good job");
                break;
            }
            else if (score >= 80 && score <= 89) {
                System.out.println("you got an B, Great job, keep on working hard");
                break;
            }
            else if (score >= 90 && score <= 100) {
                System.out.println("you got an A, aweso        me work");
                break;
            }
        }

        scanner.close();
    }
}
