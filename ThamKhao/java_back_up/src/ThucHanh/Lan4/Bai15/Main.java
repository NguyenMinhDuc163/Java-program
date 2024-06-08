package ThucHanh.Lan4.Bai15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        TreeMap<String, Student> students = new TreeMap<>();
        TreeMap<String, Advisor> advisors = new TreeMap<>();
        while(sc.hasNextLine()){
            String studentID = sc.nextLine();
            String studentName = sc.nextLine();
            String classRoom = sc.nextLine();
            String email = sc.nextLine();
            String phoneNum = sc.nextLine();
            students.put(studentID, new Student(studentID, studentName, classRoom, email, phoneNum));
        }
        sc = new Scanner(new File("HUONGDAN.in"));
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 1; i <= n; i++){
            String []s = sc.nextLine().trim().split(" ");
            int quantity = Integer.parseInt(s[s.length - 1]);
            String name = "";
            for(int j = 0; j < s.length - 1; j++)
                name += s[j] + " ";
            for(int j = 1; j <= quantity; j++){
                String []tmp = sc.nextLine().split(" ", 2);
                advisors.put(tmp[0],new Advisor(name.trim(), tmp[0],tmp[1]));
            }
        }

        students.forEach((x, y) -> {
            if(advisors.containsKey(x)){
                System.out.print(students.get(x) + " " + advisors.get(x) + " " + students.get(x).getPhoneNum());
                System.out.println();
            }
        });
    }
}
