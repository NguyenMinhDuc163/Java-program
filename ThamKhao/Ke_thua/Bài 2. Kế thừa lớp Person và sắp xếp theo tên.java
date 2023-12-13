/*
  
 * Xây dựng lớp Person với các thuộc tính : Tên (xâu kí tự không quá 100 kí tự), ngày sinh, địa chỉ và các hàm khởi tạo không tham số (gán các trường là xâu rỗng) và hàm khởi tạo đầy đủ tham số, phương thức toString để trả về thông tin. Lớp Student kế thừa từ lớp Person và có thêm thuộc tính là mã sinh viên, GPA và lớp, ghi đè phương thức toString. Nhập danh sách sinh viên từ bàn phím và in ra màn hình danh sách sinh viên trong đó tên được chuẩn hóa và ngày sinh đưa về đúng chuẩn dd/mm/yyyy. Tên sinh viên được sắp xếp theo thứ tự từ điển tăng dần, thứ tự từ điển của tên được xét từ tên, họ, đệm. Nếu 2 bạn cùng tên thì bạn nào xuất hiện trong danh sách trước được in ra trước.
 * 
 * Input Format

Dòng 1 là N : số lượng sinh viên. Các dòng tiếp theo là thông tin sinh viên, mỗi sinh viên được mô tả bằng 5 dòng : Tên, ngày sinh, địa chỉ, lớp, gpa.

Constraints

1<=N<=1000;

Output Format

In ra danh sách sinh viên sau khi được chuẩn hóa, mã sinh viên tăng tự động từ 0001. Các thông tin viết cách nhau một dấu cách, điểm GPA in ra với 2 số sau dấu phẩy.

Sample Input 0
6
trAN Phuong HaI
17/4/2004
Ha Noi
DTVT1
2.50
trAN Phuong TuaN
28/1/2004
Ha Nam
DTVT1
2.50
Nguyen AnH MaNH
11/3/2004
Ha Noi
CNTT1
2.70
pham duC TuaN
21/5/2004
Ha Noi
DTVT1
2.50
trAN VAn LoNG
24/6/2004
Ha Noi
CNTT1
2.80
Luong Ngoc LoNG
12/11/2004
Nam Dinh
CNTT2
3.05
Sample Output 0

0001 Tran Phuong Hai 17/04/2004 Ha Noi DTVT1 2.50
0006 Luong Ngoc Long 12/11/2004 Nam Dinh CNTT2 3.05
0005 Tran Van Long 24/06/2004 Ha Noi CNTT1 2.80
0003 Nguyen Anh Manh 11/03/2004 Ha Noi CNTT1 2.70
0004 Pham Duc Tuan 21/05/2004 Ha Noi DTVT1 2.50
0002 Tran Phuong Tuan 28/01/2004 Ha Nam DTVT1 2.50
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

class Person {
    private String ten, ngaySinh, diaChi;

    public Person() {
        ten = ngaySinh = diaChi = "";
    }

    public Person(String ten, String ngaySinh, String diaChi) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }
    
    public void chuanHoa(){
        String[] arr = this.ten.split("\\s+");
        String res = "";
        for(String x : arr){
            res += Character.toUpperCase(x.charAt(0));
            for(int j = 1; j < x.length(); j++){
                res += Character.toLowerCase(x.charAt(j));
            }
            res += " ";
        }
        this.ten = res.substring(0, res.length() - 1);
        StringBuilder sb = new StringBuilder(this.ngaySinh);
        if(sb.charAt(1) == '/') sb.insert(0, "0");
        if(sb.charAt(4) == '/') sb.insert(3, "0");
        this.ngaySinh = sb.toString();
    }
    //Nguyen Van Nam => NamNguyenVan
    public String getSortedName(){
        String[] arr = this.ten.split("\\s+");
        String res = arr[arr.length - 1];
        for(int i = 0; i < arr.length - 1; i++){
            res += arr[i] + " ";
        }
        return res;
    }
    
    @Override
    public String toString(){
        return this.ten + " " + this.ngaySinh + " " + this.diaChi;
    }
}

class Student extends Person{
    private String maSinhVien, lop;
    private double gpa;

    public Student(int maSinhVien, String lop, double gpa, String ten, String ngaySinh, String diaChi) {
        super(ten, ngaySinh, diaChi);
        this.maSinhVien = String.format("%04d", maSinhVien);
        this.lop = lop;
        this.gpa = gpa;
    }
    @Override
    public String toString(){
        return this.maSinhVien + " " + super.toString() + " " + this.lop + " " + String.format("%.2f", this.gpa);
    }
}


public class Main {

    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            sc.nextLine();
            String ten = sc.nextLine();
            String ngaySinh = sc.nextLine();
            String diaChi = sc.nextLine();
            String lop = sc.nextLine();
            double diem = sc.nextDouble();
            
            Student sinhVien = new Student(i + 1, lop, diem, ten, ngaySinh, diaChi);
            sinhVien.chuanHoa();
            arr.add(sinhVien);
        }
        Collections.sort(arr, new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getSortedName().compareTo(o2.getSortedName());
            }
        });
        for(Student x : arr){
            System.out.println(x);
        }
    }
}