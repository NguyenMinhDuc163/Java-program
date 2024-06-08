package OnTap.J07035;

public class ScoreTable {
    private Student student;
    private Subject subject;
    private String score;

    public ScoreTable(Student student, Subject subject, String score) {
        this.student = student;
        this.subject = subject;
        this.score = score;
    }
    public double getScore() {
        return Double.parseDouble(score);
    }

    public String getStudentID() {
        return student.getStudentID();
    }

    @Override
    public String toString() {
        return student + " " + score;
    }
}
