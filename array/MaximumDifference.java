// max value of arr[j] - arr[i] such that j > i
public class MaximumDifference {
  // static int solution(int[] arr) {
  // int res = Integer.MIN_VALUE;

  // for (int i = arr.length - 1; i >= 0; i--) {
  // int sub = 0;
  // for (int j = 0; j < i; j++) {
  // sub = arr[i] - arr[j];
  // if (sub > res) {
  // res = sub;
  // }
  // }
  // }

  // return res;
  // }

  static int solution(int[] arr) {
    int res = Integer.MIN_VALUE;
    int minVal = arr[0];

    for (int i = 1; i < arr.length; i++) {
      res = Math.max(res, arr[i] - minVal);
      minVal = Math.min(minVal, arr[i]);
    }

    return res;
  }

  public static void main(String[] args) {
    int[] arr = { 2, 3, 10, 6, 4, 8, 1 };
    int[] arr2 = { 7, 9, 5, 6, 3, 2 };
    int[] arr3 = { 10, 20, 30 };
    int[] arr4 = { 30, 10, 8, 2 };

    System.out.println(solution(arr));
    System.out.println(solution(arr2));
    System.out.println(solution(arr3));
    System.out.println(solution(arr4));
  }
}