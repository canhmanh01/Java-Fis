package fis.java.topic_02.collections01;

import java.util.*;

public class SinhVien implements Comparable<SinhVien>{
  private String mssv;
  private String ten;

  private Set<Diem> monDaHoc = new HashSet<Diem>();

  public SinhVien(String mssv, String ten){
    this.mssv = mssv;
    this.ten = ten;
  }
  
  public String getMssv() {
	return mssv;
  }

  public void setMssv(String mssv) {
	this.mssv = mssv;
  }

  public String getTen() {
	return ten;
  }

  public void setTen(String ten) {
	this.ten = ten;
  }

  public Set<Diem> getMonDaHoc() {
	return monDaHoc;
  }

  public void setMonDaHoc(Set<Diem> monDaHoc) {
	this.monDaHoc = monDaHoc;
}

  public boolean themDiem(Diem diemMoi){
    return this.monDaHoc.add(diemMoi);
  }

  //Cau 1
  public double tinhDiemTrungBinh(){
    //Giong nhu cach tinh hien tai cua truong

    //...
	 double tc=0,diem=0;
	 
	for(Diem d:monDaHoc) {
		double t=d.getMon().getTcLT()+d.getMon().getTcTH();
		tc=tc+t;
		diem=diem+d.getDiem()*t;
		
	}
    return Math.round(diem/tc);
  }


  //Cau 2
  public StringBuilder bangDiem(){
    /*
     MSSV : 0203044
     Ten  : Nguyen Van A
     Danh Sach Diem
     STT  Ten Mon             Diem       So Tin Chi
     1    Cau Truc Du Lieu 1  8          3
     2    Cau Truc Du Lieu 2  8          3
     Diem Trung Binh   8.0
    */
    //...
	  int i=0;
	  StringBuilder s=new StringBuilder("MSSV : "+this.mssv+"\nTen  : "+this.ten+"\n"+String.format("%-5s %-20s %-10s %-10s" ,"STT", "TenMon","Diem","So Tin Chi")+"\n");;
	  for(Diem d:monDaHoc) {
		  i++;
		  s.append(String.format("%-5s %-20s %-10s %-10s", i, d.getMon().getTen(),d.getDiem(),d.getMon().getTcLT()+d.getMon().getTcTH())+"\n");
	  }
	  return s.append("Diem Trung Binh\t"+tinhDiemTrungBinh());
  }


  //Cau 3
  public String xepLoai(){
    /*
    Quy tac xep loai nhu sau
        DiemTB < 5 -> YEU
        DiemTB >= 5 va DiemTB < 6 -> TB
        DiemTB >= 6 va DiemTB < 7 -> TB-KHA
        DiemTB >= 7 va DiemTB < 8 -> KHA
        DiemTB >= 8 -> GIOI
    */
    //...
	double diem=tinhDiemTrungBinh();
	if(diem<5) return "YEU";
	if(diem<6) return "TB";
	if(diem<7) return "TB-KHA";
	if(diem<8) return "KHA";
    return "GIOI";
  }

  @Override
  public int compareTo(SinhVien o) {
	// TODO Auto-generated method stub
	return (int) (o.tinhDiemTrungBinh()-this.tinhDiemTrungBinh());
  }
}
