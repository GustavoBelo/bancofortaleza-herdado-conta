package br.com.fortaleza.banco.modelo;

/**
 * Esta classe é apenas mais uma classe que é tributavel
 * 
 * @author Gustavo Belo
 * @version 2.0
 *
 */

public class SeguroDeVida implements Tributavel {

	@Override
	public double getValorImposto() {
		return 42;
	}

}
