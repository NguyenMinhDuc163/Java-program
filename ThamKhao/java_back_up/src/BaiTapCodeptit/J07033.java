//package codeptit;
//
//import java.util.*;
//import java.io.*;
//
//class Student{
//    private String idx, name, classRoom, email;
//
//    public Student(String idx, String name, String classRoom, String email) {
//        this.idx = idx;
//        this.name = stdName(name);
//        this.classRoom = classRoom;
//        this.email = email;
//    }
//
//    public String getIdx() {
//        return idx;
//    }
//    public String stdName(String name){
//        String []s = name.trim().split("\\s+");
//        String res = "";
//        for(String x: s){
//            res += x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase() + " ";
//        }
//        return res.trim();
//    }
//
//    @Override
//    public String toString() {
//        return String.format("%s %s %s %s", idx, name, classRoom, email);
//    }
//    
//}
//public class J07033 {
//    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(new File("SINHVIEN.in"));
//        int n = sc.nextInt();
//        sc.nextLine();
//        List<Student> students = new ArrayList<>();
//        for(int i = 1; i <= n; i++){
//            students.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
//        }
//        students.stream().sorted(Comparator.comparing(Student::getIdx)).forEach(System.out::println);
//    }
//}
