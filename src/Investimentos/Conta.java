package Investimentos;

public class Conta {

	private String titular;
	private double saldo;

	public void deposita(String titular, double valor) {
		this.titular = titular;
		this.saldo += valor;
	}

	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}
}
