
public class ICPP implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		if (orcamento.getValor() > 500) {
			return orcamento.getValor() * 0.07;
		}

		return orcamento.getValor() * 0.05;
	}

}
