//package codeptit;
//
//import java.io.*;
//import java.util.*;
//
//class Subject{
//    private String idx, name, quantity, TeachingMethodTheory,TeachingMethodPractice;
//
//    public Subject(String idx, String name, String quantity, String TeachingMethodTheory, String TeachingMethodPractice) {
//        this.idx = idx;
//        this.name = name;
//        this.quantity = quantity;
//        this.TeachingMethodTheory = TeachingMethodTheory;
//        this.TeachingMethodPractice = TeachingMethodPractice;
//    }
//
//    public String getIdx() {
//        return idx;
//    }
//
//    public String getTeachingMethodPractice() {
//        return TeachingMethodPractice;
//    }
//
//
//    @Override
//    public String toString() {
//        return String.format("%s %s %s %s %s", idx, name, quantity, TeachingMethodTheory, TeachingMethodPractice);
//    }
//
//}
//public class J07073 {
//    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(new File("MONHOC.in"));
//        int n = sc.nextInt();
//        sc.nextLine();
//        List<Subject> subjects = new ArrayList<>();
//        for(int i = 1; i <= n; i++){
//            subjects.add(new Subject(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
//        }
//        subjects.stream().filter(x -> !x.getTeachingMethodPractice().equals("Truc tiep")).sorted(Comparator.comparing(Subject::getIdx))
//                .forEach(System.out::println);
//    }
//}
