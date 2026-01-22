public class ConsecutiveOne {
  static int ones(int[] arr) {
    int res = 0;
    int count = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 1) {
        count++;
        res = Math.max(res, count);
      } else {
        count = 0;
      }
    }

    return res;
  }

  public static void main(String[] args) {
    int[] arr = { 0, 1, 1, 0, 1, 0 };
    int[] arr2 = { 1, 0, 1, 1, 1, 1, 0, 1, 1 };
    System.out.println(ones(arr));
    System.out.println(ones(arr2));
  }
}
