package ASM;

public class HanhChinh extends NhanVien {
    public HanhChinh(String maNhanVien, String hoTen, double luong) {
        super(maNhanVien, hoTen, luong);
    }

    @Override
    double getThuNhap() {
        return luongCoBan;
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
        return "Nhan vien hanh chinh: " + super.toString() +
                "\n Tong thu nhap: " + (getThuNhap()-getThue());
    }
}
