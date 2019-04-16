
public class DescontoMaisDeQuinhentosReais implements Desconto {

	private Desconto proximo;

	@Override
	public double calcula(Orcamento orcamento) {

		if (orcamento.getValor() > 500) {
			return (orcamento.getValor() * 0.07) + 500.0;
		}

		return proximo.calcula(orcamento);

	}

	@Override
	public void setProximo(Desconto desconto) {
		this.proximo = desconto;
	}

}
