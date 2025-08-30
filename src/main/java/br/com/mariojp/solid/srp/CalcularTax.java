package br.com.mariojp.solid.srp;

import java.util.Locale;
import java.util.Scanner;

public class CalcularTax {
    public double calcular(double subtotal){
        String taxRateValue = System.getProperty("tax.rate", "0.0");
        try(Scanner scanner = new Scanner(taxRateValue)){
            scanner.useLocale(Locale.US);
            if(scanner.hasNextDouble()){
                double taxRate = scanner.nextDouble();
                double finalTax = subtotal * taxRate;
                return finalTax;
            }
        }
        return 0.0;
    }
}
