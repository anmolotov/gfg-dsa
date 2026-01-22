public class MaxSumSubarray {
  static int sum(int[] arr) {
    int res = Integer.MIN_VALUE;
    int currSum = 0;
    for (int i = 0; i < arr.length; i++) {
      currSum = Math.max(arr[i], currSum + arr[i]);
      res = Math.max(currSum, res);
    }

    return res;
  }

  public static void main(String[] args) {
    int[] arr = { 2, 3, -8, 7, -1, 2, 3 };
    int[] arr2 = { 5, 8, 3 };
    System.out.println(sum(arr));
    System.out.println(sum(arr2));
  }
}