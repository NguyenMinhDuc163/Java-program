package BaiTapCodeptit.J07035;

public class GradeSheet {
    private Student student;
    private Subject subject;
    private String gpa;

    public GradeSheet(Student student, Subject subject, String gpa) {
        this.student = student;
        this.subject = subject;
        this.gpa = gpa;
    }

    public double getGpa() {
        return Double.parseDouble(gpa);
    }
    public String getStudentID(){
        return student.getStudentID();
    }
    @Override
    public String toString() {
        return student.toString() + " " + gpa;
    }
}
