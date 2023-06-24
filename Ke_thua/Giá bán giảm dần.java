/*
 * Một cửa hàng bán oto, xe máy cần quản lý các loại xe máy và xe ô tô. Trong đó xe máy có những thông tin : mã xe, tên xe, hãng, màu sắc, tốc độ tối đa, giá bán. Xe ô tô có những thông tin : mã xe, tên xe, hãng, màu sắc, mã lực, giá bán. Nhập danh sách các phương tiện và tiến hành liệt kê các xe theo thứ tự giá bán giảm dần, nếu 2 xe có cùng giá bán thì liệt kê theo thứ tự mã xe tăng dần(từ điển). Biết rằng xe máy có mã bắt đầu bằng XM (ví dụ XM001), và ô tô có mã bắt đầu bằng OTO (ví dụ OTO521)
 * Input Format

Dòng đầu tiên chứa N : số lượng phương tiện. Các dòng tiếp theo mô tả phương tiện, nếu là xe máy thì gồm 6 dòng : mã xe, tên xe, hãng, màu sắc, tốc độ tối đa, giá bán, nếu là ô tô thì gồm 6 dòng : mã xe, tên xe, hãng, màu sắc, mã lực, giá bán.

Constraints

1<=N<=1000;

Output Format

In ra danh sách ô tô sau đó in ra danh sách xe máy, các thông tin của phương tiện được in cách nhau một dấu cách

Sample Input 0

6
OTO1
TU2
NISSAN
Den
196
1200
XM2
SYM125
SYM
Den
200
30
XM3
SYM125
SYM
Den
200
40
OTO4
TOY555
TOYOTA
Vang
186
600
XM5
Z1000
KAWASAKI
Xanh
180
25
XM6
SUZ221
SUZUKI
Trang
220
30
Sample Output 0

DANH SACH OTO :
OTO1 TU2 NISSAN Den 196 1200
OTO4 TOY555 TOYOTA Vang 186 600
DANH SACH XE MAY :
XM3 SYM125 SYM Den 200 40
XM2 SYM125 SYM Den 200 30
XM6 SUZ221 SUZUKI Trang 220 30
XM5 Z1000 KAWASAKI Xanh 180 25
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Collections;

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

    public String getMa() {
        return ma;
    }

    
    @Override
    public String toString() {
        return this.ma + " " + this.ten + " " + this.hang + " " + this.mauSac;
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

class SortXeMayByGia implements Comparator<XeMay>{
    @Override
    public int compare(XeMay o1, XeMay o2) {
        if(o1.getGiaBan() != o2.getGiaBan())
            return o2.getGiaBan() - o1.getGiaBan();
        else
            return o1.getMa().compareTo(o2.getMa());
    }
}

class SortOtoByGia implements Comparator<Oto>{
    @Override
    public int compare(Oto o1, Oto o2) {
        if(o1.getGiaBan() != o2.getGiaBan())
            return o2.getGiaBan() - o1.getGiaBan();
        else
            return o1.getMa().compareTo(o2.getMa());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<XeMay> arr1 = new ArrayList<>();
        ArrayList<Oto> arr2 = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String hang = sc.nextLine();
            String mau = sc.nextLine();
            int tmp = Integer.parseInt(sc.nextLine());
            int gia = Integer.parseInt(sc.nextLine());
            if(ma.substring(0, 2).equals("XM")){
                XeMay xeMay = new XeMay(tmp, ma, ten, hang, mau, gia);
                arr1.add(xeMay);
            }
            else{
                Oto oto = new Oto(tmp, ma, ten, hang, mau, gia);
                arr2.add(oto);
            }
        }
        Collections.sort(arr1, new SortXeMayByGia());
        Collections.sort(arr2, new SortOtoByGia());
        System.out.println("DANH SACH OTO :");
        for(Oto x : arr2){
            System.out.println(x);
        }
        System.out.println("DANH SACH XE MAY :");
        for(XeMay x : arr1){
            System.out.println(x);
        }
    }
}