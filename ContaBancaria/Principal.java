import javax.swing.JOptionPane;

public class Principal {
		
	public static void main(String[] args) {
		//INICIANDO VARIAVEIS E O PROGRAMA
			Cliente cliente = new Cliente() ;
			Corrente corrente = new Corrente ();
			Poupanca poupanca = new Poupanca();
			double valor ;
			JOptionPane.showMessageDialog(null, "Iniciando programa...", "Conta Bancaria",JOptionPane.INFORMATION_MESSAGE);
		//CADASTRANDO CLIENTE
			cliente.setNomeCliente(JOptionPane.showInputDialog(null, "Insira o nome do(a) cliente :","Conta bancaria",JOptionPane.QUESTION_MESSAGE));
			cliente.setCpfCliente(JOptionPane.showInputDialog(null, "Insira o CPF do(a) cliente :","Conta bancaria",JOptionPane.QUESTION_MESSAGE));
		//CADASTRANDO CONTA CORRENTE
			JOptionPane.showMessageDialog(null, "Crie uma conta poupan�a e corrente para o(a) cliente :"+cliente.getNomeCliente(), "Conta Bancaria",JOptionPane.INFORMATION_MESSAGE);
			corrente.setNumeroConta(JOptionPane.showInputDialog(null, "Insira o n�mero da conta corrente",JOptionPane.QUESTION_MESSAGE));
			corrente.setAgenciaConta(JOptionPane.showInputDialog(null, "Insira o agencia da conta corrente",JOptionPane.QUESTION_MESSAGE));
			corrente.setSaldoConta(Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o saldo da sua conta corrente",JOptionPane.QUESTION_MESSAGE)));
			corrente.setLimiteCorrente(Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o limite da conta\nOBS: Limite padr�o de R$500 para clientes novos")));
		//CADASTRANDO CONTA POUPAN�A
			poupanca.setNumeroConta(JOptionPane.showInputDialog(null, "Insira o n�mero da conta poupan�a",JOptionPane.QUESTION_MESSAGE));
			poupanca.setAgenciaConta(JOptionPane.showInputDialog(null, "Insira o agencia da conta poupan�a",JOptionPane.QUESTION_MESSAGE));
			poupanca.setSaldoConta(Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o saldo da sua conta poupan�a",JOptionPane.QUESTION_MESSAGE)));
		//DEPOSITO CORRENTE
			JOptionPane.showMessageDialog(null, "Agora siga as orienta��es", "Conta Bancaria",JOptionPane.INFORMATION_MESSAGE);
			valor = (Double.parseDouble(JOptionPane.showInputDialog(null, "Deposite R$100,00 para a conta corrente abaixo","Conta Bancaria", JOptionPane.QUESTION_MESSAGE)));
			corrente.deposito(valor);
			JOptionPane.showMessageDialog(null, "Saldo total com o adicional do limite: R$"+corrente.getSaldoConta(), "Conta Bancaria",JOptionPane.INFORMATION_MESSAGE);
		//APLIQUE POUPAN�A
			valor = (Double.parseDouble(JOptionPane.showInputDialog(null, "Aplique R$500,00 para a conta poupan�a abaixo","Conta Bancaria",JOptionPane.QUESTION_MESSAGE)));
			poupanca.aplique(valor);
			JOptionPane.showMessageDialog(null, "Saldo atual : R$"+poupanca.getSaldoConta(), "Conta Bancaria",JOptionPane.INFORMATION_MESSAGE);
		//SAQUE CORRENTE
			valor = (Double.parseDouble(JOptionPane.showInputDialog(null, "Saque R$150,00 para a conta corrente abaixo","Conta Bancaria", JOptionPane.QUESTION_MESSAGE)));
			corrente.saque(valor);
			JOptionPane.showMessageDialog(null, "Saldo total com o adicional do limite : R$"+corrente.getSaldoConta(), "Conta Bancaria",JOptionPane.INFORMATION_MESSAGE);
		//RESGATE POUPAN�A
			valor = (Double.parseDouble(JOptionPane.showInputDialog(null, "Resgate R$200,00 para a conta poupan�a abaixo","Conta Bancaria", JOptionPane.QUESTION_MESSAGE)));
			poupanca.resgate(valor);
			JOptionPane.showMessageDialog(null, "Saldo total : R$"+poupanca.getSaldoConta(), "Conta Bancaria",JOptionPane.INFORMATION_MESSAGE);
		}

}
