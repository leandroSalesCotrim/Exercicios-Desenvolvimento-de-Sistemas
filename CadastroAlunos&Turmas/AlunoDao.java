import java.sql.*;

public class AlunoDao {

	Conexao conexao = new Conexao();
	
	PreparedStatement stmt = null;
	
	
	public void cadastrar(Aluno aluno) {
		try {
			conexao.conectar();
			String sql = "INSERT INTO tbaluno(nomealuno, cpfaluno, codTurma) VALUES (?,?,?)";
			stmt = conexao.getConnection().prepareStatement(sql);
			stmt.setString(1, aluno.getNomealuno());
			stmt.setString(2, aluno.getCpfaluno());
			stmt.setInt(3, aluno.getCodTurma());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
}
