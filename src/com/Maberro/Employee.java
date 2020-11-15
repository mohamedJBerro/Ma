package com.Maberro;

public class Employee {
    private int basicSalary;
    private int hourlyRate;

    public Employee(int basicSalary, int hourlyRate) {
        setBasicSalary(basicSalary);
        setHourlyRate(hourlyRate);
    }

    public int calculateWage(int extraHours){
        return basicSalary+(extraHours*hourlyRate);
    }

    private int getBasicSalary() {
        return basicSalary;
    }

    private void setBasicSalary(int basicSalary) {
        if (basicSalary<=0)
            throw new IllegalArgumentException("basic Salary cannot be zero or negative value");
        this.basicSalary = basicSalary;

    }

    private int getHourlyRate() {
        return hourlyRate;
    }

    private void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
