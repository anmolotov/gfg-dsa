public class MaxSumCircular {

  static int maxSum(int[] arr) {
    int maxNormal = Integer.MIN_VALUE;
    int currSum = 0;
    int minSum = Integer.MAX_VALUE;
    int totalSum = 0;

    for (int i = 0; i < arr.length; i++) {
      currSum = Math.max(arr[i], currSum + arr[i]);
      maxNormal = Math.max(currSum, maxNormal);
      totalSum += arr[i];
    }

    currSum = 0;
    for (int i = 0; i < arr.length; i++) {
      currSum = Math.min(arr[i], currSum + arr[i]);
      minSum = Math.min(minSum, currSum);
    }

    if (maxNormal < 0) {
      return maxNormal;
    }

    return Math.max(maxNormal, totalSum - minSum);
  }

  public static void main(String[] args) {
    int[] arr = { 5, -2, 3, 4 };

    System.out.println(maxSum(arr));
  }
}