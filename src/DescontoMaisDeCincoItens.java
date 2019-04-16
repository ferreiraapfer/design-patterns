
public class DescontoMaisDeCincoItens implements Desconto {

	private Desconto proximo;

	@Override
	public double calcula(Orcamento orcamento) {

		if (orcamento.getItens().size() > 5) {
			return orcamento.getValor() * 0.10;
		}

		return proximo.calcula(orcamento);
	}

	@Override
	public void setProximo(Desconto desconto) {
		this.proximo = desconto;
	}

}
