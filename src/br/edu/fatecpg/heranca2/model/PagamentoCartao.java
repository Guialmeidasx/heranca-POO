package br.edu.fatecpg.heranca2.model;

public class PagamentoCartao implements Pagamento {
	private double valor;

	public PagamentoCartao(double valor) {
		this.valor = valor;
	}

	@Override
	public double calcularPagamento() {
		return valor * 1.05;
	}

	@Override
	public String emitirRecibo() {
		return "=== RECIBO - CARTÃO ===\n" 
				+ String.format("Valor original: R$ %.2f%n", valor)
				+ String.format("Taxa de 5%%: R$ %.2f%n", valor * 0.05)
				+ String.format("Valor final: R$ %.2f", calcularPagamento());
	}
}
