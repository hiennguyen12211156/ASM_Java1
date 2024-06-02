package ASM;

import java.util.Scanner;

public abstract class NhanVien {
    protected String maNhanVien;
    protected String hoTen;
    protected double luongCoBan;

    public NhanVien(String maNhanVien, String hoTen, double luong) {
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.luongCoBan = luong;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuong(double luong) {
        this.luongCoBan = luong;
    }

    @Override
    public String toString() {
        return "\n Ma nhan vien: " + maNhanVien + "\n Ho ten: " + hoTen + "\n Luong: " + luongCoBan;
    }

    abstract double getThuNhap();

    abstract double getThue();
}
