package br.edu.fatecpg.heranca.model;

public class Gerente extends FuncionarioAbstract implements Funcionario {
	public Gerente(String nome) {
		super(nome, "Gerente");
	}
	@Override
	public void baterPonto() {
		System.out.println("Gerente bateu o ponto.");
	}
	
	public void fecharCaixa() {
		System.out.println("Gerente fechou o caixa.");
	}
}
