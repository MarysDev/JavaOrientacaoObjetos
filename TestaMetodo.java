
public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDaMary = new Conta();
		contaDaMary.saldo = 100;
		
		contaDaMary.deposita(50);
		contaDaMary.saca(20);
	}

}
