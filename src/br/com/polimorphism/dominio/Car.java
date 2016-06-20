package br.com.polimorphism.dominio;

import br.com.polimorphism.util.Calculator;

public class Car extends Aultomobil implements Calculator{

	@Override
	public String calcConsume() {
		double avarageConsume = this.getTravellDistance()/this.getFuelCapacity();
		return "This vehycle was cosumed "+String.valueOf(avarageConsume)+" KM/L";
	}

}
