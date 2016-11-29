package responsability;

import entidades.Conta;
import entidades.Requisicao;
import enums.Formato;
import interfaces.Resposta;

public class RespostaXML implements Resposta {

	private Resposta proximo;
	
	public RespostaXML(Resposta resposta) {
		this.proximo = resposta;
	}
	
	@Override
	public void responde(Requisicao requisicao, Conta conta) {
		if(requisicao.getFormato().equals(Formato.XML)) {
			System.out.println("<conta><titular>" + conta.getTitular() + "</titular><saldo>"+ conta.getSaldo() + "</saldo></conta>");
		} else {
			proximo.responde(requisicao, conta);
		}
	}

	@Override
	public void setProxima(Resposta resposta) {
		this.proximo = resposta;
	}

}
