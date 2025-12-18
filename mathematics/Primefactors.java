public class Primefactors {
  public static void factors(int x) {
    if (x <= 1) {
      return;
    }
    for (int i = 2; i * i <= x; i++) {
      if (x % i == 0) {
        System.out.print(i + " ");
        x /= i;
      }
    }
    if (x > 1) {
      System.out.println(x);
    }
  }

  public static void main(String[] args) {
    factors(10);
  }
}
