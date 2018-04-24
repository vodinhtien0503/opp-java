package opp;

import java.util.Scanner;

public class khachhang {
	private String hoten;
	private int sonha;
	private int socongto;
public khachhang() {
	
}
public khachhang(String hoten,int sonha,int socongto) {
	this.hoten=hoten;
	this.sonha=sonha;
	this.socongto=socongto;
	
}
public void nhaptt() {
	Scanner in=new Scanner(System.in);
	System.out.println("nhap ho ten khach hang: ");
	hoten=in.nextLine();
	System.out.println("nhap so nha khach hang: ");
	sonha=Integer.parseInt(in.nextLine());
	System.out.println("nhap so cong to khach hang: ");
	socongto=Integer.parseInt(in.nextLine());
}
public void hienttt(){
	System.out.println("ho ten ho dan: "+hoten);
	System.out.println("so nha : "+sonha);
	System.out.println("so cong to"+socongto);
	
}
	}
