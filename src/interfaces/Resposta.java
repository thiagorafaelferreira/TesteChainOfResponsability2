package interfaces;

import entidades.Conta;
import entidades.Requisicao;

public interface Resposta {
	
	public void responde(Requisicao requisicao, Conta conta);
    public void setProxima(Resposta resposta);

}
