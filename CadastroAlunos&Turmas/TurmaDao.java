
import java.sql.*;
import java.util.*;

public class TurmaDao {
	//DAO = Data Acess Objetc = Objeto de Acesso aos Dados
	
	Conexao conexao = new Conexao();
	
	PreparedStatement stmt = null;
	ResultSet rs = null;
	List<Turma> listaturmas = new ArrayList<Turma>();
	
	public void cadastrar(Turma turma) {
		try {
			conexao.conectar();
			String sql = "INSERT INTO bdturma(nometurma) VALUES (?)";
			stmt = conexao.getConnection().prepareStatement(sql);
			stmt.setString(1, turma.getNometurma());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<Turma> listar() {
		try {
			conexao.conectar();
			String sql = "SELECT codturma, nometurma FROM bdturma ORDER BY nometurma";
			stmt = conexao.getConnection().prepareStatement(sql);
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				Turma turma = new Turma();
				turma.setCodturma(Integer.parseInt(rs.getString("codturma")));
				turma.setNometurma(rs.getString("nometurma"));
				listaturmas.add(turma);
			}
			return listaturmas;
		} catch (SQLException e) {
			e.printStackTrace();
			return listaturmas;
		}
	}
	
}
