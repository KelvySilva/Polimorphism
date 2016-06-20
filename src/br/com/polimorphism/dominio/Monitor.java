package br.com.polimorphism.dominio;

import br.com.polimorphism.util.Calculator;

public class Monitor {
	
	public String monitoring(Calculator c){
		return String.valueOf(c.calcConsume());
	}

}
