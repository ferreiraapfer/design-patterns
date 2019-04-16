import Investimentos.Conta;

public class RespostaEmPorcento implements Resposta {

	private Resposta proxima;

	public RespostaEmPorcento(Resposta proxima) {
		this.proxima = proxima;
	}

	@Override
	public void responde(Requisicao req, Conta conta) {
		if (req.getFormato().equals(Formato.PORCENTO)) {
			StringBuilder sBuilder = new StringBuilder();
			sBuilder.append(conta.getTitular());
			sBuilder.append("%");
			sBuilder.append(conta.getSaldo());
		} else {
			proxima.responde(req, conta);
		}
	}

}
