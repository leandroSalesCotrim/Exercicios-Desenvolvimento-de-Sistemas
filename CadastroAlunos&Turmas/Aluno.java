

public class Aluno {
	private int codaluno;
	private String nomealuno;
	private String cpfaluno;
	private Turma turma;
	private int codTurma;
	
	
	public void setCodTurma(int codTurma) {
		this.codTurma = codTurma;
	}
	
	public int getCodTurma() {
		return this.codTurma;
	}

	public int getCodaluno() {
		return codaluno;
	}
	public void setCodaluno(int codaluno) {
		this.codaluno = codaluno;
	}
	public String getNomealuno() {
		return nomealuno;
	}
	public void setNomealuno(String nomealuno) {
		this.nomealuno = nomealuno;
	}
	public String getCpfaluno() {
		return cpfaluno;
	}
	public void setCpfaluno(String cpfaluno) {
		this.cpfaluno = cpfaluno;
	}
	public Turma getTurma() {
		return turma;
	}
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	
	
}
