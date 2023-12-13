/*
 * Trường đại học XYZ cần quản lý các đối tượng là sinh viên và giáo viên. Sinh viên gồm các thông tin : mã sinh viên, tên, ngày sinh, địa chỉ, lớp, điểm gpa. Giáo viên gồm các thông tin : mã giáo viên, tên, ngày sinh, địa chỉ, khoa, lương, lớp mà giáo viên này phụ trách chủ nhiệm. Thực hiện đọc các thông tin danh sách sinh viên và giáo viên từ bàn phím sau đó chuẩn hóa tên, ngày sinh và in ra danh sách sinh viên sau đó là danh sách giáo viên, biết rằng sinh viên sẽ có mã bắt đầu bằng SV (ví dụ SV112), giáo viên có mã bắt đầu bằng GV (ví dụ GV222) theo địa chỉ tìm kiếm.
 * Input Format

Dòng đầu tiên là N : số lượng giáo viên và sinh viên. Các dòng tiếp theo mô tả thông tin của giáo viên hoặc sinh viên, mỗi thông tin gồm 6 dòng, đối với sinh viên 6 dòng gồm : mã sinh viên, tên, ngày sinh, địa chỉ, lớp, điểm gpa, đối với giáo viên 6 dòng gồm : mã giáo viên, tên, ngày sinh, địa chỉ, khoa, lương, lớp mà giáo viên này phụ trách chủ nhiệm. Dòng cuối cùng của input là địa chỉ cần tìm kiếm.

Constraints

1<=N<=1000;

Output Format

Đầu tiên in ra danh sách giáo viên, mỗi giáo viên in ra thông tin trên 1 dòng, các thông tin cách nhau một dấu cách, không cần in thông tin về lớp mà giáo viên này quản lý. Những dòng tiếp theo in ra danh sách sinh viên, mỗi sinh viên in thông tin trên 1 dòng, các thông tin cách nhau một dấu cách, gpa in 2 số sau dấu phẩy.

Sample Input 0
7
GV1
trAN duC TuaN
7/4/1974
Thai Binh
ATTT
20000000
CNTT1
SV2
trAN AnH MaNH
27/10/2004
Ha Nam
DTVT1
2.50
SV3
pham Phuong NAM
8/8/2004
Thai Binh
DTVT2
2.50
GV4
trAN AnH MaNH
24/5/1972
Ha Nam
ATTT
12000000
DTVT2
SV5
trAN Phuong LoNG
8/12/2004
Ha Nam
ATTT3
2.50
SV6
Luong duC LoNG
23/1/2004
Ha Noi
DTVT2
3.20
GV7
Luong AnH TuaN
18/10/1972
Ha Nam
Co khi
25000000
DTVT1
Ha Noi
Sample Output 0

DANH SACH GIAO VIEN CO DIA CHI TAI Ha Noi :
DANH SACH SINH VIEN CO DIA CHI TAI Ha Noi :
SV6 Luong Duc Long 23/01/2004 Ha Noi DTVT2 3.20
 */
import java.util.*;
 class Person {
    protected String id, name, birth, address, classRoom;

    public Person(String id, String name, String birth, String address, String classRoom) {
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.address = address;
        this.classRoom = classRoom;
    }
    public void stdBirth(){
        StringBuilder sb = new StringBuilder(birth);
        if(sb.charAt(1) == '/')
            sb.insert(0,"0");
        if(sb.charAt(4) == '/')
            sb.insert(3,"0");
        birth = sb.toString();
    }
    public void stdName(){
        String []s = name.split("\\s+");
        String res = "";
        for(String x: s){
            res += Character.toUpperCase(x.charAt(0));
            for(int i = 1; i < x.length(); i++){
                res += Character.toLowerCase(x.charAt(i));
            }
            res += " ";
        }
        this.name = res.trim();
    }

    public String getAddress() {
        return address;
    }

    public String toString(){
        stdName();
        stdBirth();
        return id + " " + name + " " + birth + " " + address;
    }
}
 class Student extends Person{
    private double gpa;
    public Student(String id, String name, String birth, String address, String classRoom, double gpa){
        super(id, name, birth, address, classRoom);
        this.gpa = gpa;
    }

    public String toString(){
        return super.toString() + " " + classRoom + " " + String.format("%.2f",gpa);
    }
}
 class Teacher extends Person{
    private String dePartment;
    private int wage;

    public Teacher(String id, String name, String birth, String address, String dePartment, int wage, String classRoom) {
        super(id, name, birth, address, classRoom);
        this.dePartment = dePartment;
        this.wage = wage;
    }
    public String toString(){
        return super.toString() + " " + dePartment + " " + wage;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Teacher> teachers = new ArrayList<>();
        for(int i = 1; i <= n ;i++){
            String ma = sc.nextLine();
            if(ma.contains("SV")){
                students.add(new Student(ma, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble()));
                sc.nextLine();
            }
            else {
                String name = sc.nextLine();
                String birth = sc.nextLine();
                String address = sc.nextLine();
                String department = sc.nextLine();
                int wage = sc.nextInt();
                sc.nextLine();
                String classRoom = sc.nextLine();
                teachers.add(new Teacher(ma, name, birth, address, department, wage, classRoom));
            }
        }
        String local = sc.nextLine();

        System.out.println("DANH SACH GIAO VIEN CO DIA CHI TAI " + local + " :");
        for(Teacher x: teachers){
            if(x.getAddress().equals(local))
               System.out.println(x);
        }
        System.out.println("DANH SACH SINH VIEN CO DIA CHI TAI " + local + " :");
        for(Student x: students){
            if(x.getAddress().equals(local))
                System.out.println(x);
        }
    }
}
