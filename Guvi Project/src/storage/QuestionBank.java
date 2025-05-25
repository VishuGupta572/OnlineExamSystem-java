package storage;

import model.Question;
import java.util.ArrayList;
import java.util.List;

public class QuestionBank {
    public List<Question> getQuestions() {
        List<Question> questions = new ArrayList<>();

        questions.add(new Question("What is the capital of France?",
            new String[]{"Berlin", "London", "Paris", "Rome"}, 3));

        questions.add(new Question("Which planet is known as the Red Planet?",
            new String[]{"Earth", "Mars", "Jupiter", "Venus"}, 2));

        questions.add(new Question("Who wrote 'Hamlet'?",
            new String[]{"Mark Twain", "Leo Tolstoy", "William Shakespeare", "Charles Dickens"}, 3));

        questions.add(new Question("Which ocean is the largest?",
            new String[]{"Atlantic", "Indian", "Pacific", "Arctic"}, 3));

        questions.add(new Question("What is the boiling point of water?",
            new String[]{"90°C", "100°C", "110°C", "120°C"}, 2));

        questions.add(new Question("Who discovered gravity?",
            new String[]{"Einstein", "Newton", "Galileo", "Tesla"}, 2));

        questions.add(new Question("Which country is known for sushi?",
            new String[]{"India", "Japan", "Thailand", "China"}, 2));

        questions.add(new Question("What gas do plants absorb?",
            new String[]{"Oxygen", "Hydrogen", "Carbon Dioxide", "Nitrogen"}, 3));

        questions.add(new Question("Who painted the Mona Lisa?",
            new String[]{"Van Gogh", "Picasso", "Da Vinci", "Michelangelo"}, 3));

        questions.add(new Question("What is the largest mammal?",
            new String[]{"Elephant", "Giraffe", "Blue Whale", "Hippo"}, 3));

        return questions;
    }
}
