
public class Cliente {
//VARIAVEIS
private String nomeCliente, cpfCliente;
Conta conta = new Conta ();
//METODOS GETTERS E SETTERS
	public String getNomeCliente() {
		return  nomeCliente;
	}
	public void setNomeCliente (String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getCpfCliente () {
		return cpfCliente;
	}
	public void setCpfCliente (String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}
}
