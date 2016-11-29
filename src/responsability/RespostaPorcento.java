package responsability;

import entidades.Conta;
import entidades.Requisicao;
import enums.Formato;
import interfaces.Resposta;

public class RespostaPorcento implements Resposta {

	private Resposta proximo;
	
	public RespostaPorcento(Resposta resposta) {
		this.proximo = resposta;
	}
	
	@Override
	public void responde(Requisicao requisicao, Conta conta) {
		if(requisicao.getFormato().equals(Formato.PORCENTO)) {
			System.out.println(conta.getTitular() + "%"+ conta.getSaldo()+"%");
		} else {
			if(proximo != null)
			proximo.responde(requisicao, conta);
		}		
	}

	@Override
	public void setProxima(Resposta resposta) {
		this.proximo = resposta;
	}

}
