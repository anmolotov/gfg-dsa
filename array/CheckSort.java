public class CheckSort {
  static boolean solution(int[] arr) {
    boolean increasing = true;
    boolean decreasing = true;

    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] > arr[i + 1]) {
        increasing = false;
      }
    }

    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] < arr[i + 1]) {
        decreasing = false;
      }
    }

    return increasing || decreasing;
  }

  public static void main(String[] args) {
    int[] sorted = { 1, 2, 3, 4, 5, 6 };
    int[] unsorted = { 1, 52, 4, 4, 6, 3, 8 };

    System.out.println(solution(unsorted));
    System.out.println(solution(sorted));
  }
}
