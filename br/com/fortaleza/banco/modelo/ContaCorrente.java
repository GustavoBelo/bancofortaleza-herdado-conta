package br.com.fortaleza.banco.modelo;
/**
 * Esta classe tem o intuito de criar uma Conta Corrente para um cliente
 * 
 * @author Gustavo Belo
 * @version 2.0
 *
 */
public class ContaCorrente extends Conta implements Tributavel {
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}

	public void saca(double valor) {
		double valorASacar = valor + 0.20;
		super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
		if (valor < 10.0) {
			throw new IllegalArgumentException("Você não pode depositar menos de 10 reais em uma conta corrente.");
		}
		this.saldo += valor;
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
	
	@Override
	public String toString() {
		return "\nConta Corrente\n"+super.toString();
	}
}
