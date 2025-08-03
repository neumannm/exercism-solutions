public class SalaryCalculator {
    public double multiplierPerDaysSkipped(int daysSkipped) {
        return daysSkipped <= 5 ? 1 : 0.85;
    }

    public int multiplierPerProductsSold(int productsSold) {
        return productsSold <= 20 ? 10 : 13;
    }

    public double bonusForProductSold(int productsSold) {
        return multiplierPerProductsSold(productsSold) * productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salary = 1000.00 * multiplierPerDaysSkipped(daysSkipped) + bonusForProductSold(productsSold);
        return Math.min(salary, 2000.00);
    }
}
