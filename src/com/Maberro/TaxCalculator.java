package com.Maberro;

public class TaxCalculator implements TaxCalculatorInterface {
    private double taxableIncome;

    public TaxCalculator(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }
    @Override
    public double calculateTax(){
        return taxableIncome*0.3;
    }
}
