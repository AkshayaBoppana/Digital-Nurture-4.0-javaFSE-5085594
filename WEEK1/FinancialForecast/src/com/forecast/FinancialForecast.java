package com.forecast;

public class FinancialForecast {

    public static double calculateFutureValue(double initialInvestment, double growthRate, int years) {
 
        if (years == 0) {
            return initialInvestment;
        }
        
        return calculateFutureValue(initialInvestment, growthRate, years - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {
        double initialInvestment = 10000.0;  
        double annualGrowthRate = 0.08;      
        int numberOfYears = 5;               

        double futureValue = calculateFutureValue(initialInvestment, annualGrowthRate, numberOfYears);

        System.out.printf("Future Value after %d years: ₹%.2f%n", numberOfYears, futureValue);
    }
}
