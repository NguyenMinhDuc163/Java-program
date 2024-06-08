//package codeptit;
//
//import java.io.*;
//import java.util.*;
//
//class Student{
//    private String idx, name;
//    private  double d1, d2, d3, score;
//    private int rank = 1;
//
//    public Student(int idx, String name, double d1, double d2, double d3) {
//        this.idx = String.format("SV%02d", idx);
//        this.name = stdName(name);
//        this.d1 = d1;
//        this.d2 = d2;
//        this.d3 = d3;
//        this.score = (d1 * 3 + d2 * 3 + d3 * 2) / 8.0;
//    }
//    public String stdName(String tmp){
//        String []s = tmp.trim().split("\\s+");
//        String res = "";
//        for(String x: s){
//            res += x.substring(0,1).toUpperCase() + x.substring(1).toLowerCase() + " ";
//        }
//        return res.trim();
//    }
//
//    public void setRank(int rank) {
//        this.rank = rank;
//    }
//
//    public double getScore() {
//        return score;
//    }
//
//
//    @Override
//    public String toString() {
//        return String.format("%s %s %.2f %d", idx, name, score, rank);
//    }
//
//}
//public class J07054 {
//    public static void main(String[] args) throws FileNotFoundException {
//        Scanner sc = new Scanner(new File("BANGDIEM.in"));
//        int n = sc.nextInt();
//        List<Student> students = new ArrayList<>();
//        for(int i = 1; i <= n; i++){
//            sc.nextLine();
//            students.add(new Student(i, sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
//        }
//        students.sort(Comparator.comparing(Student::getScore).reversed());
//        int currentRank = 1;
//        for(int i = 1; i < students.size(); i++){
//            if(students.get(i).getScore() < students.get(i - 1).getScore())
//                currentRank = i + 1;
//            students.get(i).setRank(currentRank);
//        }
//        students.forEach(System.out::println);
//    }
//}
