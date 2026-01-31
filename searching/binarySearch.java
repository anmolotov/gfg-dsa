public class binarySearch {
  static int search(int[] arr, int val) {
    int left = 0;
    int right = arr.length - 1;

    while (left <= right) {
      int mid = left + (right - left) / 2;

      if (val == arr[mid]) {
        return mid;
      } else if (arr[mid] < val) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }

    return -1;
  }

  public static void main(String[] args) {
    int[] arr = { 10, 20, 30, 40, 50, 60 };
    int[] arr2 = { 2, 3, 14, 50, 93, 100 };
    System.out.println(search(arr, 20));
    System.out.println(search(arr2, 14));
  }
}