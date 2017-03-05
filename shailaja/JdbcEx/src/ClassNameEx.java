import java.sql.Connection;
import java.sql.DriverManager;
//comment
public class ClassNameEx {
	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection obj=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "shailaja");
		System.out.println(obj.getClass().getName());
		ClassNameEx t=new ClassNameEx();
		System.out.println(t.getClass().getName());
		System.out.println("second git");
	
}
}
