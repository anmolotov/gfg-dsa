public class factorial {
  public static int fact(int x) {
    int trailingZero = 0;
    while (x > 0) {
      x = x / 5;

      trailingZero += x;
    }

    return trailingZero;
  }

  public static void main(String[] args) {
    System.out.println("number of trailing zeroes: " + fact(5));
  }
}
