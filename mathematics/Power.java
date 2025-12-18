public class Power {
  public static int pow(int base, int power) {
    if (power == 0) {
      return 1;
    }

    if (power == 1) {
      return base;
    }

    int half = pow(base, power / 2);

    if (power % 2 == 0) {
      return half * half;
    } else {
      return half * half * base; // odd power: divide 7 in half: ((base*base*base) * (base*base*base)) * base
    }
  }

  public static void main(String[] args) {
    System.out.println(pow(2, 3));
  }
}