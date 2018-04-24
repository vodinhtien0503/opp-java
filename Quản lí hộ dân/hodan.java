package opp;

import java.util.Scanner;

public class hodan extends nhansu {
	private int sothanhvien;
	private String sonha;
	
	public hodan() {
		
	}
	public hodan(String hoten,int tuoi,int namsinh,String nghenghiep,int sothanhvien, String sonha){
		super(hoten,tuoi,namsinh,nghenghiep);
		this.sothanhvien=sothanhvien;
		this.sonha=sonha;
		
		
	}
	nhansu[] danhsach=null;
	@Override
	public void nhapt() {
		Scanner in=new Scanner(System.in);
		while(true) {
			try {
				System.out.println("So thanh vien: ");
				sothanhvien = Integer.parseInt(in.nextLine());
				
				if(sothanhvien<0) {
					throw new NumberFormatException();
				}
				break;
			} catch (NumberFormatException e) {
				System.out.println("Ban can nhap so nguyen duong");
				
			}
		}
		danhsach = new nhansu[sothanhvien];
		System.out.print("So nha: ");
		sonha = in.nextLine();
		for(int i=0;i<danhsach.length;i++) {
			danhsach[i]=new nhansu();
			danhsach[i].nhapt();
		}
		
	}
	@Override
	public void hientt() {
		System.out.println("sothanhvien :"+sothanhvien);
		System.out.println("so nha :"+sonha);
		for(int i=0;i<danhsach.length;i++) {
			System.out.println("thong tin thanh vien thu"+(i+1));
			danhsach[i].hientt();
		}
	
	}
}
