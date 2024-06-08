package BaiTapCodeptit.J07035;

public class Student {
    private String studentID, studentName, classRoom, email;

    public Student(String studentID, String studentName, String classRoom, String email) {
        this.studentID = studentID;
        this.studentName = stdName(studentName);
        this.classRoom = classRoom;
        this.email = email;
    }
    public String stdName(String name){
        String []s = name.trim().split("\\s+");
        String res = "";
        for(String x: s){
            res += x.substring(0,1).toUpperCase() + x.substring(1).toLowerCase() + " ";
        }
        return res.trim();
    }

    public String getStudentID() {
        return studentID;
    }

    @Override
    public String toString() {
        return String.join(" ", studentID, studentName, classRoom);
    }
}
