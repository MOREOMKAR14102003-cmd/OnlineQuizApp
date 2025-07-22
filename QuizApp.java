import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        QuizQuestion[] questions = {
                new QuizQuestion("What is the capital of India?", new String[]{"Mumbai", "Delhi", "Kolkata", "Chennai"}, 'B'),
                new QuizQuestion("Which language runs in a web browser?", new String[]{"Java", "C", "Python", "JavaScript"}, 'D'),
                new QuizQuestion("Which company developed Java?", new String[]{"Google", "Oracle", "Sun Microsystems", "Microsoft"}, 'C')
        };

        int score = 0;

        System.out.println("Welcome to the Online Quiz!\n");

        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ":");
            questions[i].displayQuestion();

            System.out.print("Your answer (A/B/C/D): ");
            char answer = scanner.next().charAt(0);

            if (questions[i].checkAnswer(answer)) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong!\n");
            }
        }

        System.out.println("Quiz Finished!");
        System.out.println("Your Score: " + score + " out of " + questions.length);

        scanner.close();
    }
}
