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


    public String toString(){
        return String.format("%s %s", codeClassRoom, teacher);
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
            students.putIfAbsent(idx, new ArrayList<>());
            students.get(idx).add(new Student(idx, nameClass, codeClassRoom, teacher));
        }
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){

            String lop = sc.nextLine();
            System.out.println("Danh sach nhom lop mon " + students.get(lop).get(0).getNameClass() + ":");
            students.get(lop).stream().sorted((x, y) -> x.getCodeClassRoom().compareTo(y.getCodeClassRoom())).forEach(System.out::println);
        }
    }
}
