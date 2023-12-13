import java.util.Locale;
import java.util.Scanner;

 class Problem {
    private String name, sex, birth, address, tax, signDate;

    public Problem(String name, String sex, String birth, String address, String tax, String signDate) {
        this.name = name;
        this.sex = sex;
        this.birth = birth;
        this.address = address;
        this.tax = tax;
        this.signDate = signDate;
    }
    public String toString(){
        return "00001 " + name + " " + sex + " " + birth + " " + address + " " + tax + " " + signDate;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        Problem a = new Problem(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        System.out.println(a);
    }
}
