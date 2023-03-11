
public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		
		primeiraConta.saldo += 100;
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("Primeira conta tem " + primeiraConta.saldo);
		System.out.println("Segunda conta tem " + segundaConta.saldo);
		
		Conta terceiraConta = new Conta();
		System.out.println("Terceira conta tem " + terceiraConta.saldo);
		System.out.println(terceiraConta.titular);
	}	
	
}
