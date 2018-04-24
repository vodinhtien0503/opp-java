package opp;

import java.util.Scanner;

public class QLKH {
private String maKH;
private String hoTen;
private int namSinh;
private int tongLuong;

QLKH(){
	
}
QLKH(String maKH){
	this.maKH=maKH;
}
QLKH( String maKH, String hoTen, int namSinh, int tongLuong){
	this.maKH=maKH;
	this.hoTen=hoTen;
	this.namSinh=namSinh;
	this.tongLuong=tongLuong;
	
}
public String getMaKH() {
	return maKH;
}
public void setMaKH(String maKH) {
	this.maKH = maKH;
}
public String getHoTen() {
	return hoTen;
}
public void setHoTen(String hoTen) {
	this.hoTen = hoTen;
}
public int getNamSinh() {
	return namSinh;
}
public void setNamSinh(int namSinh) {
	this.namSinh = namSinh;
}
public int getTongLuong() {
	return tongLuong;
}
public void setTongLuong(int tongLuong) {
	this.tongLuong = tongLuong;
}
public void nhapTT() {
	Scanner in=new Scanner(System.in);
	System.out.print("Ma khach hang: ");
	maKH=in.nextLine();	
	System.out.print("Ten khach hang: ");
	hoTen=in.nextLine();
	System.out.print("Nam sinh khach hang: ");
	namSinh=Integer.parseInt(in.nextLine());
	System.out.print("Tong luong khach hang: ");
	tongLuong=Integer.parseInt(in.nextLine());
	
}
public void hienTT() {
	System.out.println("Ma khach hang "+maKH+"\n Ten khach hang "+hoTen+"\n Nam sinh "+namSinh+"\n co tong luong "+tongLuong);
}

}
