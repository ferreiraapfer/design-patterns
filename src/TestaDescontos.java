
public class TestaDescontos {

	public static void main(String[] args) {
		Desconto d1 = new DescontoMaisDeCincoItens();
		Desconto d2 = new DescontoMaisDeQuinhentosReais();
		Desconto d3 = new DescontoPorVendaCasada();
		Desconto d4 = new SemDesconto();

		d1.setProximo(d2);
		d2.setProximo(d3);
		d3.setProximo(d4);

		Orcamento orcamento = new Orcamento(500);
		orcamento.adicionaItem(new Item("CANETA", 200));
		orcamento.adicionaItem(new Item("LAPIS", 30));

		double desconto = d1.calcula(orcamento);
		System.out.println(desconto);

	}
}
