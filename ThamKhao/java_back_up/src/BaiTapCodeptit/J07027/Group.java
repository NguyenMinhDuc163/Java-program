package BaiTapCodeptit.J07027;

public class Group {
    private Student student ;
    private Assignment assignment ;

    public Group(Student student, Assignment assignment) {
        this.student = student;
        this.assignment = assignment;
    }

    public String getStudentID() {
        return student.getStudentID();
    }

    @Override
    public String toString() {
        return student.toString() + " " + assignment.toString();
    }
}
