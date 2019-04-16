package Investimentos;

public class RealizadorDeInvestimentos {

	public void realizarInvesvimento(Investimento investimento, Conta conta) {
		investimento.investe(conta);

		conta.deposita("Joao", 500);
		System.out.println(conta.getSaldo());
	}
}
