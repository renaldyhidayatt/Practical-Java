package com.sanedge.salary_calculator;

public class SalaryCalculator {
  public double salaryMultipler(int daysSkipped) {
    return (daysSkipped > 5) ? 0.85 : 1;
  }

  public int bonusMultiplier(int productsSold) {
    return (productsSold > 20) ? 13 : 10;
  }

  public double bonusForProductSold(int productsSold) {
    return productsSold * bonusMultiplier(productsSold);
  }

  public double finalSalary(int daysSkipped, int productsSold) {
    double totalSalary = (1000.00 * salaryMultipler(daysSkipped) + bonusForProductSold(productsSold));
    return (totalSalary > 2000.00) ? 2000.00 : totalSalary;
  }
}
