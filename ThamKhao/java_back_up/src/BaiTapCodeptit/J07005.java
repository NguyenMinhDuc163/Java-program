package BaiTapCodeptit;

import java.io.*;

public class J07005 {
    public static void main(String[] args) throws IOException {
        DataInputStream inputStream = new DataInputStream(new FileInputStream("DATA.in"));
        int []a = new int[1005];
        for(int i = 0; i < 100000; i++){
            a[inputStream.readInt()]++;
        }
        for(int i = 0; i < 1000; i++){
            if(a[i] > 0){
                System.out.println(i + " " + a[i]);
            }
        }
    }
}
