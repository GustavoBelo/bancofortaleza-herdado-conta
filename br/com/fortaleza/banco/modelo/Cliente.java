package br.com.fortaleza.banco.modelo;

/**
 * Classe Cliente é uma classe que cria um cliente 
 * 
 * @author Gustavo Belo
 * @version 2.0
 *
 */

public class Cliente {
	private String nome, cpf, profissao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

}