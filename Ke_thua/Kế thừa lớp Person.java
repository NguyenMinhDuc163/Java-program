/*
 Xây dựng lớp Person với các thuộc tính : Tên (xâu kí tự không quá 100 kí tự), ngày sinh, địa chỉ và các hàm khởi tạo không tham số (gán các trường là xâu rỗng) và hàm khởi tạo đầy đủ tham số, phương thức toString để trả về thông tin. Lớp Student kế thừa từ lớp Person và có thêm thuộc tính là mã sinh viên, GPA và lớp, ghi đè phương thức toString. Nhập danh sách sinh viên từ bàn phím và in ra màn hình danh sách sinh viên trong đó tên được chuẩn hóa và ngày sinh đưa về đúng chuẩn dd/mm/yyyy.

Mã nguồn tham khảo :
Input Format

Dòng 1 là N : số lượng sinh viên. Các dòng tiếp theo là thông tin sinh viên, mỗi sinh viên được mô tả bằng 5 dòng :

Tên

Ngày sinh, địa chỉ

Lớp

Gpa.

Cần tách ngày sinh và địa chỉ của sinh viên.

Constraints

1<=N<=1000;

Output Format

In ra danh sách sinh viên sau khi được chuẩn hóa, mã sinh viên tăng tự động từ 0001. Các thông tin viết cách nhau một dấu cách, điểm GPA in ra với 2 số sau dấu phẩy.

Sample Input 0

7
Nguyen AnH MaNH
27/8/2004Nam Dinh
CNTT2
2.70
pham Phuong TuaN
21/9/2004Nam Dinh
CNTT1
2.70
Vu Ngoc NAM
7/9/2004Nam Dinh
CNTT2
3.05
Vu AnH LoNG
17/12/2004Ha Noi
CNTT1
2.80
Nguyen Phuong NAM
23/6/2004Ha Nam
HTTT3
2.80
Luong AnH NAM
16/1/2004Thai Binh
DTVT1
2.80
Nguyen Phuong HaI
14/1/2004Nam Dinh
DTVT1
3.05
Sample Output 0

0001 Nguyen Anh Manh 27/08/2004 Nam Dinh CNTT2 2.70
0002 Pham Phuong Tuan 21/09/2004 Nam Dinh CNTT1 2.70
0003 Vu Ngoc Nam 07/09/2004 Nam Dinh CNTT2 3.05
0004 Vu Anh Long 17/12/2004 Ha Noi CNTT1 2.80
0005 Nguyen Phuong Nam 23/06/2004 Ha Nam HTTT3 2.80
0006 Luong Anh Nam 16/01/2004 Thai Binh DTVT1 2.80
0007 Nguyen Phuong Hai 14/01/2004 Nam Dinh DTVT1 3.05

 */

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
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            sc.nextLine();
            String ten = sc.nextLine();
            String s = sc.nextLine();
            String lop = sc.nextLine();
            double diem = sc.nextDouble();
            String ngaySinh = "", diaChi = "";
            for(char x : s.toCharArray()){
                if(Character.isDigit(x) || x == '/'){
                    ngaySinh += x;
                }
                else diaChi += x;
            }
            Student sinhVien = new Student(i + 1, lop, diem, ten, ngaySinh, diaChi);
            sinhVien.chuanHoa();
            System.out.println(sinhVien);
        }
    }
}