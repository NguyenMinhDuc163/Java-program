import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;
import java.util.stream.Collectors;

class Student {
    private String idx, nameClass, codeClassRoom, teacher;

    public Student(String idx, String nameClass, String codeClassRoom, String teacher) {
        this.idx = idx;
        this.nameClass = nameClass;
        this.codeClassRoom = codeClassRoom;
        this.teacher = teacher;
    }

    public String getNameClass() {
        return nameClass;
    }

    public String getCodeClassRoom() {
        return codeClassRoom;
    }

    public String getTeacher() {
        return teacher;
    }

    public String getIdx() {
        return idx;
    }

    public String toString(){
        return String.format("%s %s %s", idx, nameClass, codeClassRoom);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int n = sc.nextInt();
        sc.nextLine();
        TreeMap<String, ArrayList<Student>> students = new TreeMap<>();
        for(int i = 1; i <= n; i++){
            String idx = sc.nextLine();
            String nameClass = sc.nextLine();
            String codeClassRoom = sc.nextLine();
            String teacher = sc.nextLine();
            students.putIfAbsent(teacher, new ArrayList<>());
            students.get(teacher).add(new Student(idx, nameClass, codeClassRoom, teacher));
        }
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){

            String gv = sc.nextLine();
            System.out.println("Danh sach cho giang vien " + students.get(gv).get(0).getTeacher() + ":");
            students.get(gv).stream().sorted((x, y) -> {
                if(!x.getIdx().equals(y.getIdx())){
                    return x.getIdx().compareTo(y.getIdx());
                }
                else return x.getCodeClassRoom().compareTo(y.getCodeClassRoom());
            }).forEach(System.out::println);
        }
    }
}
