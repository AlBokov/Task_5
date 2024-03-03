public class CreditPaymentService {
    public double calculate(int loanAmount, int termYears, double percent) {
        double s = 12 * termYears;  // Срок выплаты кредита в месяцая
        double m = percent / (100 * 12); // Месячная процентная ставка по кредиту
        double k = (m * Math.pow((1 + m), s) / (Math.pow((1 + m), s) - 1)); // Коэффициент аннуитета
        double res = loanAmount * k; // Поиск платежа за месяц
        return res;
    }
}