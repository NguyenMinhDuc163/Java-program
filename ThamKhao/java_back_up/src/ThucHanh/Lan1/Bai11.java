package ThucHanh.Lan1;
import java.io.*;
import java.util.*;
class Subject implements Comparable<Subject>{
    private String idx,name, perfom;

    public Subject(String idx, String name, String perfom) {
        this.idx = idx;
        this.name = name;
        this.perfom = perfom;
    }

    public String getIdx() {
        return idx;
    }

    @Override
    public String toString() {
        return String.join(" ", idx, name, perfom);
    }


    @Override
    public int compareTo(Subject o) {
        return this.idx.compareTo(o.getIdx());
    }
}
public class Bai11 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        sc.useLocale(Locale.US);
        List<Subject> subjects = new ArrayList<>();
        Map<String, Integer> count = new HashMap<>();
        while(sc.hasNextLine()){
            String idx = sc.nextLine();
            String name = sc.nextLine();
            String preform = sc.nextLine();
            count.put(idx, count.getOrDefault(idx, 0) + 1);
            if(count.get(idx) == 1)
                subjects.add(new Subject(idx, name, preform));
        }
//        subjects.stream().sorted(Comparator.comparing(Subject::getIdx)).forEach(System.out::println);
        Collections.sort(subjects);
    }
}
