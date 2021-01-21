//HERANÇA
public class Poupanca extends Conta {
//VARIAVEIS
private double rendimentoPoupanca;
private int diaAniversarioPoupanca;
//METODOS GETTERS E SETTERS
	public double getRendimentoPoupanca () {
		return rendimentoPoupanca;
	}
	public void setRendimentoPoupanca(double rendimentoPoupanca) {
		this.rendimentoPoupanca = rendimentoPoupanca;
	}
	public double getDiaAniversarioPoupanca() {
		return diaAniversarioPoupanca ;
	}
	public void setDiaAniversarioPoupanca(int diaAniversarioPoupanca) {
		this.diaAniversarioPoupanca = diaAniversarioPoupanca;
	}

//METODOS DE APLIQUE E RESGATE
	public void aplique (double valor) {
		setSaldoConta(getSaldoConta()+valor);
	}
	public void resgate (double valor) {
		setSaldoConta(getSaldoConta()-valor);
	}
}
