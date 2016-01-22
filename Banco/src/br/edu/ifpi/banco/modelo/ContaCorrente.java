package br.edu.ifpi.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel{

	public void atualiza(double taxa) {
		this.saldo += this.saldo*(taxa*2.0);
	}
	
	@Override
	public void deposita(double valor) {
		double temp = valor - 0.1;
		super.deposita(temp);
	}

	@Override
	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}
	
	@Override
	public String toString() {
		return "Taxa de 1%";
	}
}

