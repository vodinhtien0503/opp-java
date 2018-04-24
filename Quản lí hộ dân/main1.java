package opp;

import java.util.Scanner;

public class main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int luachon;
int n;
hodan[]danhsachhd = null;
Scanner in=new Scanner(System.in);
System.out.println("1. nhap thong tin cho n ho dan .");
System.out.println("2. hien thi thong tin tat ca cac ho dan.");
System.out.println("3. thoat chuong trinh");
do {
	System.out.println("nhap su lua chon cua ban: ");
	luachon=Integer.parseInt(in.nextLine());
	if(luachon<1||luachon>3) {
		System.out.println("nhap khong hon le ,vui long kiem tra lai");
	}
	switch(luachon){
	case 1:{
		System.out.println("nhap so luong ho dan");
		n=Integer.parseInt(in.nextLine());
		danhsachhd=new hodan[n];
		
		
		
		
		for(int i=0;i<danhsachhd.length;i++) {
			danhsachhd[i]=new hodan();
			danhsachhd[i].nhapt();
		}
		break;
	}
	case 2:{
		System.out.println("thong tin ho dan : ");
		for(int i=0;i<danhsachhd.length;i++) {
			danhsachhd[i].hientt();
			
		}
		break;
	}
	case 3: {
		break;
	}
	}
}	while(luachon!=3);

	}

}
