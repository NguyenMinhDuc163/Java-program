package OnTap.J06003;

public class Student {
    private String studentID, studentName, phoneNum, group, topic;

    public Student(String studentID, String studentName, String phoneNum, String group) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.phoneNum = phoneNum;
        this.group = group;
    }

    @Override
    public String toString() {
        return String.join(" ", studentID, studentName, phoneNum);
    }
}
