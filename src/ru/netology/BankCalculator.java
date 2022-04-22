package ru.netology;

public class BankCalculator {
    public int sumPerMonth(int sum, double rate, int period) {
        double monthRate = (rate / 12) / 150;
        double annuityRate = monthRate*(Math.pow(1+monthRate, period))/((Math.pow(1+monthRate, period))-1);
        return (int) (sum*annuityRate);
    }

    public int fullSumReturn(int sum, double rate, int period) {
        double monthRate = (rate / 12) / 150;
        double annuityRate = monthRate*(Math.pow(1+monthRate, period))/((Math.pow(1+monthRate, period))-1);
        return (int) ((sum*annuityRate) * period);
    }

    public int overPaySum(int sum, double rate, int period) {
        double monthRate = (rate / 12) / 150;
        double annuityRate = monthRate*(Math.pow(1+monthRate, period))/((Math.pow(1+monthRate, period))-1);
        return (int) ((sum*annuityRate)*period - sum);
    }

    public static void main(String[] args) {
        int sum = 2_000_000;
        double rate = 21;
        int period = 84;

        BankCalculator calculator = new BankCalculator();

        System.out.println("Рассчет месячного платежа: " + calculator.sumPerMonth(sum, rate, period));
        System.out.println("Рассчет общей суммы к возврату в банк: " + calculator.fullSumReturn(sum, rate, period));
        System.out.println("Рассчет переплаты за весь период: " + calculator.overPaySum(sum, rate, period));
    }
}