package ASM;

import java.util.Scanner;

public class TruongPhong extends NhanVien {
    private double luongTrachNhiem;

    public TruongPhong(String maNhanVien, String hoTen, double luong, double luongTrachNhiem) {
        super(maNhanVien, hoTen, luong);
        this.luongTrachNhiem = luongTrachNhiem;
    }

    public double getLuongTrachNhiem() {
        return luongTrachNhiem;
    }

    public void setLuongTrachNhiem(double luongTrachNhiem) {
        this.luongTrachNhiem = luongTrachNhiem;
    }

    @Override
    double getThuNhap() {
        return luongCoBan + luongTrachNhiem;
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
        return "TruongPhong :" + super.toString() +
                "\n Luong trach nhiem: " + luongTrachNhiem +
                "\n Tong thu nhap: " + (getThuNhap()-getThue());
    }
}
