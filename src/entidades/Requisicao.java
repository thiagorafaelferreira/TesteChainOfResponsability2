package entidades;

import enums.Formato;

public class Requisicao {
    
	private Formato formato;
    
	public Requisicao(Formato formato) {
      this.formato = formato;
    }	
	
	public Enum getFormato() {
		return formato;
	}
	
}
