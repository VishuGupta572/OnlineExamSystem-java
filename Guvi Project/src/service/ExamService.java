package service;

import model.Question;
import storage.QuestionBank;
import java.util.List;
import java.util.Scanner;

public class ExamService {
    private final List<Question> questions;
    private int score = 0;

    public ExamService() {
        QuestionBank bank = new QuestionBank();
        this.questions = bank.getQuestions();
    }

    public void startExam() {
        Scanner scanner = new Scanner(System.in);

        int questionNumber = 1;
        for (Question q : questions) {
            System.out.println("Q" + questionNumber++ + ": " + q.getQuestionText());
            String[] options = q.getOptions();
            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ". " + options[i]);
            }
            System.out.print("Your answer (1-4): ");
            int answer = scanner.nextInt();

            if (answer == q.getCorrectOption()) {
                score++;
            }
            System.out.println();
        }
        scanner.close();
    }

    public void showResult() {
        System.out.println("Your Score: " + score + "/10");
    }
}
