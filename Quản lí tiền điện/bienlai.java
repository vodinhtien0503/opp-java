package opp;

import java.util.Scanner;

public class bienlai extends khachhang {
	private int somoi;
	private int socu;
	private int tientra;
	
	public bienlai() {
		
	}
	public bienlai(String hoten,int sonha,int socongto,int somoi,int socu, int tientra){
		super(hoten,sonha,socongto);
		this.socu=socu;
		this.somoi=somoi;
		
		
	}
	public void nhaptt() {
		super.nhaptt();
		Scanner in=new Scanner(System.in);
		System.out.println("chi so moi : ");
		somoi=Integer.parseInt(in.nextLine());
		System.out.println("chi so cu : ");
		socu=Integer.parseInt(in.nextLine());
	}
	public void hienttt() {
		super.hienttt();
		System.out.println("chi so moi :"+somoi);
		System.out.println("chi so cu :"+socu);
		System.out.println("tien tra :"+tinhtientra());
	}
	public int tinhtientra() {
		tientra=(somoi-socu)*850000;
		return tientra;
		
	}

}
