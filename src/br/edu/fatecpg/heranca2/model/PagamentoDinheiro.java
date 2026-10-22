package br.edu.fatecpg.heranca2.model;

public class PagamentoDinheiro implements Pagamento {
	private double valor;

	public PagamentoDinheiro(double valor) {
		this.valor = valor;
	}

	@Override
	public double calcularPagamento() {
		return valor * 0.90;
	}

	@Override
	public String emitirRecibo() {
		return "=== Recibo - DINHEIRO ===\n" + String.format("Valor original: R$ %.2f%n", valor)
				+ String.format("Desconto de de 10%%: R$ %.2f%n", valor * 0.10)
				+ String.format("Valor final: R$ %.2f", calcularPagamento());
	}
}
