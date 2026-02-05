public class ThreeSum {
  static boolean sum(int[] arr, int val) {
    int right = arr.length - 1;

    for (int i = 0; i < right; i++) {
      int left = i + 1;
      int remaining = val - arr[i];
      while (left < right) {
        if (arr[left] + arr[right] == remaining) {
          System.out.println("(" + i + "," + left + "," + right + ")");
          return true;
        } else if (arr[left] + arr[right] < remaining) {
          left++;
        } else {
          right--;
        }
      }
    }

    System.out.println("no such pairs found!");
    return false;
  }

  public static void main(String[] args) {
    int[] arr = { 2, 3, 4, 8, 9, 20, 40 };
    int[] arr2 = { 1, 2, 5, 6 };

    sum(arr, 32);
    sum(arr2, 8);
  }
}