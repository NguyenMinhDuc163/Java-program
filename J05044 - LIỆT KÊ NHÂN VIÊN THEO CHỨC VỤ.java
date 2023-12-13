import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.HashMap;

import java.util.HashMap;

 class NhanVien {
    private String idx, name, position;
    private double wage, workday, salary, advance, remain, bonus;
    private static HashMap<String, Integer> allowance = new HashMap<>();

    public NhanVien(int idx, String name, String position, double wage, double workday) {
        this.idx = String.format("NV%02d", idx);
        this.name = name;
        this.position = position;
        this.wage = wage;
        this.workday = workday;
        this.salary = wage * workday;
        allowance.put("GD", 500);
        allowance.put("PGD", 400);
        allowance.put("TP", 300);
        allowance.put("KT", 250);
    }

    public void getSalary() {
        bonus = allowance.getOrDefault(this.position, 100);
        if((bonus + salary) * 2 / 3 < 25000) advance = Math.round((bonus + salary) * 2 / 3 / 1000) * 1000;
        else advance = 25000;
        this.remain = salary - advance + bonus;
    }

    public String getPosition() {
        return position;
    }

    public String toString(){
        getSalary();
        return String.format("%s %s %.0f %.0f %.0f %.0f", idx, name, bonus, salary, advance, remain );
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int n = sc.nextInt();
        ArrayList<NhanVien> nhanViens = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            sc.nextLine();
            nhanViens.add(new NhanVien(i, sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble()));
        }
        sc.nextLine();
        String positon = sc.nextLine();
        nhanViens.stream().filter(x -> positon.equals(x.getPosition())).forEach(System.out::println);
    }
}
