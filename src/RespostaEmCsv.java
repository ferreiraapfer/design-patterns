import Investimentos.Conta;

public class RespostaEmCsv implements Resposta {

	private Resposta proxima;

	public RespostaEmCsv(Resposta proxima) {
		this.proxima = proxima;
	}

	@Override
	public void responde(Requisicao req, Conta conta) {
		if (req.getFormato().equals(Formato.CSV)) {
			StringBuilder sBuilder = new StringBuilder();
			sBuilder.append(conta.getTitular());
			sBuilder.append(",");
			sBuilder.append(conta.getSaldo());
		} else {
			proxima.responde(req, conta);
		}

	}

}
