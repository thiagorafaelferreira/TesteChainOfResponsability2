package responsability;

import entidades.Conta;
import entidades.Requisicao;
import interfaces.Resposta;

public class ProcessaResposta {

	public ProcessaResposta(Requisicao requisicao, Conta conta) {
		
		//Resposta rf = new RespostaZero();
		Resposta r3 = new RespostaPorcento(null);
		Resposta r2 = new RespostaXML(r3);
		Resposta r1 = new RespostaCSV(r2);
		
		r1.responde(requisicao, conta);
		
	}
	
}
