package UcusProjesi;

import java.util.Scanner;

public class UcusRunner {
	
	public static void main(String[] args) {
		
	   	
	   Scanner input = new Scanner(System.in);
		
	   System.out.println("Gitmek istediginiz sehrin bas harfini yaziniz:\n"+
		                   "B sehri\n"+
				           "C sehri\n"+
		                   "D sehri");
	   String secilenSehir= input.nextLine();
	   
	   System.out.println("gidis donus ise E \n"+
               "gidis donus degilse H");
	   String gidisDonusMu= input.nextLine();

	   
	   System.out.println("yasinizi giriniz");
       int yas= input.nextInt();
       
       
       input.close();
       
       biletParasiHesapla(secilenSehir,yas,gidisDonusMu);
       

}

	private static void biletParasiHesapla(String sehir,int yas, String gidisDonusMu) {
		
		double kmBirimFiyat=0.1;
		double biletFiyati = 0;
		int gidilecekMesafe = 0;
		
		switch (sehir.toLowerCase()) {
		case "b" : gidilecekMesafe=500; break;
		case "c" : gidilecekMesafe=700; break;
		case "d" : gidilecekMesafe=900; break;
		default: System.out.println("lutfen gecerli bir sehir giriniz");
		}
		
		biletFiyati=gidilecekMesafe*kmBirimFiyat;
		
	  
		if(yas<0){
			System.out.println("gecersiz bir yas girdiniz");
			biletFiyati=0;
	    }else if(yas<12) {
			biletFiyati=biletFiyati-(biletFiyati*0.5);
		}else if(yas<15) {
			biletFiyati=biletFiyati-(biletFiyati*0.1);
		}else if(yas>65) {
			biletFiyati=biletFiyati-(biletFiyati*0.3);
		}
		
		
		if(gidisDonusMu.equalsIgnoreCase("e")) {
			biletFiyati=biletFiyati-(biletFiyati*0.2);
		}else if(gidisDonusMu.equalsIgnoreCase("h")) {
			biletFiyati*=1;
		}else {
			System.out.println("lutfen gidis donus icin gecerli bir harf giriniz");
			biletFiyati=0;
			}
		
		System.out.println("\nBilet fiyatiniz :"+biletFiyati+"$");
		
	}
	
	
	
}
