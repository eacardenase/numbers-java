import java.math.BigDecimal;

public class CompoundInterestCalculator {

    BigDecimal principal;
    BigDecimal rate;
    int period;
    BigDecimal contribution;

    public CompoundInterestCalculator(String principal, String rate, int period, String contribution) {
        this.principal = new BigDecimal(principal);
        this.rate = new BigDecimal(rate);
        this.period = period;
        this.contribution = new BigDecimal(contribution);
    }

    public BigDecimal calculate() {
        // Balance (Y) = P(1 + r)^Y + c[ ((1 + r)^Y - 1) / r]

        BigDecimal a = BigDecimal.ONE.add(this.rate).pow(this.period); // (1 + r)^Y
        BigDecimal b = a.subtract(BigDecimal.ONE); // (1 + r)^Y - 1
        BigDecimal c = b.divide(this.rate); // ((1 + r)^Y - 1) / r
        BigDecimal d = c.multiply(this.contribution); // c[ ((1 + r)^Y - 1) / r]
        BigDecimal e = this.principal.multiply(a); // P(1 + r)^Y
        BigDecimal f = e.add(d); // P(1 + r)^Y + c[ ((1 + r)^Y - 1) / r]

        return f;
    }

    public static void main(String[] args) {
        CompoundInterestCalculator calculator = new CompoundInterestCalculator("10000.00", "0.08", 10, "1000");

        System.out.println(calculator.calculate());
    }
}
