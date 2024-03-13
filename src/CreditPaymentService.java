public class CreditPaymentService {
    public double calculate(int loanAmount, int termYears, double percent) {
        double paymentPeriodMonths = 12 * termYears;  // Срок выплаты кредита в месяцая
        double monthlyInterestRate = percent / (100 * 12); // Месячная процентная ставка по кредиту
        double annuityRate = (monthlyInterestRate * Math.pow((1 + monthlyInterestRate), paymentPeriodMonths) / (Math.pow((1 + monthlyInterestRate), paymentPeriodMonths) - 1)); // Коэффициент аннуитета
        double res = loanAmount * annuityRate; // Поиск платежа за месяц
        return res;
    }
}
