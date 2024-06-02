package ASM;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int chon;
        Scanner sc = new Scanner(System.in);
        NhanVienService nhanVienService = new NhanVienService();

        do {
            System.out.println("+----------------------------------------------------------+");
            System.out.println("| 1. Nhap danh sach nhan vien tu ban phim                  |");
            System.out.println("| 2. Xuat danh sach nhan vien ra man hinh                  |");
            System.out.println("| 3. Tim va hien thi nhan vien theo ma nhap tu ban phim    |");
            System.out.println("| 4. Xoa nhan vien theo ma nhap tu ban phim                |");
            System.out.println("| 5. Cap nhap thong tin nhan vien theo ma nhap tu ban phim |");
            System.out.println("| 6. Tim cac nhan vien theo khoang luong nhap tu ban phim  |");
            System.out.println("| 7. Sap xep nhan vien theo ho va ten                      |");
            System.out.println("| 8. Sap xep nhan vien theo thu nhap                       |");
            System.out.println("| 9. Xuat 5 nhan vien co thu nhap cao nhat                 |");
            System.out.println("| 10. Thoat                                                |");
            System.out.println("+----------------------------------------------------------+");
            System.out.println("Moi ban chon chuc nang:");
            chon = sc.nextInt();
            switch (chon) {
                case 1 -> {
                    System.out.println("1. Nhap danh sach nhan vien tu ban phim");
                    System.out.println("Nhap thong tin nhan vien thu :");
                    nhanVienService.nhap();
                }

                case 2 -> {
                    System.out.println("2. Xuat danh sach nhan vien ra man hinh");
                    System.out.println("Thong tin nhan vien");
                    nhanVienService.xuat();
                }

                case 3 -> {
                    System.out.println("3. Tim va hien thi nhan vien theo ma nhap tu ban phim");
                    nhanVienService.timNV();
                }

                case 4 -> {
                    System.out.println("4. Xoa nhan vien theo ma nhap tu ban phim");
                    nhanVienService.xoa();

                }

                case 5 -> {
                    System.out.println("5. Cap nhap thong tin nhan vien theo ma nhap tu ban phim");
                    nhanVienService.capNhap();
                }

                case 6 -> {
                    System.out.println("6. Tim cac nhan vien theo khoang luong nhap tu ban phim");
                    nhanVienService.timLuong();
                }

                case 7 -> {
                    System.out.println("7. Sap xep nhan vien theo ho va ten");
                    nhanVienService.xepHoTen();
                }

                case 8 -> {
                    System.out.println("8. Sap xep nhan vien theo thu nhap");
                    nhanVienService.xepthuNhap();
                }

                case 9 -> {
                    System.out.println("9. Xuat 5 nhan vien co thu nhap cao nhat");
                    nhanVienService.top5();
                }

                case 10 -> {
                    System.out.println("10. Thoat");
                    System.out.println("Cam on ban da su dung chuong trinh");
                    System.exit(0);
                }

                default -> {
                    System.out.println("Chuc nang ban chon khong phu hop");
                }
            }
        } while (true);
    }
}
