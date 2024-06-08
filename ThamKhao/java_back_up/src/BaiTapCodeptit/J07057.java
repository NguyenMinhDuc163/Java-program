//package codeptit;
//
//import java.io.*;
//import java.util.*;
//
//class Student{
//    private String idx, name, nation, area, status;
//    private double score, bonus, totalScore;
//    private Map<String, Double> areaList = new HashMap<>();
//    public Student(int idx, String name, String score, String nation, String area) {
//        this.idx = String.format("TS%02d", idx);
//        this.name = stdName(name);
//        this.nation = nation;
//        this.score = Double.parseDouble(score);
//        this.area = area;
//        areaList.put("1", 1.5);
//        areaList.put("2", 1.0);
//        areaList.put("3", 0.0);
//        setScore();
//    }
//    public void setScore(){
//        this.totalScore = score + areaList.get(area);
//        if(!nation.equals("Kinh"))
//            this.totalScore += 1.5;
//        if(totalScore >= 20.5) status = "Do";
//        else status = "Truot";
//    }
//    public String stdName(String name){
//        String []s = name.trim().split("\\s+");
//        String res = "";
//        for(String x: s){
//            res += x.substring(0,1).toUpperCase() + x.substring(1).toLowerCase() + " ";
//        }
//        return res.trim();
//    }
//
//    public double getTotalScore() {
//        return totalScore;
//    }
//
//    @Override
//    public String toString() {
//        return String.format("%s %s %.1f %s", idx, name, totalScore, status);
//    }
//
//}
//public class J07057 {
//    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(new File("THISINH.in"));
//        int n = sc.nextInt();
//        sc.nextLine();
//        List<Student> students = new ArrayList<>();
//        for(int i = 1; i <= n; i++){
//            students.add(new Student(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
//        }
//        students.stream().sorted(Comparator.comparing(Student::getTotalScore).reversed()).forEach(System.out::println);
//    }
//}
