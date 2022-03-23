package fis.java.topic_02.collections02;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DotDangKyHocPhan {
    private String ma;
    private Calendar ngayBatDau;
    private Calendar ngayKetThuc;
    private List<PhieuDangKyHocPhan> dsPhieuDangKy = new ArrayList<PhieuDangKyHocPhan>();

    public DotDangKyHocPhan(String ma, Calendar ngayBatDau, Calendar ngayKetThuc){
        this.ma = ma;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
    }

    //Cau 3: Lay ra danh sach sinh vien dang ky nhieu mon hoc nhat
    //Chu y : chi quan tam den nhung phieu dang ky hop le
    public boolean ktChuaMon(PhieuDangKyHocPhan p,MonHoc m) {
    	if(p.getDsMonHoc().stream().anyMatch(t->t.equals(m))) return true;
    	return false;
    }
    public List<SinhVien> getDsSinhVien(MonHoc monHoc){
        return dsPhieuDangKy.stream()
        		.filter(t->t.laHopLe())
        		.filter(t->ktChuaMon(t, monHoc))
        		.map(t->t.getSv()).collect(Collectors.toList());
    }

    //Cau 4:Lay ra danh sach cac mon hoc co the mo lop. Mon do co the mo lop
    //khi so luong dang ky hoc mon hoc do lon hon hoac bang soSinhVienToiThieu
    //Chu y : chi quan tam den nhung phieu dang ky hop le
    public List<MonHoc> getDsMonHoc(int soSinhVienToiThieu){
        return  ChuongTrinhHoc.SINGLETON.getListMonHoc().stream()
        		.filter(t->getDsSinhVien(t).size()>=soSinhVienToiThieu)
        		.toList();
    }

    public void themPhieuDangKyHocPhan(PhieuDangKyHocPhan phieuDangKyHocPhan) {
        this.dsPhieuDangKy.add(phieuDangKyHocPhan);
    }
}
