public class QuizQuestion {
    private String question;
    private String[] options;
    private char correctAnswer;

    public QuizQuestion(String question, String[] options, char correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public void displayQuestion() {
        System.out.println(question);
        char option = 'A';
        for (String opt : options) {
            System.out.println(option + ". " + opt);
            option++;
        }
    }

    public boolean checkAnswer(char userAnswer) {
        return Character.toUpperCase(userAnswer) == Character.toUpperCase(correctAnswer);
    }
}
