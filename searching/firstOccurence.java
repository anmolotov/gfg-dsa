public class firstOccurence {
  static int search(int[] arr, int val) {
    for (int i = 0; i < arr.length; i++) {
      if (val == arr[i]) {
        return i;
      }
    }

    return -1;
  }

  static int recursiveSearch(int[] arr, int left, int right, int val) {

    if (left > right) {
      return -1;
    }

    int mid = left + (right - left) / 2;

    if (arr[mid] < val) {
      left = mid + 1;
      return recursiveSearch(arr, left, right, val);
    } else if (arr[mid] > val) {
      right = mid - 1;
      return recursiveSearch(arr, left, right, val);
    } else {
      if (mid == 0 || arr[mid - 1] != arr[mid]) {
        return mid;
      } else {
        return recursiveSearch(arr, left, mid - 1, val);
      }
    }
  }

  public static void main(String[] args) {
    int[] arr = { 1, 10, 10, 10, 20, 20, 40 };
    int[] arr2 = { 10, 20, 30 };
    int[] arr3 = { 15, 15, 15 };

    System.out.println(search(arr, 20));
    System.out.println(search(arr2, 15));
    System.out.println(search(arr3, 15));

    int left = 0, right = arr.length - 1;
    System.out.println(recursiveSearch(arr, left, right, 20));

    right = arr2.length - 1;
    System.out.println(recursiveSearch(arr2, left, right, 15));

    right = arr3.length - 1;
    System.out.println(recursiveSearch(arr3, left, right, 15));

  }
}