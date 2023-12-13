import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;

class Student {
    private String name;
    private int accepted, submit;

    public Student(String name, int accepted, int submit) {
        this.name = name;
        this.accepted = accepted;
        this.submit = submit;
    }

    public String getName() {
        return name;
    }

    public int getAccepted() {
        return accepted;
    }

    public int getSubmit() {
        return submit;
    }
    public String toString(){
        return String.format("%s %d %d",name, accepted, submit);
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int n = sc.nextInt();
        ArrayList<Student> students = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            sc.nextLine();
            students.add(new Student(sc.nextLine(), sc.nextInt(), sc.nextInt()));
        }
        students.sort((x, y) ->{
            if(x.getAccepted() == y.getAccepted() && x.getSubmit() == y.getSubmit())
                return x.getName().compareTo(y.getName());
            else {
                if(x.getAccepted() != y.getAccepted())
                    return Integer.compare(y.getAccepted(), x.getAccepted());
                else return Integer.compare(x.getSubmit(),y.getSubmit());
            }
        });
        students.forEach(System.out::println);
    }
}
