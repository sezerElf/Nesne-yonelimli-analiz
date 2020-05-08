package SogutmaSistemi;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class UserKontrol {
	static ArrayList<String> user = new ArrayList<String>();
	static ArrayList<String> parola = new ArrayList<String>();
	
	public UserKontrol(Connection dbConn) {

		try {
			Statement statement = dbConn.createStatement();
			String sql = "SELECT * FROM users";
			ResultSet rs = statement.executeQuery(sql);
			while(rs.next()){
				user.add(rs.getString("user_name"));
				parola.add(rs.getString("password"));
				
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public static boolean Kontrol(String name,String pass) {
		int k = 0;
		for(String i:user) {
			if(i.equals(name)) {
				if(parola.get(k).equals(pass))
					return true;
				
				System.out.println("Parolaniz yanlis");
				return false;
			}
			k++;
		}
		System.out.println("Bu isimde bir kullanici kayitli degil");
		return false;
	}
}