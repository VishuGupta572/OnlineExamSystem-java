import service.ExamService;

public class ExamSystem {
    public static void main(String[] args) {
        ExamService exam = new ExamService();
        exam.startExam();
        exam.showResult();
    }
}
