package br.com.polimorphism.dominio;

public abstract class Aultomobil {

	private double fuelCapacity;
	private int travellDistance;
	
	public double getFuelCapacity() {
		return fuelCapacity;
	}
	public void setFuelCapacity(double fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	public int getTravellDistance() {
		return travellDistance;
	}
	public void setTravellDistance(int travellDistance) {
		this.travellDistance = travellDistance;
	}
	
	
	
}
