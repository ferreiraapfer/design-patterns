
public class ICCC implements Imposto {

	/**
	 * Caso seja menor que 1000 -> 5%
	 * Caso seja entre 1000 e 3000 (inclusivo) -> 7%
	 * Caso seja maior que 3000 -> 8% + 30 reais
	 */
	@Override
	public double calcula(Orcamento orcamento) {
		
		if (orcamento.getValor() < 1000) {
			return orcamento.getValor() * 0.05;
		}

		if (orcamento.getValor() <= 3000) {
			return orcamento.getValor() * 0.07;
		}

		return (orcamento.getValor() * 0.08) + 30;

	}

}
