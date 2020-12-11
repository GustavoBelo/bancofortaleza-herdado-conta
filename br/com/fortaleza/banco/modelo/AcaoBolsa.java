package br.com.fortaleza.banco.modelo;

/**
 * Esta Classe é apenas um exemplo a mais de uma classe que é tributável
 * 
 * @author Gustavo Belo
 * @version 2.0
 *
 */

public class AcaoBolsa implements Tributavel {

	@Override
	public double getValorImposto() {
		return 50;
	}

}
