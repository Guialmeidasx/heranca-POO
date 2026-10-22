package br.edu.fatecpg.heranca2.view;
import br.edu.fatecpg.heranca2.model.*;

public class Main {

	public static void main(String[] args) {
		Pagamento cartao = new PagamentoCartao(100.00);
		Pagamento dinheiro = new PagamentoDinheiro(100.00);
		
		System.out.println(cartao.emitirRecibo());
		
		System.out.println();
		
		System.out.println(dinheiro.emitirRecibo());
	}

}
