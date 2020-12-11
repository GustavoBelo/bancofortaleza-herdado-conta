package br.com.fortaleza.banco.teste;

import br.com.fortaleza.banco.modelo.AcaoBolsa;
import br.com.fortaleza.banco.modelo.CalculadorImposto;
import br.com.fortaleza.banco.modelo.ContaCorrente;
import br.com.fortaleza.banco.modelo.SeguroDeVida;

public class TesteTributaveis {

	public static void main(String[] args) throws Exception {
		ContaCorrente cc = new ContaCorrente(222, 333);
		try {
			cc.deposita(100.0);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		SeguroDeVida seguro = new SeguroDeVida();
		AcaoBolsa acao = new AcaoBolsa();

		CalculadorImposto calc = new CalculadorImposto();
		calc.registra(cc);
		calc.registra(seguro);
		calc.registra(acao);

		System.out.println(calc.getTotalImposto());

	}

}
