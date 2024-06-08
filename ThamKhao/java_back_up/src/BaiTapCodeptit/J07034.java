//package codeptit;
//
//import java.io.*;
//import java.util.*;
//
//class Subject{
//    private final String idx, nameSubject, quantity;
//
//    public Subject(String idx, String nameSubject, String quantity) {
//        this.idx = idx;
//        this.nameSubject = nameSubject;
//        this.quantity = quantity;
//    }
//
//    public String getNameSubject() {
//        return nameSubject;
//    }
//
//    @Override
//    public String toString() {
//        return String.format("%s %s %s", idx, nameSubject, quantity);
//    }
//}
//public class J07034 {
//    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(new File("MONHOC.in"));
//        sc.useLocale(Locale.US);
//        int n = sc.nextInt();
//        sc.nextLine();
//        List<Subject> subjects = new ArrayList<>();
//        for(int i = 1; i <= n; i++){
//            subjects.add(new Subject(sc.nextLine(), sc.nextLine(), sc.nextLine()));
//        }
//        subjects.stream().sorted(Comparator.comparing(Subject::getNameSubject)).forEach(System.out::println);
//    }
//}
