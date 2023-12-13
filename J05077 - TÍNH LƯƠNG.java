import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.HashMap;
 class Department {
    private String roomCode, roomName;

    public Department(String roomCode, String roomName) {
        this.roomCode = roomCode;
        this.roomName = roomName;
    }

    public String getRoomCode() {
        return roomCode;
    }

    public String getRoomName() {
        return roomName;
    }

    public String toString(){
        return roomName;
    }
}

 class NhanVien {
    private String idx, name;
    private int coeff, salary, wage, workDay;

    public String getIdx() {
        return idx;
    }

    public NhanVien(String idx, String name, int wage, int workDay) {
        this.idx = idx;
        this.name = name;
        this.wage = wage;
        this.workDay = workDay;
        setCoeff();
        setSalary();
    }


    public boolean isYear(int s, int t, int year){
        return (year >= s && year <= t);
    }
    public void setCoeff(){
        String  ma = idx.substring(0, 1);
        int nam = Integer.parseInt(idx.substring(1, 3));
        if(ma.equals("A")){
            if(isYear(1, 3, nam)) coeff = 10;
            else if(isYear(4, 8, nam)) coeff = 12;
            else if(isYear(9, 15, nam)) coeff = 14;
            else if(nam >= 16) coeff = 20;
        }
        else if(ma.equals("B")){
            if(isYear(1, 3, nam)) coeff = 10;
            else if(isYear(4, 8, nam)) coeff = 11;
            else if(isYear(9, 15, nam)) coeff = 13;
            else if(nam >= 16) coeff = 16;
        }
        else if(ma.equals("C")){
            if(isYear(1, 3, nam)) coeff = 9;
            else if(isYear(4, 8, nam)) coeff = 10;
            else if(isYear(9, 15, nam)) coeff = 12;
            else if(nam >= 16) coeff = 14;
        }
        else {
            if(isYear(1, 3, nam)) coeff = 8;
            else if(isYear(4, 8, nam)) coeff = 9;
            else if(isYear(9, 15, nam)) coeff = 11;
            else if(nam >= 16) coeff = 13;
        }
    }

    public void setSalary() {
        salary = wage * workDay * coeff * 1000;
    }

    public int getSalary() {
        return salary;
    }

    public String toString(){
        return String.format("%s %s", idx, name);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int n = sc.nextInt();
        ArrayList<NhanVien> nhanViens = new ArrayList<>();
        ArrayList<Department> departments = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            String ma = sc.next();
            String name = sc.nextLine();
            departments.add(new Department(ma, name));
        }
        int t = sc.nextInt();
        for(int i = 1; i <= t; i++){
            sc.nextLine();
            nhanViens.add(new NhanVien(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt()));
        }
        for(NhanVien x: nhanViens){
            System.out.print(x);
            for(Department y: departments){
                if(x.getIdx().substring(3).equals(y.getRoomCode())){
                    System.out.print(y.getRoomName() + " ");
                }
            }
            System.out.println(x.getSalary());
        }
    }
}
