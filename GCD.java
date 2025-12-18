public class GCD {
  public static int greatestCommonDivisor(int a, int b) {
    if (b == 0) {
      return a;
    }

    // See how HCF is calculated using long division.
    int remainder = a % b;

    return greatestCommonDivisor(b, remainder);

  }

  public static void main(String[] args) {
    System.out.println(greatestCommonDivisor(44, 12));
  }
}
