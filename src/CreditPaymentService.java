public class CreditPaymentService {
    public int calculate(int creditSum, double loanPercent, int loanTermMonth) {
        double result = creditSum * (loanPercent / 12 / 100) * Math.pow((1 + (loanPercent / 12 / 100)), loanTermMonth) / ((Math.pow(1 + (loanPercent / 12 / 100), loanTermMonth) - 1));
        return (int) result;
    }
}
