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

  public static int iterativePow(int base, int power) {
    int res = 1;

    while (power > 0) {
      if (power % 2 != 0) {
        res = res * base;
      }

      base = base * base;
      power = power / 2;
    }
    return res;
  }

  public static void main(String[] args) {
    System.out.println(pow(2, 3));
    System.out.println(iterativePow(2, 3));
  }
}