package ThucHanh.Lan4.Bai15;

public class Student {
    private String studentID, studentName, classRoom, email, phoneNum;

    public Student(String studentID, String studentName, String classRoom, String email, String phoneNum) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.classRoom = classRoom;
        this.email = email;
        this.phoneNum = "0" + phoneNum;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    @Override
    public String toString() {
        return String.join(" ", studentID, studentName);
    }
}
