package pbo.tes;

import java.util.Scanner;
public class quiz{

    public void bersihkanlayar(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
	
	static int pilihan;
	static int reksusi = 213456;
	int rekbudi = 314865;
	int saldosusi = 1000000;
	int saldobudi = 0;
	int rekening;
	int[] mutasi = new int[100];
	int idx = 0;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		quiz function = new quiz();
		while(pilihan!=3) {
			System.out.println("Selamat Datang Di Bank AKU");
			System.out.println("Nama : Susi");
			System.out.println("No Rekening : "+reksusi);
			System.out.println("1. Transfer");
			System.out.println("2. Cek Mutasi");
			System.out.println("3. Keluar");
			System.out.print("Pilih Menu : ");
			pilihan = scanner.nextInt();
            function.bersihkanlayar();
				switch(pilihan) {
					case 1 : function.transfer(scanner);break;
					case 2 : function.mutasi(scanner);break;
				}
		
			
		}
		
	}
	
	
	public void transfer(Scanner scanner) {
		int jumlah=0;
		int pilihan1=0;
			while(pilihan1!=2) {
				System.out.println("Menu Transaksi");
				System.out.println("==============");
				System.out.println("Nama : Susi");
				System.out.println("Sisa Saldo : "+saldosusi);
				System.out.println("1. Transfer");
				System.out.println("2. Keluar");
				System.out.print("Pilih Menu : ");
				pilihan1 = scanner.nextInt();
				switch(pilihan1) {
				case 1 : System.out.print("Masukkan No.Rekening Yang Ingin Ditransfer : ");
					rekening = scanner.nextInt();
					if(rekening==rekbudi) {
						System.out.println("Rekening Yang Ingin Ditransfer : Budi");
						do {
						System.out.print("Jumlah Yang Ingin Ditransfer : ");
						jumlah = scanner.nextInt();
						System.out.println("Transaksi sebesar : "+jumlah);
							if(jumlah > saldosusi) System.out.println("Saldo Tidak Mencukupi");
							
							else{
								System.out.println("Transaksi Berhasil");
							}
						}
						while(jumlah>saldosusi);
						saldobudi+=jumlah;
						saldosusi-=jumlah;
						mutasi[idx]=jumlah;
						idx++;
						break;
					}
					else {
						System.out.println("No Rekening Salah");
					}
				}
			}
			
		}
	public void mutasi(Scanner scanner) {
		int pilihan2=0;
			while(pilihan2!=2) {
				System.out.println("Mutasi saldo");
				System.out.println("1. Cek Mutasi");
				System.out.println("2. Keluar");
				System.out.print("Pilih Menu : ");
				pilihan2 = scanner.nextInt();
				if(pilihan2==1) {
					for(int i = 0; i < idx; i++) {
					    System.out.println("Susi transfer sebesar " + mutasi[i] + " ke rekening Budi");	    
					}
					if(idx==0) {
						System.out.println("Belum Ad Mutasi");
					}
				
				}
				
				else if(pilihan2==2) {
					break;
				}
					
			}
				
	}	
}
		
