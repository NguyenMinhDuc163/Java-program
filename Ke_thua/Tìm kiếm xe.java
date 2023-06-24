/*
 * Một cửa hàng bán oto, xe máy cần quản lý các loại xe máy và xe ô tô. Trong đó xe máy có những thông tin : mã xe, tên xe, hãng, màu sắc, tốc độ tối đa, giá bán. Xe ô tô có những thông tin : mã xe, tên xe, hãng, màu sắc, mã lực, giá bán. Nhập danh sách các phương tiện và tiến hành liệt kê các xe có tên tìm kiếm theo thứ tự xuất hiện trong danh sách. Biết rằng xe máy có mã bắt đầu bằng XM (ví dụ XM001), và ô tô có mã bắt đầu bằng OTO (ví dụ OTO521)
 * Input Format

Dòng đầu tiên chứa N : số lượng phương tiện. Các dòng tiếp theo mô tả phương tiện, nếu là xe máy thì gồm 6 dòng : mã xe, tên xe, hãng, màu sắc, tốc độ tối đa, giá bán, nếu là ô tô thì gồm 6 dòng : mã xe, tên xe, hãng, màu sắc, mã lực, giá bán. Dòng cuối cùng là tên xe cần tìm kiếm.

Constraints

1<=N<=1000;

Output Format

In ra các phương tiện có tên tìm kiếm. Đầu tiên liệt kê các xe oto sau đó liệt kê các xe máy. Các thông tin của phương tiện được in cách nhau một dấu cách

Sample Input 0

5
OTO1
HONDAT5
HONDA
Vang
186
850
XM2
HON112
HONDA
Xanh
200
40
XM3
HON112
HONDA
Vang
180
100
OTO4
TOY555
TOYOTA
Vang
150
2400
XM5
Ex
YAMAHA
Trang
220
28
TOY555
Sample Output 0

DANH SACH OTO :
OTO4 TOY555 TOYOTA Vang 150 2400
DANH SACH XE MAY :
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;

class Vehicle {
    private String ma, hang, ten, mauSac;
    private int giaBan;

    public Vehicle() {
    }
    
    
    public Vehicle(String ma, String hang, String ten, String mauSac, int giaBan) {
        this.ma = ma;
        this.hang = hang;
        this.ten = ten;
        this.mauSac = mauSac;
        this.giaBan = giaBan;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public String getHang() {
        return hang;
    }

    @Override
    public String toString() {
        return this.ma + " " + this.ten + " " + this.hang + " " + this.mauSac;
        
    }
    
    public String getMa(){
        return this.ma;
    }
    
    public String getTen(){
        return this.ten;
    }
    
}

class XeMay extends Vehicle{
    private int tocDo;


    public XeMay(int tocDo, String ma, String hang, String ten, String mauSac, int giaBan) {
        super(ma, hang, ten, mauSac, giaBan);
        this.tocDo = tocDo;
    }
    
    @Override 
    public String toString(){
        return super.toString() + " " + this.tocDo + " " + super.getGiaBan();
    }
    
}

class Oto extends Vehicle{
    private int maLuc;

    public Oto(int maLuc, String ma, String hang, String ten, String mauSac, int giaBan) {
        super(ma, hang, ten, mauSac, giaBan);
        this.maLuc = maLuc;
    }
    
    @Override
    public String toString(){
        return super.toString() + " " + this.maLuc + " " + super.getGiaBan();
    }
    
}


/**
 *
 * @author Andrew
 */
class SortXeMayByGia implements Comparator<XeMay>{
    public int compare(XeMay a, XeMay b){
        if(a.getGiaBan() != b.getGiaBan())
            return b.getGiaBan() - a.getGiaBan();
        return a.getMa().compareTo(b.getMa());
    }
}

class SortOtoByGia implements Comparator<Oto>{
    public int compare(Oto a, Oto b){
        if(a.getGiaBan() != b.getGiaBan())
            return b.getGiaBan() - a.getGiaBan();
        return a.getMa().compareTo(b.getMa());
    }
}


/**
 *
 * @author Andrew
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<XeMay> arr1 = new ArrayList<>();
        List<Oto> arr2 = new ArrayList<>();
        sc.nextLine();
        for(int i = 0; i < n; i++){
            String ma = sc.nextLine();
            if(ma.substring(0, 2).equals("XM")){
                String ten = sc.nextLine();
                String hang = sc.nextLine();
                String mau = sc.nextLine();
                int tocDo = Integer.parseInt(sc.nextLine());
                int giaBan = Integer.parseInt(sc.nextLine());
                XeMay m1 = new XeMay(tocDo, ma, hang, ten, mau, giaBan);
                arr1.add(m1);
            }
            else{
                String ten = sc.nextLine();
                String hang = sc.nextLine();
                String mau = sc.nextLine();
                int maLuc = Integer.parseInt(sc.nextLine());
                int giaBan = Integer.parseInt(sc.nextLine());
                Oto o1 = new Oto(maLuc, ma, hang, ten, mau, giaBan);
                arr2.add(o1);
            }
        }
        String s = sc.nextLine();
        System.out.println("DANH SACH OTO :");
        for(Oto x : arr2){
            if(x.getTen().equals(s))
                System.out.println(x);
        }
        System.out.println("DANH SACH XE MAY :");
        for(XeMay x : arr1){
            if(x.getTen().equals(s))
                System.out.println(x);
        }
    }
}