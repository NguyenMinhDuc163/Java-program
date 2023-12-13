/*
 * Trường đại học XYZ cần quản lý các đối tượng là sinh viên và giáo viên. Sinh viên gồm các thông tin : mã sinh viên, tên, ngày sinh, địa chỉ, lớp, điểm gpa. Giáo viên gồm các thông tin : mã giáo viên, tên, ngày sinh, địa chỉ, khoa, lương. Thực hiện đọc các thông tin danh sách sinh viên và giáo viên từ bàn phím sau đó chuẩn hóa tên, ngày sinh và in ra danh sách sinh viên sau đó là danh sách giáo viên, biết rằng sinh viên sẽ có mã bắt đầu bằng SV (ví dụ SV112), giáo viên có mã bắt đầu bằng GV (ví dụ GV222). Đầu tiên in ra danh sách giáo viên theo lương giảm dần, nếu 2 giáo viên có cùng lương thì in theo mã giáo viên tăng dần(từ điển), tiếp đó in ra danh sách sinh viên theo gpa giảm dần, nếu 2 sinh viên có cùng gpa thì in theo mã sinh viên tăng dần(từ điển).
 * Input Format

Dòng đầu tiên là N : số lượng giáo viên và sinh viên. Các dòng tiếp theo mô tả thông tin của giáo viên hoặc sinh viên, mỗi thông tin gồm 6 dòng, đối với sinh viên 6 dòng gồm : mã sinh viên, tên, ngày sinh, địa chỉ, lớp, điểm gpa, đối với giáo viên 6 dòng gồm : mã giáo viên, tên, ngày sinh, địa chỉ, khoa, lương.

Constraints

1<=N<=1000;

Output Format

Đầu tiên in ra danh sách giáo viên, mỗi giáo viên in ra thông tin trên 1 dòng, các thông tin cách nhau một dấu cách. Những dòng tiếp theo in ra danh sách sinh viên, mỗi sinh viên in thông tin trên 1 dòng, các thông tin cách nhau một dấu cách, gpa in 2 số sau dấu phẩy.

Sample Input 0

5
GV1
pham duC LoNG
4/3/1976
Ha Nam
CNTT
18000000
SV2
Vu AnH LoNG
3/11/2004
Hai Duong
DTVT1
2.70
SV3
trAN AnH NAM
27/11/2004
Nam Dinh
ATTT3
3.05
GV4
Nguyen VAn MaNH
12/4/1978
Ha Noi
Co khi
25000000
SV5
Luong Phuong HaI
3/4/2004
Nam Dinh
DTVT2
2.50
Sample Output 0

DANH SACH GIAO VIEN :
GV4 Nguyen Van Manh 12/04/1978 Ha Noi Co khi 25000000
GV1 Pham Duc Long 04/03/1976 Ha Nam CNTT 18000000
DANH SACH SINH VIEN :
SV3 Tran Anh Nam 27/11/2004 Nam Dinh ATTT3 3.05
SV2 Vu Anh Long 03/11/2004 Hai Duong DTVT1 2.70
SV5 Luong Phuong Hai 03/04/2004 Nam Dinh DTVT2 2.50
 */
import java.util.*;
 class Person {
    protected String id, name,birth, address;

    public Person(String id, String name, String birth, String address) {
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.address = address;
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

    public String getId() {
        return id;
    }

    public String toString(){
        stdName();
        stdBirth();
        return id + " " + name + " " + birth + " " + address;
    }
}
 class Student extends Person{
    private String classRoom;
    private double gpa;
    public Student(String id, String name, String birth, String address, String classRoom, double gpa){
        super(id, name, birth, address);
        this.classRoom = classRoom;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public String toString(){
        return super.toString() + " " + classRoom + " " + String.format("%.2f",gpa);
    }
}
 class Teacher extends Person{
    private String dePartment;
    private int wage;

    public Teacher(String id, String name, String birth, String address, String dePartment, int wage) {
        super(id, name, birth, address);
        this.dePartment = dePartment;
        this.wage = wage;
    }

    public int getWage() {
        return wage;
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
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Teacher> teachers = new ArrayList<>();
        for(int i = 1; i <= n ;i++){
            sc.nextLine();
            String ma = sc.nextLine();
            if(ma.contains("SV")){
                students.add(new Student(ma, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble()));
            }
            else {
                teachers.add(new Teacher(ma, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt()));
            }
        }
        students.sort((a, b) -> {
            if(a.getGpa() != b.getGpa()){
                return Double.compare(b.getGpa(), a.getGpa());
            }
            else return a.getId().compareTo(b.getId());
        });
        teachers.sort((a, b) -> {
            if(a.getWage() != b.getWage()){
                return b.getWage() - a.getWage();
            }
            else return a.getId().compareTo(b.getId());
        });
        System.out.println("DANH SACH GIAO VIEN :");
        for(Teacher x: teachers){
            System.out.println(x);
        }
        System.out.println("DANH SACH SINH VIEN :");
        for(Student x: students){
            System.out.println(x);
        }
    }
}
