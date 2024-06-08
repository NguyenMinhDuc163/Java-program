//package thuchanh.Bai14;
//
//public class HoiDong {
//    private String msv;
//    private String maDetai;
//
//
//
//    private String maHoiDong;
//    private SinhVien sinhVien;
//    private DeTai deTai;
//    public HoiDong(String msv, String maDetai, String maHoiDong) {
//        this.msv = msv;
//        this.maDetai = maDetai;
//        this.maHoiDong = maHoiDong;
//        sinhVien = new SinhVien();
//        deTai = new DeTai();
//    }
//    public String getMaHoiDong() {
//        return maHoiDong;
//    }
//    public String getIdxSV(){
//        return sinhVien.getIdx();
//    }
//    public String getNameSV(){
//        return sinhVien.getNameSV();
//    }
//    public void setSinhVien(SinhVien sinhVien) {
//        this.sinhVien = sinhVien;
//    }
//
//    public void setDeTai(DeTai deTai) {
//        this.deTai = deTai;
//    }
//
//    @Override
//    public String toString() {
//        return sinhVien.toString() + deTai.toString();
//    }
//}
