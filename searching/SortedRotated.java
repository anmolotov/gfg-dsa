public class SortedRotated {
  static int search(int[] arr, int val) {
    return search(arr, 0, arr.length - 1, val);
  }

  static int search(int[] arr, int left, int right, int val) {
    if (left > right) {
      return -1;
    }

    int mid = left + (right - left) / 2;

    if (arr[mid] == val) {
      return mid;
    }

    if (arr[left] <= arr[mid]) {
      if (arr[left] <= val && val < arr[mid]) {
        return search(arr, left, mid - 1, val);
      } else {
        return search(arr, mid + 1, right, val);
      }
    } else {
      if (arr[mid] < val && val >= arr[right]) {
        return search(arr, mid + 1, right, val);
      } else {
        return search(arr, left, mid, val);
      }
    }
  }

  public static void main(String[] args) {
    int[] arr = { 10, 20, 30, 40, 50, 8, 9 };

    System.out.println(search(arr, 30));
  }
}