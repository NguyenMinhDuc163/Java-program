//package codeptit;
//import java.io.*;
//import java.util.*;
//
//class Student {
//    private String idx, name, status;
//    private double d1, d2, d3, total;
//    private static HashMap<String, Double> prior = new HashMap<>();
//    public Student(String idx, String name, double d1, double d2, double d3) {
//        this.idx = idx;
//        this.name = name;
//        this.d1 = d1;
//        this.d2 = d2;
//        this.d3 = d3;
//        prior.put("KV1", 0.5); prior.put("KV2", 1.0);
//        prior.put("KV3", 2.5);
//        total = 2 * d1 + d2 + d3 + prior.get(idx.substring(0,3));
//        stdname();
//    }
//
//    public String getIdx() {
//        return idx;
//    }
//
//    public void setStatus(String status) {
//        this.status = status;
//    }
//
//    public double getTotal() {
//        return total;
//    }
//
//    public String stdPoint(double n){
//        if((n * 10) % 10 == 0) return String.valueOf((int) n);
//        else return String.valueOf(n);
//    }
//    public void stdname(){
//        String []s = this.name.trim().split("\\s+");
//        String res = "";
//        for(String x: s){
//            res += x.substring(0,1).toUpperCase() + x.substring(1).toLowerCase() + " ";
//        }
//        this.name = res.trim();
//    }
//    public String toString(){
//        return String.format("%s %s %s %s %s", idx, name, stdPoint(prior.get(idx.substring(0,3))),stdPoint(total), status);
//    }
//}
//public class J07052 {
//    public static void main(String[] args) throws FileNotFoundException {
//        Scanner sc = new Scanner(new File("THISINH.in"));
//        sc.useLocale(Locale.US);
//        int n = sc.nextInt();
//        ArrayList<Student> students = new ArrayList<>();
//        for(int i = 1; i <= n; i++){
//            sc.nextLine();
//            students.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
//        }
//        int quantity = sc.nextInt();
//        double score = 0;
//        students.sort(Comparator.comparing(Student::getTotal).reversed().thenComparing(Student::getIdx));
//        for(int i = 0; i < students.size(); i++){
//            if(i < quantity){
//                students.get(i).setStatus("TRUNG TUYEN");
//            }
//            else students.get(i).setStatus("TRUOT");
//            if(quantity > 0 && i == quantity) score = students.get(i - 1).getTotal();
//        }
//        for(Student x: students){
//            if(x.getTotal() == score)
//                x.setStatus("TRUNG TUYEN");
//        }
//        System.out.println(score);
//        students.forEach(System.out::println);
//    }
//}