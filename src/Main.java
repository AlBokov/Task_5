// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int loanAmount = 1_000_000; // Сумма кредита
        int termYears = 3; // Срок выплаты в годах
        double percent = 9.99; // Годовой процент
        int monthlyPayment = (int)service.calculate(loanAmount, termYears, percent);
        System.out.println(monthlyPayment);
        }
    }


