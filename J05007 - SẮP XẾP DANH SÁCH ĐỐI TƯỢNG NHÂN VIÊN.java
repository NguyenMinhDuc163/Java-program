import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
 class NhanVien {
    private String idx, name, sex, birth, address, tax, signDay;

    public NhanVien(int idx, String name, String sex, String birth, String address, String tax, String signDay) {
        this.idx = String.format("%05d", idx);
        this.name = name;
        this.sex = sex;
        this.birth = birth;
        this.address = address;
        this.tax = tax;
        this.signDay = signDay;
    }
    public String getBirth(){
        String []s = this.birth.split("/");
        return s[2] + s[1] + s[0];
    }
    public String toString(){
        return idx + " " + name + " " + sex + " " + birth + " " + address + " " + tax + " " + signDay;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        ArrayList<NhanVien> nhanViens = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 1; i <= n; i++){
            nhanViens.add(new NhanVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(),sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        nhanViens.sort((x, y) -> x.getBirth().compareTo(y.getBirth()));
        nhanViens.forEach(System.out::println);
    }
}
