package br.com.fortaleza.banco.modelo;

/**
 * Esta Classe tem o objetivo de calcular o imposto de outra classe que é tributável.
 * 
 * @author Gustavo Belo
 * @version 2.0
 */

public class CalculadorImposto {
	private double totalImposto;

	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		this.totalImposto += valor;
	}

	public double getTotalImposto() {
		return totalImposto;
	}

}
