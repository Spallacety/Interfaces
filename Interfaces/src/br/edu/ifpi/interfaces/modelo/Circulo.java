package br.edu.ifpi.interfaces.modelo;

public class Circulo {

	private int raio;
	
	public Circulo(int raio){
		this.raio = raio;
	}
	
	public double calculaArea() {
		return this.raio * this.raio * Math.PI;
	}
	
}
