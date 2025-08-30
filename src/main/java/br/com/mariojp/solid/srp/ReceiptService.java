package br.com.mariojp.solid.srp;

public class ReceiptService {
	private final CalcularTax calculartax = new CalcularTax();
	private final FormatarRecibo formatarrecibo = new FormatarRecibo();

	public String generate(Order order) {
		double subtotal = order.getItems().stream().mapToDouble(i -> i.getUnitPrice() * i.getQuantity()).sum();
		double tax = calculartax.calcular(subtotal);
		double total = subtotal + tax;

		return formatarrecibo.format(order, subtotal, tax, total);

	}
}
