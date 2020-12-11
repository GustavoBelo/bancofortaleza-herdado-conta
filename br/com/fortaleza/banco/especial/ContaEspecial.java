package br.com.fortaleza.banco.especial;

/**
 * Esta classe foi criada apenas para fazer o teste de algumas coisas que aprendi
 * ela pode ter algum sentido no futuro ;)
 * 
 * @author Gustavo Belo
 * @version 2.0
 * 
 */

import br.com.fortaleza.banco.modelo.Conta;

public class ContaEspecial extends Conta {

	public ContaEspecial(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}

}
