package ASM;

import java.util.Scanner;

public class TiepThi extends NhanVien {
    private double doanhSo;
    private double hueHong;

    public TiepThi(String maNhanVien, String hoTen, double luong, double doanhSo, double hueHong) {
        super(maNhanVien, hoTen, luong);
        this.doanhSo = doanhSo;
        this.hueHong = hueHong;
    }


    public double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public double getHueHong() {
        return hueHong;
    }

    public void setHueHong(double hueHong) {
        this.hueHong = hueHong;
    }

    @Override
    double getThuNhap() {
        return luongCoBan + doanhSo + hueHong;
    }

    @Override
    double getThue() {
        if (getThuNhap() < 900) {
            return 0;
        } else if (getThuNhap() < 1500) {
            return getThuNhap() * 0.01;
        } else {
            return getThuNhap() * 0.12;
        }
    }

    @Override
    public String toString() {
        return "Nhan vien tiep thi: " + super.toString() +
                "\n Doanh so: " + doanhSo +
                "\n Hue hong: " + hueHong +
                "\n Tong thu nhap: " + (getThuNhap() - getThue());
    }
}
