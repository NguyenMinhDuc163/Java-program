package codeptit.J07028.TEST;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

class Teacher {
    private String codeTeacher, nameTeacher;
    private double totalHours;

    public String getCodeTeacher() {
        return codeTeacher;
    }

    public String getNameTeacher() {
        return nameTeacher;
    }

    public double getTotalHours() {
        return totalHours;
    }

    public void addToTotalHours(double hours) {
        totalHours += hours;
    }

    public Teacher(String codeTeacher, String nameTeacher) {
        this.codeTeacher = codeTeacher;
        this.nameTeacher = nameTeacher;
        this.totalHours = 0.0;
    }
}

class Subject {
    private String codeSubject, nameSubject;

    public String getCodeSubject() {
        return codeSubject;
    }

    public String getNameSubject() {
        return nameSubject;
    }

    public Subject(String codeSubject, String nameSubject) {
        this.codeSubject = codeSubject;
        this.nameSubject = nameSubject;
    }
}

public class test {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = sc.nextInt();
        sc.nextLine();
        Map<String, Subject> subjects = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] s = sc.nextLine().split(" ", 2);
            subjects.put(s[0], new Subject(s[0], s[1]));
        }
        sc = new Scanner(new File("GIANGVIEN.in"));
        int m = sc.nextInt();
        sc.nextLine();
        Map<String, Teacher> teachers = new HashMap<>();
        for (int i = 0; i < m; i++) {
            String[] s = sc.nextLine().split(" ", 2);
            teachers.put(s[0], new Teacher(s[0], s[1]));
        }
        sc = new Scanner(new File("GIOCHUAN.in"));
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            String idxTeacher = sc.next();
            String idxSub = sc.next();
            double time = Double.parseDouble(sc.next());

            if (teachers.containsKey(idxTeacher) && subjects.containsKey(idxSub)) {
                Teacher teacher = teachers.get(idxTeacher);
                teacher.addToTotalHours(time);
            }
        }

        List<Teacher> sortedTeachers = new ArrayList<>(teachers.values());
        sortedTeachers.sort(Comparator.comparing(Teacher::getCodeTeacher));

        for (Teacher teacher : sortedTeachers) {
            System.out.printf("%s %.2f%n", teacher.getNameTeacher(), teacher.getTotalHours());
        }
    }
}
