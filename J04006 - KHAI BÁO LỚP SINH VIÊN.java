import java.util.Locale;
import java.util.Scanner;
 class Problem {
    private String name,classRoom, birth;
    private double gpa;

    public Problem(String name, String classRoom, String birth, double gpa) {
        this.name = name;
        this.classRoom = classRoom;
        this.birth = birth;
        this.gpa = gpa;
    }

    public void stdBirth(){
        StringBuilder sb = new StringBuilder(this.birth);
        if(sb.charAt(1) == '/') sb.insert(0,"0");
        if(sb.charAt(4) == '/') sb.insert(3,"0");
        this.birth = sb.toString();
    }
    public String toString(){
        stdBirth();
        return "B20DCCN001 " + name + " " + classRoom + " " + birth + " " + String.format("%.2f",gpa);
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        Problem a = new Problem(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
        System.out.println(a);
    }
}
