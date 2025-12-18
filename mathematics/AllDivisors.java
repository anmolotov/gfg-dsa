public class AllDivisors {
  public static void divisors(int num) {
    for (int i = 1; i <= (num / 2); i++) {
      if (num % i == 0) {
        System.out.print(i + " ");
      }
    }
    System.out.println(num);
  }

  public static void main(String[] args) {
    divisors(50);
  }
}