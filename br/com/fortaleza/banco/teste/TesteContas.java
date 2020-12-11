package br.com.fortaleza.banco.teste;

import br.com.fortaleza.banco.especial.ContaEspecial;
//import br.com.fortaleza.banco.modelo.*;
import br.com.fortaleza.banco.modelo.Cliente;
import br.com.fortaleza.banco.modelo.Conta;
import br.com.fortaleza.banco.modelo.ContaCorrente;
import br.com.fortaleza.banco.modelo.ContaPoupanca;

public class TesteContas {

	public static void main(String[] args) throws Exception {
		
		ContaCorrente cc = new ContaCorrente(111, 555);

		ContaEspecial ce = new ContaEspecial(123, 555);
		
		ce.deposita(200.0);
		System.out.println(ce.getSaldo());
		
		try {
			cc.deposita(300.0);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		ContaPoupanca cp = new ContaPoupanca(222, 222);

		cp.deposita(200.0);

		System.out.println("ANTES:\nCP: " + cp.getSaldo() + "\nCC: " + cc.getSaldo());

		cc.transfere(10.0, cp);
		try {
			cc.saca(300.0);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		System.out.println("\nDEPOIS:\nCP: " + cp.getSaldo() + "\nCC: " + cc.getSaldo());
		System.out.println("Total de Contas: " + Conta.getTotal());
		
		System.out.println(cc);
	}

}
