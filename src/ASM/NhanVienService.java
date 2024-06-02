package ASM;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class NhanVienService {
    ArrayList<NhanVien> list = new ArrayList<>();
    private Scanner sc;

    public NhanVienService() {
        sc = new Scanner(System.in);
    }

    public void nhap() {
        System.out.println("So nhan vien: ");
        int soLuong = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhap ma nhan vien: ");
            String ma = sc.nextLine();
            System.out.println("Nhap ho ten nhan vien:");
            String hoTen = sc.nextLine();
            System.out.println("Nhap luong nhan vien:");
            double luong = sc.nextDouble();
            sc.nextLine();
            System.out.println("Nhan vien ( Hanh chinh / Tiep thi / Truong phong)");
            String chon = sc.nextLine();
            if (chon.equalsIgnoreCase("Hanh chinh")) {
                HanhChinh hanhChinh = new HanhChinh(ma, hoTen, luong);
                list.add(hanhChinh);
            } else if (chon.equalsIgnoreCase("Tiep thi")) {
                System.out.println("Nhap doanh so:");
                double doanhSo = sc.nextDouble();
                System.out.println("Nhap hue hong:");
                double hueHong = sc.nextDouble();
                sc.nextLine();
                TiepThi tiepThi = new TiepThi(ma, hoTen, luong, doanhSo, hueHong);
                list.add(tiepThi);
            } else if (chon.equalsIgnoreCase("Truong phong")) {
                System.out.println("Nhap luong trach nhiem");
                double trachNhiem = sc.nextDouble();
                sc.nextLine();
                TruongPhong truongPhong = new TruongPhong(ma, hoTen, luong, trachNhiem);
                list.add(truongPhong);
            } else {
                System.out.println("Loi cu phap, moi nhap lai");
            }
        }
    }

    public void xuat() {
        for (NhanVien nhanVien : list) {
            if (nhanVien instanceof TiepThi) {
                System.out.println(nhanVien);
            } else if (nhanVien instanceof HanhChinh) {
                System.out.println(nhanVien);
            } else if (nhanVien instanceof TruongPhong) {
                System.out.println(nhanVien);
            } else {
                System.out.println("khong hop le");
            }
        }
    }

    public void timNV() {
        System.out.println("Moi nhap ma nhan vien:");
        String ma = sc.nextLine();
        boolean found = false;
        for (NhanVien nhanVien : list) {
            if (nhanVien.getMaNhanVien().equalsIgnoreCase(ma)) {
                System.out.println(nhanVien);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay ma nhan vien");
        }
    }

    public void xoa() {
        System.out.println("Moi nhap ma nhan vien: ");
        String ma = sc.nextLine();
        boolean found = false;
        for (NhanVien nhanVien : list) {
            if (nhanVien.getMaNhanVien().equalsIgnoreCase(ma)) {
                list.remove(nhanVien);
                System.out.println("Da xoa thanh cong");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay ma nhan vien");
        }
    }

    public void capNhap() {
        System.out.println("Moi nhap ma nhan vien: ");
        String ma = sc.nextLine();
        boolean found = false;
        for (NhanVien nhanVien : list) {
            if (nhanVien.getMaNhanVien().equalsIgnoreCase(ma)) {
                System.out.println("Nhap ma nhan vien moi: ");
                String maMoi = sc.nextLine();
                System.out.println("Nhap ho ten moi: ");
                String hoTen = sc.nextLine();
                System.out.println("Nhap luong moi: ");
                double luongMoi = sc.nextDouble();
                sc.nextLine();
                nhanVien.setLuong(luongMoi);
                nhanVien.setHoTen(hoTen);
                nhanVien.setMaNhanVien(maMoi);
                if (nhanVien instanceof TiepThi) {
                    System.out.println("Nhap doanh so moi:");
                    double doanhSoMoi = sc.nextDouble();
                    System.out.println("Nhap hue hong moi: ");
                    double hueHongMoi = sc.nextDouble();
                    sc.nextLine();
                    ((TiepThi) nhanVien).setDoanhSo(doanhSoMoi);
                    ((TiepThi) nhanVien).setHueHong(hueHongMoi);
                } else if (nhanVien instanceof TruongPhong) {
                    System.out.println("Nhap luong trach nhiem moi:");
                    double trachNhiemMoi = sc.nextDouble();
                    sc.nextLine();
                    ((TruongPhong) nhanVien).setLuongTrachNhiem(trachNhiemMoi);
                }
                System.out.println("Cap nhap thanh cong");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay ma nhan vien");
        }
    }
    public void timLuong() {
        System.out.println("Nhap khoang luong nhap nhat:");
        double min = sc.nextDouble();
        System.out.println("Nhap khoang luong lon nhat:");
        double max = sc.nextDouble();
        sc.nextLine();
        boolean found = false;
        System.out.println("Cac nhan vien co muc luong tu " + min + " den " + max);
        for (NhanVien nhanVien : list) {
            double thuNhap = nhanVien.getThuNhap() - nhanVien.getThue();
            if(thuNhap > min && thuNhap < max) {
                System.out.println(nhanVien);
                found = true;
            }
        }
        if(!found) {
            System.out.println("Khong tim thay nhan vien trong khoang luong nay");
        }
    }
    public void xepHoTen () {
        Comparator<NhanVien> nhanVienComparator = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return o1.getHoTen().compareTo(o2.getHoTen());
            }
        };
        Collections.sort(list,nhanVienComparator);
        System.out.println("Danh sach sau khi sap xep theo ten:");
        for (NhanVien nhanVien : list) {
            System.out.println(nhanVien);
        }
    }

    public void xepthuNhap() {
        Comparator<NhanVien> nhanVienComparator = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                double thuNhap1 = o1.getThuNhap() - o1.getThue();
                double thuNhap2 = o2.getThuNhap() - o2.getThue();
                return Double.compare(thuNhap1,thuNhap2);
            }
        };
        Collections.sort(list,nhanVienComparator);
        System.out.println("Danh sach sau khi sap xep theo luong");
        for (NhanVien nhanVien : list) {
            System.out.println(nhanVien);
        }
    }

    public void top5 () {
        Comparator<NhanVien> nhanVienComparator = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                double thuNhap1 = o1.getThuNhap() - o1.getThue();
                double thuNhap2 = o2.getThuNhap() - o2.getThue();
                return Double.compare(thuNhap1,thuNhap2);
            }
        };
        Collections.sort(list,nhanVienComparator);
        Collections.reverse(list);
        System.out.println("Danh sach 5 nhan vien co luong cao nhat");
        int dem = 0;
        for (NhanVien nhanVien : list) {
            if ( dem < 5) {
                System.out.println(nhanVien);
                dem ++;
            } else {
                break;
            }
        }
    }

}
