package opp;

import java.util.ArrayList;
import java.util.Scanner;

public class qlsach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<sach> ds=new ArrayList();
int n;
int luachon;
int[] Array;
System.out.println("==================================");
System.out.println("1. Nhap vao n sach: ");
System.out.println("2. Thong tin sach: ");
System.out.println("3. Hien thi thong tin sac hang co nam xuat ban truoc nam x : ");
System.out.println("4. Thoat chuong trinh : ");
System.out.println("==================================");
Scanner in=new Scanner(System.in);
	do {
		System.out.println("Moi ban nhap vao lua chon : ");
		try {
			luachon=Integer.parseInt(in.nextLine());
		} catch (NumberFormatException e) {
			// TODO: handle exception
			luachon=0;
			System.out.println("Ban can nhap vao so nguyen! ");
			
		}
		switch (luachon) {
		case 1:{
			System.out.print("Nhap vao so luong sach : ");
			n=Integer.parseInt(in.nextLine());
			Array=new int[n];
			for(int i=0;i<Array.length;i++) {
						sach KH=new sach();
						System.out.println("thong tin sach : "+(i+1));
						KH.nhap();
						ds.add(KH);
			}
			break;
		}
		case 2:{
			System.out.println("Thong tin sach co trong danh sach: ");
			for(int i=0;i<ds.size();i++) {
				ds.get(i).hienthi();
			}
			break;
		}
		case 3:{
			int x;
			System.out.print("Nhap x : ");
			x=Integer.parseInt(in.nextLine());
			for(int i=0;i<ds.size();i++) {
				if(x<ds.get(i).getNamxb()) {
					ds.get(i).hienthi();
				}
			}
			break;
		}

		case 4:{
			break;
		}
		}
	}while(luachon!=4);
	}

}

