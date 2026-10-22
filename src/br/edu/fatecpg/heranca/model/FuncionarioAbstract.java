package br.edu.fatecpg.heranca.model;

public abstract class FuncionarioAbstract {
	private String nome;
	private String cargo;
	
	public FuncionarioAbstract (String nome, String cargo) {
		this.nome = nome;
		this.cargo = cargo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return "(nome = " + nome + ", cargo = " + cargo + ")";
	}	
}
