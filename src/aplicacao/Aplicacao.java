package aplicacao;

import entidades.Conta;
import entidades.Requisicao;
import enums.Formato;
import responsability.ProcessaResposta;

public class Aplicacao {

	public static void main(String[] args) {
		Requisicao requisicao = new Requisicao(Formato.SEM);
		Conta conta = new Conta("Thiago", 500d);
		
		new ProcessaResposta(requisicao, conta);
		
	}
}
