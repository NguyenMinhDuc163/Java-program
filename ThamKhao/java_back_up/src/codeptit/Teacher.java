package codeptit;

/**
 *
 * @author DELL
 */
public class Teacher {
    private String teacherID, teacherName;

    public Teacher(String teacherID, String teacherName) {
        this.teacherID = teacherID;
        this.teacherName = teacherName;
    }

    public String getTeacherID() {
        return teacherID;
    }

    @Override
    public String toString() {
        return "Giang vien: " + teacherName;
    }
}
