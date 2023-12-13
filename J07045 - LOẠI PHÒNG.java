package codeptit;

import java.io.*;
import java.util.*;

class LoaiPhong implements Comparable<LoaiPhong>{
    private final String idx, name;
    private final int unitPrice;
    private final double fee;

    public LoaiPhong(String s) {
        String []tmp = s.split("\\s+");
        this.idx = tmp[0];
        this.name = tmp[1];
        this.unitPrice = Integer.parseInt(tmp[2]);
        this.fee = Double.parseDouble(tmp[3]);
    }

    public String getName() {
        return name;
    }
    public int compareTo(LoaiPhong o){
        return name.compareTo(o.getName());
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %.2f", idx, name, unitPrice, fee);
    }
}
public class J07045 {
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
    public static void main8901912(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}

