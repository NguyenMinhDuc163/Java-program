/*
 * Một cửa hàng bán oto, xe máy cần quản lý các loại xe máy và xe ô tô. Trong đó xe máy có những thông tin : mã xe, tên xe, hãng, màu sắc, tốc độ tối đa, giá bán. Xe ô tô có những thông tin : mã xe, tên xe, hãng, màu sắc, mã lực, giá bán. Nhập danh sách các phương tiện và tiến hành liệt kê các xe theo hãng cần tìm kiếm. Biết rằng xe máy có mã bắt đầu bằng XM (ví dụ XM001), và ô tô có mã bắt đầu bằng OTO (ví dụ OTO521)
 * Input Format

Dòng đầu tiên chứa N : số lượng phương tiện. Các dòng tiếp theo mô tả phương tiện, nếu là xe máy thì gồm 6 dòng : mã xe, tên xe, hãng, màu sắc, tốc độ tối đa, giá bán, nếu là ô tô thì gồm 6 dòng : mã xe, tên xe, hãng, màu sắc, mã lực, giá bán. Dòng cuối cùng là hãng xe cần tìm kiếm

Constraints

1<=N<=1000;

Output Format

In ra xe máy hoặc oto có hãng trùng với hãng tìm kiếm theo thứ tự xuất hiện, các thông tin của phương tiện được in cách nhau một dấu cách. Danh sách ô tô được liệt kê trước danh sách xe máy.

Sample Input 0
6
OTO1
TU2
NISSAN
Do
186
1200
XM2
SYM125
SYM
Do
200
100
XM3
SYM125
SYM
Vang
200
30
OTO4
F89
FORD
Do
204
850
XM5
HON112
HONDA
Trang
320
25
XM6
Z1000
KAWASAKI
Xanh
320
40
NISSAN
Sample Output 0

DANH SACH XE HANG NISSAN :
OTO1 TU2 NISSAN Do 186 1200
 */
import java.util.Scanner;
import java.util.ArrayList;
class Vehicle {
    private String ma, ten, hang, mauSac;
    private int giaBan;

    public Vehicle(String ma, String ten, String hang, String mauSac, int giaBan) {
        this.ma = ma;
        this.ten = ten;
        this.hang = hang;
        this.mauSac = mauSac;
        this.giaBan = giaBan;
    }
    
    public int getGiaBan(){
        return this.giaBan;
    }

    public String getHang() {
        return hang;
    }

    
    @Override
    public String toString() {
        return this.ma + " " + this.ten + " " + this.hang + " " + this.mauSac;
    }
}

class Oto extends Vehicle{
    private int maLuc;

    public Oto(int maLuc, String ma, String ten, String hang, String mauSac, int giaBan) {
        super(ma, ten, hang, mauSac, giaBan);
        this.maLuc = maLuc;
    }
    
    @Override
    public String toString(){
        return super.toString() + " " + this.maLuc + " " + super.getGiaBan();
    }
}

class XeMay extends Vehicle{
    private int tocDo;

    public XeMay(int tocDo, String ma, String ten, String hang, String mauSac, int giaBan) {
        super(ma, ten, hang, mauSac, giaBan);
        this.tocDo = tocDo;
    }
    
    @Override
    public String toString(){
        return super.toString() + " " + this.tocDo + " " + super.getGiaBan();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Vehicle> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String hang = sc.nextLine();
            String mau = sc.nextLine();
            int tmp = Integer.parseInt(sc.nextLine());
            int gia = Integer.parseInt(sc.nextLine());
            if(ma.substring(0, 2).equals("XM")){
                XeMay xeMay = new XeMay(tmp, ma, ten, hang, mau, gia);
                arr.add(xeMay);
            }
            else{
                Oto oto = new Oto(tmp, ma, ten, hang, mau, gia);
                arr.add(oto);
            }
        }
        String hangXe = sc.nextLine();
        System.out.println("DANH SACH XE HANG " + hangXe + " :");
        for(Vehicle x : arr){
            if((x instanceof Oto) && x.getHang().equals(hangXe)){
                System.out.println(x);
            }
        }
        for(Vehicle x : arr){
            if((x instanceof XeMay) && x.getHang().equals(hangXe)){
                System.out.println(x);
            }
        }
    }
}