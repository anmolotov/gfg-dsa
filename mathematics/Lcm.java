public class Lcm {
  public static int hcf(int a, int b) {
    // while (b != 0) {
    // int temp = b;
    // b = a % b;
    // a = temp;
    // }

    // return a;

    if (b == 0) {
      return a;
    }

    return hcf(b, a % b);

  }

  public static int lcm(int a, int b) {
    int lcm = (a * b) / hcf(a, b);

    return lcm;
  }

  public static void main(String[] args) {
    System.out.println(lcm(4, 6));
  }
}
