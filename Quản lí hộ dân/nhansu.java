package opp;

import java.util.Scanner;

public class nhansu {
	private String hoten;
	private int tuoi;
	private int namsinh;
	private String nghenghiep;
public nhansu() {
	
}
public nhansu(String hoten,int tuoi,int namsinh,String nghenghiep) {
	this.hoten=hoten;
	this.tuoi=tuoi;
	this.namsinh=namsinh;
	this.nghenghiep=nghenghiep;
	
}
public void nhapt() {
	Scanner in=new Scanner(System.in);
	System.out.println("nhap ho ten ho dan: ");
	hoten=in.nextLine();
	System.out.println("nhap so tuoi : ");
	tuoi=Integer.parseInt(in.nextLine());
	System.out.println("nhap nam sinh cua ho dan: ");
	namsinh=Integer.parseInt(in.nextLine());
	System.out.println("nhap nghe nghiep ho dan: ");
	nghenghiep=in.nextLine();
}
public void hientt(){
	System.out.println("ho ten ho dan: "+hoten);
	System.out.println("tuoi : "+tuoi);
	System.out.println("nam sinh: "+namsinh);
	System.out.println("nghe nghiep: "+nghenghiep);
}
	}

