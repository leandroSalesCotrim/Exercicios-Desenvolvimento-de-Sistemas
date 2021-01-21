

public class Turma {
	private int codturma;
	private String nometurma;
	
	public int getCodturma() {
		return codturma;
	}
	public void setCodturma(int codturma) {
		this.codturma = codturma;
	}
	public String getNometurma() {
		return nometurma;
	}
	public void setNometurma(String nometurma) {
		this.nometurma = nometurma;
	}
	
	@Override
	public String toString() {
		return this.nometurma;
	}
}
