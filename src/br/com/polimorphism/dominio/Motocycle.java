package br.com.polimorphism.dominio;

import br.com.polimorphism.util.Calculator;

public class Motocycle extends Aultomobil implements Calculator{

	@Override
	public String calcConsume() {
			return "Not Supported";
	}

}
