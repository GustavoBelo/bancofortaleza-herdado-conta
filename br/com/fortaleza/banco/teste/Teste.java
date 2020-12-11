package br.com.fortaleza.banco.teste;

import br.com.fortaleza.banco.modelo.Conta;
import br.com.fortaleza.banco.modelo.ContaCorrente;
import br.com.fortaleza.banco.modelo.ContaPoupanca;

public class Teste {

	public static void main(String[] args) {
		System.out.println("x");
		System.out.println(3);
		System.out.println(true);
		
		ContaCorrente cc = new ContaCorrente(22, 33);
		ContaPoupanca cp = new ContaPoupanca(23, 55);
		
		System.out.println(cc);
		System.out.println(cp);
		
		
		println();
		println(cc);
		println(cp);
		println(1.1);
	}

	static void println() {}
	static void println(int a) {}
	static void println(boolean valor) {}
	
	static void println(Conta conta) {}

	static void println(Object referencia) {}

	
}
