//package thuchanh.Bai14;
//
//import java.io.*;
//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) throws FileNotFoundException {
//        Scanner in1 = new Scanner(new File("SINHVIEN.in"));
//        Scanner in2 = new Scanner(new File("DETAI.in"));
//        Scanner in3 = new Scanner(new File("HOIDONG.in"));
//        List<SinhVien> sinhViens = new ArrayList<>();
//        List<DeTai> deTais = new ArrayList<>();
//        List<HoiDong> hoiDongs = new ArrayList<>();
//        Map<String, Integer> mp = new HashMap<>();
//        int n = in1.nextInt();
//        in1.nextLine();
//        for (int i = 1; i <= n; i++) {
//            sinhViens.add(new SinhVien(in1.nextLine(), in1.nextLine(), in1.nextLine(), in1.nextLine()));
//        }
//        int m = in2.nextInt();
//        in2.nextLine();
//        for (int i = 1; i <= m; i++) {
//            deTais.add(new DeTai(i, in2.nextLine(), in2.nextLine()));
//        }
//        int k = in3.nextInt();
//        in3.nextLine();
//        for (int i = 1; i <= k; i++) {
//            String msv = in3.next();
//            String maDT = in3.next();
//            String HD = in3.next();
//            HoiDong hoiDong = new HoiDong(msv, maDT, HD);
//            for (SinhVien x : sinhViens) {
//                if (x.getIdx().equals(msv)) {
//                    hoiDong.setSinhVien(x);
//                }
//            }
//            for (DeTai x : deTais) {
//                if (x.getIdx().equals(maDT)) {
//                    hoiDong.setDeTai(x);
//                }
//            }
//            mp.put(HD, mp.getOrDefault(HD, 0) + 1);
//            hoiDongs.add(hoiDong);
//        }
//        hoiDongs.sort(Comparator.comparing(HoiDong::getIdxSV));
//        for (int i = 1; i <= 8; i++) {
//            String tmp = "HD" + i;
//            int check = 0;
//            try {
//                 check = mp.get(tmp);
//            }catch (Exception e){}
//            if(check > 0){
//                System.out.println("DANH SACH HOI DONG " + i + ":");
//                for (HoiDong x : hoiDongs) {
//                    if (tmp.equals(x.getMaHoiDong()))
//                        System.out.println(x);
//                }
//            }
//        }
//    }
//}
