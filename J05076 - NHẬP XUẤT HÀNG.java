import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.HashMap;

 class MatHang {
    private String idx,name, type;
    private double totalIn , totalOut , pricein , priceOut;
    private int quanlity;

    public void setQuanlity(int quanlity) {
        this.quanlity = quanlity;
    }

    private static HashMap<String, Double> rate = new HashMap<>();

    public MatHang(String idx, String name, String type) {
        this.idx = idx;
        this.name = name;
        this.type = type;
        rate.put("A", 0.08);
        rate.put("B", 0.05);
        rate.put("C", 0.02);
    }
    public void solveProfit(){
        totalIn = pricein * quanlity;
        totalOut = priceOut * (1 + rate.get(type)) * quanlity;
    }
    public void setPricein(double pricein) {
        this.pricein = pricein;
    }

    public void setPriceOut(double priceOut) {
        this.priceOut = priceOut;
    }

    public String getType() {
        return type;
    }

    public String getIdx() {
        return idx;
    }

    public String toString(){
        solveProfit();
        return String.format("%s %s %.0f %.0f", idx, name, totalIn, totalOut);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<MatHang> matHangs = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            matHangs.add(new MatHang(sc.nextLine(), sc.nextLine(),sc.nextLine()));
        }
        int t = sc.nextInt();;
        while(t --> 0){
            String ma = sc.next();
            int nhap = sc.nextInt(), sl = sc.nextInt(), xuat = sc.nextInt();
            for(MatHang x: matHangs){
                if(ma.equals(x.getIdx())){
                    x.setPricein(nhap);
                    x.setPriceOut(xuat);
                    x.setQuanlity(sl);
                    System.out.println(x);
                }
            }
            ;
        }
    }
}
