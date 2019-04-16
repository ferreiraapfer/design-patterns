
public class DescontoPorVendaCasada implements Desconto {

	private Desconto proximo;

	@Override
	public double calcula(Orcamento orcamento) {

		boolean possuiCaneta = orcamento.getItens().stream().filter(i -> i.getNome().equalsIgnoreCase("CANETA"))
				.findFirst().isPresent();
		boolean possuiLapis = orcamento.getItens().stream().filter(i -> i.getNome().equalsIgnoreCase("LAPIS"))
				.findFirst().isPresent();

		if (possuiCaneta && possuiLapis) {
			return orcamento.getValor() * 0.05;
		}

		return proximo.calcula(orcamento);
	}

	@Override
	public void setProximo(Desconto desconto) {
		this.proximo = desconto;
	}

}
