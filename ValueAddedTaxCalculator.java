import java.util.Scanner;
public class ValueAddedTaxCalculator {
    public static void main(String[] args) {
        float priceExcludingTax;
        System.out.println("Enter the Price excluding tax.");
        Scanner input = new Scanner(System.in);
        priceExcludingTax = input.nextFloat();
        float appliedTaxRatio = (priceExcludingTax < 1000) ? 0.18f:0.08f;
        float taxReceivable = priceExcludingTax * appliedTaxRatio;
        float priceIncludingTax = priceExcludingTax + taxReceivable;
        System.out.println("Price Excluding Value Added Tax: " + priceExcludingTax);
        System.out.println("Applied Value Added Tax Ratio: " + "%" + 100 * appliedTaxRatio);
        System.out.println("Value Added Tax Receivable: " + taxReceivable);
        System.out.println("Price Including Tax: " + priceIncludingTax);
    }
}
