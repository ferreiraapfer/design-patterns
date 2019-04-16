package Investimentos;

import java.util.Random;

public class Moderado implements Investimento {

	private Random random;

	public Moderado() {
		this.random = new Random();
	}

	@Override
	public double investe(Conta conta) {

		if (random.nextInt(2) == 0) {
			return conta.getSaldo() * 0.025;
		}

		return conta.getSaldo() * 0.07;

	}

}
