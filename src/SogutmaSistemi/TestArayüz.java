package SogutmaSistemi;

import java.sql.*;
import java.util.Scanner;

public class TestArayüz {
	
	static Scanner sc = new Scanner(System.in);
	static int secim;
	static Merkezi ms = new Merkezi();
	
	public static void Secim() {
		while(secim != 4) {
			
			System.out.println("Lütfen 1-4 arasinda secim yapiniz");
			System.out.println("1-Sicaklik Getir");
			System.out.println("2-Sogutucu Ac");
			System.out.println("3-Sogutucu Kapa");
			System.out.println("4-Cikis");
			
			secim = sc.nextInt();
			
			if(secim == 1)
				System.out.println("Sicaklik: " + ms.SıcaklıkGetir());
			
			else if(secim == 2) 
				ms.SogutucuAc();
			
			else if(secim == 3)
				ms.SogutucuKapa();
			
			else
				continue;
			
		}
	}
	
	public static void main(String[] args) {
		
		DatabaseConnectionSingleton d = DatabaseConnectionSingleton.getInstance();
		Connection c = DatabaseConnectionSingleton.getConnection();
		UserKontrol uk = new UserKontrol(c);
		
		
		int hak = 0;
		String name;
		String pass;
		
		while(hak<5) {
			System.out.println("Adiniz: ");
			name = sc.nextLine();
			System.out.println("Parola: ");
			pass = sc.nextLine();
			
			if(uk.Kontrol(name, pass)) {
				System.out.println("Giris Basarili");
				System.out.println("------------------------");
				Secim();
				break;
			}
			hak++;
			
		}
		if(hak==3)
			System.out.println("Hak doldu.");
		System.out.println("Cikis yapildi");
		

	}

}
