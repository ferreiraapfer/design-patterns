
public class TestaICCC {

	public static void main(String[] args) {
		ICCC iccc = new ICCC();
		Orcamento orcamento = new Orcamento(2000);
		
		CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
		calculadoraDeImpostos.calculaImposto(orcamento, iccc);
	}
}
