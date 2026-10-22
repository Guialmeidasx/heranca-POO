package br.edu.fatecpg.heranca.model;

public class Vendedor extends FuncionarioAbstract implements Funcionario {
	public Vendedor(String nome) {
		super(nome, "Vendedor");
	}
	@Override 
	public void baterPonto() {
		System.out.println("O Vendedor bateu o ponto.");
	}
	
	public void realizarVenda() {
		System.out.println("O Vendedor realizou vendas.");
	}
}

