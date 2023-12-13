import java.util.Locale;
import java.util.Scanner;

class Problem {
    private String idx, name, sex, birth, address, tax, signDate;

    public Problem(int idx, String name, String sex, String birth, String address, String tax, String signDate) {
        this.name = name;
        this.sex = sex;
        this.birth = birth;
        this.address = address;
        this.tax = tax;
        this.signDate = signDate;
        this.idx = String.format("%05d", idx);
    }
    public String toString(){
        return idx + " " + name + " " + sex + " " + birth + " " + address + " " + tax + " " + signDate;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i = 1; i <= t; i++){
            Problem a = new Problem(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            System.out.println(a);
        }

    }
}
