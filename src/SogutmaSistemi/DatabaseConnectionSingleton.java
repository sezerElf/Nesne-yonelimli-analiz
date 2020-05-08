package SogutmaSistemi;
import java.sql.*;
import java.util.ArrayList;

public class DatabaseConnectionSingleton {
	
	private static DatabaseConnectionSingleton instance=null;
	private static String veritabanı = "jdbc:postgresql://localhost:5432/javadb";
	
	private DatabaseConnectionSingleton(){ }
	
	public static DatabaseConnectionSingleton getInstance(){
		if(instance==null){
			synchronized (DatabaseConnectionSingleton.class) {
				if (instance==null) {
					instance=new DatabaseConnectionSingleton();
				}
			}
		}
		return instance;
	}
	
	public static Connection getConnection(){
		
		Connection dbConn=null;
		try{
			Class.forName("org.postgresql.Driver");//hangi veritabanı türü ile çalışacağımızı tanımlıyoruz
			dbConn = DriverManager.getConnection(veritabanı,"postgres","g181210080");//veri tabanına ait host ve veritabanı adını ve veritabanına ulaşacak olan kullanıcı adı ve şifresini tanımlıyoruz
			System.out.println("Bağlantı başarılı");
			System.out.println("---------------------------");
		}catch(SQLException e) {
            System.err.println(" Hata bulundu "+e.getMessage());            
		}catch(ClassNotFoundException e){
			System.err.println(" Hata bulundu "+e.getMessage());
        }
		return dbConn;
	}
	
	

	
}
