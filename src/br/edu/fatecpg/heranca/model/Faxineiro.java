package br.edu.fatecpg.heranca.model;

public class Faxineiro extends FuncionarioAbstract implements Funcionario{
	public Faxineiro(String nome) {
		super(nome, "Faxineiro");
	}
	
	@Override 
	public void baterPonto() {
		System.out.println("O Faxineiro bateu o ponto.");
	}
	
	public void solicitarMaterial() {
		System.out.println("O faxineiro solicitou materiais de limpeza.");
	}
}
