package br.com.mariojp.solid.srp;

public class CalcularTax {
    public double calcular(double subtotal){
        double taxRate = Double.parseDouble(System.getProperty("tax.rate","0.00"));
        return subtotal * taxRate;
    }
}
