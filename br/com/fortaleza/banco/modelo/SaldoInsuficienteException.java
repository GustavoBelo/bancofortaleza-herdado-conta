package br.com.fortaleza.banco.modelo;

/**
 * Essa extenção tem o objetivo de não deixar o cliente sacar e/ou transferir 
 * um valor maior do que o saldo atual dele
 * 
 * @author Gustavo Belo
 * @version 2.0
 *
 */

public class SaldoInsuficienteException extends RuntimeException {

	public SaldoInsuficienteException(String msg) {
		super(msg);
	}

}
