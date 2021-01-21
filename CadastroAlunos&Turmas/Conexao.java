
import java.sql.*;

public class Conexao {
	
	private Connection connection = null;
	
	public String conectar() {
		String userName = "root";
        String password = "";
        String servidor = "jdbc:mysql://localhost/bdescola?useTimezone=true&serverTimezone=UTC";
        String driver = "com.mysql.cj.jdbc.Driver";
        
	    try
	    {
	        Class.forName(driver);
	        this.connection = DriverManager.getConnection(servidor, userName, password);
	        return ("Conexão com o BD estabelecida!");
	    }
	    catch (Exception e)
	    {
	        return ("Não foi possível estabelecer conexão com o BD");
//	    	return (e.toString());
	    }
	}
	
	public Connection getConnection() {
		return this.connection;
	}

}
