
public class IKCV implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {

		if (orcamento.getValor() > 500 && temItemMaiorQue100ReaisNo(orcamento)) {
			return orcamento.getValor() * 0.10;
		}

		return orcamento.getValor() * 0.06;
	}

	private boolean temItemMaiorQue100ReaisNo(Orcamento orcamento) {
		return orcamento.getItens().stream().filter(i -> i.getValor() > 100).findFirst().isPresent();
	}

}
