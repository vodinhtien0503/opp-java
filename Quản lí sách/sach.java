package opp;

import java.util.Scanner;

public class sach {
private String tensach;
private String tentacgia;
private int namxb;
public sach() {
	
}
public sach(String tensach,String tentacgia,int namxb) {
	this.namxb=namxb;
	this.tensach=tensach;
	this.tentacgia=tentacgia;
	
}

public String getTensach() {
	return tensach;
}
public void setTensach(String tensach) {
	this.tensach = tensach;
}
public String getTentacgia() {
	return tentacgia;
}
public void setTentacgia(String tentacgia) {
	this.tentacgia = tentacgia;
}
public int getNamxb() {
	return namxb;
}
public void setNamxb(int namxb) {
	this.namxb = namxb;
}
public void nhap(){
	Scanner in=new Scanner(System.in);
	System.out.println("nhap ten sach: ");
	tensach=in.nextLine();
	System.out.println("nhap ten ten tac gia: ");
	tentacgia=in.nextLine();
	System.out.println("nhap nam xuat ban: ");
	namxb=Integer.parseInt(in.nextLine());
	
}
public void hienthi() {
	System.out.println("ten sach: "+tensach);
	System.out.println("ten tac gia: "+tentacgia);
	System.out.println("nam suat ban: "+namxb);
}
}
