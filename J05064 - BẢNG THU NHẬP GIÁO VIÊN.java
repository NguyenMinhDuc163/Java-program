import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.HashMap;

 class Teacher {
    private String idx, name;
    private int wage;
    private HashMap<String, Integer> mp = new HashMap<>();

    public Teacher(String idx, String name, int wage) {
        this.idx = idx;
        this.name = name;
        this.wage = wage;
        mp.put("HT",2000000);
        mp.put("HP",900000);
        mp.put("GV",500000);
    }

    public String getIdx() {
        return idx;
    }

    public int Income(){
        return wage * Integer.parseInt(idx.substring(2)) + mp.get(idx.substring(0, 2));
    }
    public String toString(){
        return idx + " " + name + " " + Integer.parseInt(idx.substring(2)) + " "  + mp.get(idx.substring(0, 2)) + " " + Income();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int n = sc.nextInt();
        ArrayList<Teacher> teachers = new ArrayList<>();
        IntStream.rangeClosed(1, n).forEach(i -> {
            sc.nextLine();
            teachers.add(new Teacher(sc.nextLine(), sc.nextLine(), sc.nextInt()));
        });
        int numHT = 0, numHP = 0;
        for(Teacher x: teachers){
            if(x.getIdx().startsWith("HT") && numHT < 1){
                System.out.println(x);
                numHT++;
            }
            else if(x.getIdx().startsWith("HP") && numHP < 2){
                System.out.println(x);
                numHP++;
            }
            if(!x.getIdx().startsWith("HT") && !x.getIdx().startsWith("HP"))
                System.out.println(x);
        }
    }
}
