package fis.java.topic_02.collections01;

import java.util.*;

public class LopHoc {
  private String ten;
  private String giaoVien;
  private List<SinhVien> dsLop = new ArrayList<SinhVien>();

  public LopHoc(String ten, String giaoVien){
    this.ten = ten;
    this.giaoVien = giaoVien;
  }

  public boolean them(SinhVien svMoi){
    return dsLop.add(svMoi);
  }

  //Cau 4
  public StringBuilder inDiem(){
    /*
    Danh Sach Diem Lop : ten
    Giao Vien Chu Nhiem : giaoVien
    STT      MSSV        Ten              Diem TB   XepLoai
    1        123456      Nguyen Van A     8.4       GIOI
    2        678919      Nguyen Van B     6         TB-KHA
    3        112456      Nguyen Van C     7         KHA
    */
    //...
	  int i=0;
	  StringBuilder s= new StringBuilder("Danh Sach Diem Lop  : "+this.ten+"\nGiao Vien Chu Nhiem : "+this.giaoVien+"\n"+String.format("%-4s %-8s %-14s %-6s %-4s", "STT","MSSV","Ten","Diem TB","Xep Loai"+"\n"));
	  for(SinhVien sv:dsLop) {
		  i++;
		  s.append(String.format("%-4s %-8s %-14s %-6s %-4s",i,sv.getMssv(),sv.getTen(),sv.tinhDiemTrungBinh(),sv.xepLoai()+"\n"));
	  }
	  return s;
  }

  //Cau 5
  public List<SinhVien> top10(){
    //Tra ve danh sach 10 sinh vien co diem trung binh lon nhat lop
    //...
	Collections.sort(dsLop);
    return dsLop.stream().limit(10).toList();
  }

  //Cau 6
  public List<SinhVien> sinhVienYeu(){
    //Tra ve danh sach vien vien xep loai YEU
    //...
//		List<SinhVien> list=new ArrayList<SinhVien>(12);
//		for(SinhVien l:dsLop) {
//			if(l.xepLoai().equals("YEU")) list.add(l);
//		}
	    return dsLop.stream().filter((s)-> s.xepLoai().equals("YEU")).toList();
  }
}
