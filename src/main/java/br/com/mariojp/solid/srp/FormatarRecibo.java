package br.com.mariojp.solid.srp;

import java.util.Locale;

public class FormatarRecibo {
    public String format(Order order, double subtotal, double tax, double total){
        StringBuilder sb = new StringBuilder();
        sb.append("=== RECIBO ===\n");
        for (var item : order.getItems()){
            String line = String.format(Locale.US, "%s x%d = %.2f\n", item.getName(),item.getQuantity(),item.getUnitPrice() * item.getQuantity());
            sb.append(line);
        }
        sb.append(String.format(Locale.US, "Subtotal: %.2f\n", subtotal));
        sb.append(String.format(Locale.US, "Tax: %.2f\n", tax));
        sb.append(String.format(Locale.US, "Total: %.2f\n", total));
        return sb.toString();
    }
}
