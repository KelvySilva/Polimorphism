package br.com.polimorphism.main;

import java.util.ArrayList;
import java.util.List;

import br.com.polimorphism.dominio.CB250Twister;
import br.com.polimorphism.dominio.Monitor;
import br.com.polimorphism.dominio.Porche;
import br.com.polimorphism.dominio.R1000SS;
import br.com.polimorphism.dominio.Vectra;
import br.com.polimorphism.util.Calculator;

public class Principal {

	public static void main(String[] args) {
		
		List<Calculator> lister =  new ArrayList<Calculator>();
		
		Vectra vectra = new Vectra();
		Porche porche = new Porche();
		CB250Twister cb250Twister = new CB250Twister();
		R1000SS r1000ss = new R1000SS();
		
		vectra.setFuelCapacity(60);
		vectra.setTravellDistance(900);
		
		porche.setFuelCapacity(60);
		porche.setTravellDistance(300);
		
		cb250Twister.setFuelCapacity(19);
		cb250Twister.setTravellDistance(600);
		
		r1000ss.setFuelCapacity(25);
		r1000ss.setTravellDistance(300);
		
		lister.add(vectra);
		lister.add(porche);
		lister.add(cb250Twister);
		lister.add(r1000ss);
		
		Monitor m = new Monitor();
		
		for (Calculator c : lister) {
			String str = m.monitoring(c);
			System.out.println(str);
		}
		
	}
	
}
