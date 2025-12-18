import java.util.Arrays;

public class SieveOfEratosthenes {

  public static void sieve(int num) {
    boolean[] wholeNums = new boolean[num + 1];
    Arrays.fill(wholeNums, Boolean.TRUE);

    for (int i = 2; i * i <= num; i++) {
      if (wholeNums[i]) {
        for (int j = i * i; j <= num; j += i) {
          wholeNums[j] = false;
        }
      }
    }

    for (int i = 2; i <= num; i++) {
      if (wholeNums[i]) {
        System.out.print(i + " ");
      }
    }

  }

  public static void main(String[] args) {
    sieve(30);
  }
}