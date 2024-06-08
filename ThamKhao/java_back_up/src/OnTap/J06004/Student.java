package OnTap.J06004;

public class Student {
    private String studentID, studentName, phoneNum, topic;
    private int group;

    public Student(String studentID, String studentName, String phoneNum, String group) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.phoneNum = phoneNum;
        this.group = Integer.parseInt(group);
    }

    public int getGroup() {
        return group;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public String toString() {
        return String.join(" ", studentID, studentName, phoneNum, String.valueOf(group), topic);
    }
}
