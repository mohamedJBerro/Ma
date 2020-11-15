package com.Maberro;

public class TaxReport {

    private TaxCalculatorInterface calculator;

//    public TaxReport(TaxCalculatorInterface calculator) {
//        setCalculator(calculator);
//    }
    public void show(TaxCalculatorInterface calculator){
        System.out.println(calculator.calculateTax());
    }
//    public void setCalculator(TaxCalculatorInterface calculator) {
//        this.calculator = calculator;
//    }
}
