package responsability;

import entidades.Conta;
import entidades.Requisicao;
import enums.Formato;
import interfaces.Resposta;

public class RespostaCSV implements Resposta {

	private Resposta proximo;
	
	public RespostaCSV(Resposta resposta) {
		this.proximo = resposta;
	}
	
	@Override
	public void responde(Requisicao requisicao, Conta conta) {
		if(requisicao.getFormato().equals(Formato.CSV)) {
			System.out.println(conta.getTitular() + ";"+ conta.getSaldo() + ";");
		} else {
			proximo.responde(requisicao, conta);
		}
	}

	@Override
	public void setProxima(Resposta resposta) {
		this.proximo = resposta;
	}

}
