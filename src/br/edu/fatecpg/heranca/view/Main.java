package br.edu.fatecpg.heranca.view;
import br.edu.fatecpg.heranca.model.*;
public class Main {

	public static void main(String[] args) {
		Gerente gerente = new Gerente("Alessandro");
		Faxineiro faxineiro = new Faxineiro("Guilherme");
		Vendedor vendedor = new Vendedor("Leandro");
		
		System.out.println(gerente);
		gerente.baterPonto();
		gerente.fecharCaixa();
		
		System.out.println();
		
		System.out.println(faxineiro);
		faxineiro.baterPonto();
		faxineiro.solicitarMaterial();
		
		System.out.println();
		
		System.out.println(vendedor);
		vendedor.baterPonto();
		vendedor.realizarVenda();
	}
}
