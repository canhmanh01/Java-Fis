package fis.java.topic_02.collections01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		MonHoc monHoc1=new MonHoc("Cau Truc Du Lieu 1", 1, 2);
		MonHoc monHoc2=new MonHoc("Cau Truc Du Lieu 2", 2, 2);
		Diem diem1=new Diem(monHoc1, 6);
		Diem diem2=new Diem(monHoc1, 7);
		Diem diem3=new Diem(monHoc1, 2);
		Diem diem4=new Diem(monHoc2, 8);
		Diem diem5=new Diem(monHoc2, 4);
		Diem diem6=new Diem(monHoc2, 7);
		SinhVien sv1=new SinhVien("0203044", "Nguyen Van A");
		sv1.themDiem(diem2);
		sv1.themDiem(diem4);
		SinhVien sv2=new SinhVien("678919", "Nguyen Van B");
		sv2.themDiem(diem3);
		sv2.themDiem(diem5);
		SinhVien sv3=new SinhVien("112456", "Nguyen Van C");
		sv3.themDiem(diem1);
		sv3.themDiem(diem6);
		LopHoc lopHoc1= new LopHoc("Lop Hoc 1", "Giao Vien 1");
		lopHoc1.them(sv1);
		lopHoc1.them(sv2);
		lopHoc1.them(sv3);
//		System.out.println("Diem trung binh sinh vien 1 : "+sv1.tinhDiemTrungBinh());
//		System.out.println("\nBang diem sinh vien 1 :\n"+sv1.bangDiem());
//		System.out.println("\nXep loai sinh vien 1 : "+sv1.xepLoai());
		System.out.println("\nDiem lop hoc 1\n"+lopHoc1.inDiem());
//		
//		System.out.println("\n10 sinh vien diem cao nhat : ");
//		try {
//			List<SinhVien> listSV1=lopHoc1.top10();
//			for(SinhVien sv:listSV1) {
//				System.out.println(sv.getTen());
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		
//		System.out.println("\nDanh sach sinh vien yeu : ");
//		try {
//			List<SinhVien> listSV2=lopHoc1.sinhVienYeu();
//			for(SinhVien sv:listSV2) {
//				System.out.println(sv.getTen());
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		String str=String.format("%-3s | %-20s | %-10s", "STT","Ten Mon","Diem");
//		System.out.println(str);
//		System.out.println(String.format("%-3s | %-20s | %-10s", "1","Toan","8"));
//		System.out.println(String.format("%-3s | %-20s | %-10s", "2","Lap Trinh Java","7"));
//		System.out.println(String.format("%-3s | %-20s | %-10s", "3","Van","9"));
		
	}
}
