package Investimentos;

import java.util.Random;

public class Arrojado implements Investimento {

	private Random random;

	public Arrojado() {
		this.random = new Random();
	}

	@Override
	public double investe(Conta conta) {

		double chance = random.nextInt(10);

		if (chance >= 0 && chance <= 1) {
			return conta.getSaldo() * 0.05;
		}

		if (chance >= 2 && chance <= 4) {
			return conta.getSaldo() * 0.03;
		}

		return conta.getSaldo() * 0.06;
	}

}
