public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int creditSum = 1_000_000;
        double loanPercent = 9.99;
        int loanTermMonth = 36;
        int monthPayment = service.calculate(creditSum, loanPercent, loanTermMonth);
        System.out.println(monthPayment);


    }
}
