package BaiTapCodeptit.J07036;

public class Grend {
    private Student student;
    private Subject subject;
    private String score;

    public Grend(Student student, Subject subject, String score) {
        this.student = student;
        this.subject = subject;
        this.score = score;
    }
    public String getClassRoom(){
        return student.getClassRoom();
    }

    public String getSubjectID(){
        return subject.getSubjectID();
    }

    public String getStudentID(){
        return student.getStudentID();
    }
    @Override
    public String toString() {
        return student + " " + subject + " " + score;
    }
}
