package BaiTapCodeptit.J07027;

public class Student {
    private String studentID, studentName, phoneNum;

    public Student(String studentID, String studentName, String phoneNum) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.phoneNum = phoneNum;
    }

    public String getStudentID() {
        return studentID;
    }

    @Override
    public String toString() {
        return String.join(" ", studentID, studentName, phoneNum);
    }
}
