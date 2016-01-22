package br.edu.ifpi.banco.modelo;

public abstract class Conta{
	
	protected double saldo;
	
	public abstract void atualiza(double taxa);
	
	public void deposita(double valor){
		this.saldo += valor;
	}
	
	public void saca(double valor){
		this.saldo -= valor;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
