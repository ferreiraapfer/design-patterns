import Investimentos.Conta;

public class RespostaEmXml implements Resposta {

	private Resposta proxima;

	public RespostaEmXml(Resposta proxima) {
		this.proxima = proxima;
	}

	@Override
	public void responde(Requisicao req, Conta conta) {
		if (req.getFormato().equals(Formato.XML)) {
			StringBuilder sBuilder = new StringBuilder();
			sBuilder.append("<conta>");
			sBuilder.append("<titular");
			sBuilder.append(conta.getTitular());
			sBuilder.append("</titular>");
			sBuilder.append("<saldo>");
			sBuilder.append(conta.getSaldo());
			sBuilder.append("</saldo>");
			sBuilder.append("</conta>");
		} else {
			proxima.responde(req, conta);
		}

	}

}
