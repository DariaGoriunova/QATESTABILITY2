public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int monthPayment = service.calculate(1_000_000, 9.99, 24);
        System.out.println(monthPayment);


    }
}
