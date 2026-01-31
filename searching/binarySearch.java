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

  static int recursiveSearch(int[] arr, int left, int right, int val) {
    if (left > right) {
      return -1;
    }

    int mid = left + (right - left) / 2;

    if (val == arr[mid]) {
      return mid;
    } else if (arr[mid] < val) {
      left = mid + 1;
      return recursiveSearch(arr, left, right, val);
    } else {
      right = mid - 1;
      return recursiveSearch(arr, left, right, val);
    }
  }

  public static void main(String[] args) {
    int[] arr = { 10, 20, 30, 40, 50, 60 };
    int[] arr2 = { 2, 3, 14, 50, 93, 100 };
    System.out.println(search(arr, 20));

    int left = 0;
    int right = arr2.length - 1;
    System.out.println(recursiveSearch(arr2, left, right, 14));
  }
}