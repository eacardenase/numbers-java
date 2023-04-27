import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class CompoundInterestCalculator {

    private static final NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance();
    private static final NumberFormat percentFormatter = NumberFormat.getPercentInstance();

    public static BigDecimal calculate(String principal, String rate, int period, String contribution) throws ParseException {
        // Balance (Y) = P(1 + r)^Y + c[ ((1 + r)^Y - 1) / r]

        String rateAsPercent = percentFormatter.parse(rate).toString();

        BigDecimal a = BigDecimal.ONE.add(new BigDecimal(rateAsPercent)).pow(period); // (1 + r)^Y
        BigDecimal b = a.subtract(BigDecimal.ONE); // (1 + r)^Y - 1
        BigDecimal c = b.divide(new BigDecimal(rateAsPercent)); // ((1 + r)^Y - 1) / r
        BigDecimal d = c.multiply(new BigDecimal((moneyFormatter.parse(contribution).toString()))); // c[ ((1 + r)^Y - 1) / r]
        BigDecimal e = a.multiply(new BigDecimal(moneyFormatter.parse(principal).toString())); // P(1 + r)^Y
        BigDecimal f = e.add(d); // P(1 + r)^Y + c[ ((1 + r)^Y - 1) / r]

        return f;
    }

    public static void main(String[] args) throws ParseException {
//        DecimalFormat df = new DecimalFormat("#");
//        DecimalFormat df = new DecimalFormat("#.##");
//        DecimalFormat df = new DecimalFormat("#,###.##");
//        DecimalFormat df = new DecimalFormat(",###.##");
//        DecimalFormat df = new DecimalFormat("$#,###.##");
        DecimalFormat df = new DecimalFormat("$#,###.##;$(#)");

        DecimalFormat pf = new DecimalFormat("#%");

        BigDecimal compoundInterest = CompoundInterestCalculator.calculate("$25,300", "8%", 10, "$7,500");

//        System.out.println(compoundInterest);
        System.out.println(df.format(compoundInterest)); // $163,270.02
        System.out.println(df.format(compoundInterest.negate())); // $(163,270.02)

        System.out.println(pf.format(0.08));
    }
}
