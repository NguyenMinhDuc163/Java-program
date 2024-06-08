//import java.io.*;
//import java.text.SimpleDateFormat;
//import java.util.*;
//
//class Exam{
//    private String idx, day, hour, room;
//
//    public Exam(int idx, String day, String hour, String room) {
//        this.idx = String.format("C%03d", idx);
//        this.day = day;
//        this.hour = hour;
//        this.room = room;
//    }
//    public Date getDate(){
//        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyyHH:mm");
//        try{
//            return format.parse(day + hour);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//    @Override
//    public String toString() {
//        return String.format("%s %s %s %s", idx, day, hour, room);
//    }
//
//}
//public class J07059 {
//
//    public static void main(String[] args) throws IOException {
//        Scanner sc =  new Scanner(new File("CATHI.in"));
//        int n = sc.nextInt();
//        sc.nextLine();
//        List<Exam> exams = new ArrayList<>();
//        for(int i = 1; i <= n; i++){
//            exams.add(new Exam(i, sc.nextLine(), sc.nextLine(), sc.nextLine()));
//        }
//        exams.stream().sorted(Comparator.comparing(Exam::getDate)).forEach(System.out::println);
//
//    }
//}
