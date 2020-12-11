package br.com.fortaleza.banco.modelo;

/**
 * Essa Classe representa a forma que qualuquer Conta é.
 * 
 * @author Gustavo Belo
 * @version 2.0
 *
 */

public abstract class Conta{
	protected double saldo;
	private int agencia, numero;
	private static int total;
	private Cliente titular;

	public Conta(int agencia, int numero) {
		total++;
		this.agencia = agencia;
		this.numero = numero;

		if (agencia < 1)
			throw new IllegalArgumentException("Agencia inválida");

		if (numero < 1)
			throw new IllegalArgumentException("Numero da conta inválido");
	}

	public abstract void deposita(double valor);

	public void saca(double valor) {
		if (this.saldo < valor)
			throw new SaldoInsuficienteException(
					"Saldo Insuficiente\nSaldo atual: " + this.saldo + "\nValor solicitado para sacar: " + valor);
		this.saldo -= valor;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Não existe número menor ou igual a 0.");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Não existe agência 0 ou menor.");
			return;
		}
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void transfere(double valor, Conta destino) {
		this.saca(valor);
		destino.deposita(valor);
	}

	public static int getTotal() {
		return total;
	}
	
	@Override
	public String toString() {
		return "Número da Conta: " + getNumero() + "\nNúmero da agência: " + getAgencia();
	}
	

}