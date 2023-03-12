public class Conta{
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	
	public void deposita(double valor){
		this.saldo += valor;
		System.out.println("Foi depositado na conta o valor de: " + valor);
		System.out.println("Saldo atual: " + this.saldo);
	}
	
	public boolean saca(double valor){
		if(this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Valor retirado: " + valor);
			System.out.println("Saldo atual: " + this.saldo);
			return true;
		} else {
			System.out.println("Saldo insuficiente para retirada");
			return false; 
		}
	}
}