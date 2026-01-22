public class EvenOddSubarray {
  static int solution(int[] arr) {
    int res = 1;
    int currCount = 1;

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] % 2 == arr[i - 1] % 2) {
        currCount = 1;
      } else {
        currCount++;
        res = Math.max(currCount, res);
      }

    }

    return res;
  }

  public static void main(String[] args) {
    int[] arr = { 10, 12, 14, 7, 8 };
    int[] arr2 = { 7, 10, 13, 14 };
    int[] arr3 = { 10, 12, 8, 4 };

    System.out.println(solution(arr));
    System.out.println(solution(arr2));
    System.out.println(solution(arr3));
  }
}