package br.com.fortaleza.banco.modelo;
/**
 * Esta classe cria tem o bjetivo de criar uma conta poupança para um cliente
 * 
 * @author Gustavo Belo
 *
 */
public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		if (valor < 5.0) {
			throw new IllegalArgumentException("Você não pode depositar menos de 5 reais em uma conta poupança.");
		}
		this.saldo += valor;
	}

}
