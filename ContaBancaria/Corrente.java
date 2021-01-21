import javax.swing.JOptionPane;
//HERANÇA
public class Corrente extends Conta {
//VARIAVEIS
private double limiteCorrente=500 , taxaCorrente;
//METODOS GETTERS E SETTERS
	public double getLimiteCorrente () {
		return limiteCorrente;
	}
	public void setLimiteCorrente(double limiteCorrente) {
		this.limiteCorrente = limiteCorrente;
		
	}
	public double getTaxaCorrente () {
		return taxaCorrente;
	}
	public void setTaxaCorrente (double taxaCorrente) {
	this.taxaCorrente = taxaCorrente;
	}
//METODOS DE DEPOSITO E SAQUE
	public void deposito (double valor) {
		setSaldoConta(getLimiteCorrente()+getSaldoConta()+valor);
	}
	public void saque (double valor) {
		
		setSaldoConta((getLimiteCorrente()+getSaldoConta())-valor);
		if(getSaldoConta()<501) {
			JOptionPane.showMessageDialog(null, "Você está sacando o valor limite", "Conta Bancaria",JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
