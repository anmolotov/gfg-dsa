public class FindPeak {
  static int peak(int[] arr) {
    return peak(arr, 0, arr.length - 1);
  }

  static int peak(int[] arr, int left, int right) {
    if (left > right)
      return -1;

    int mid = left + (right - left) / 2;

    if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == arr.length - 1 || arr[mid] >= arr[mid + 1])) {
      return arr[mid];
    }
    if (mid > 0 && arr[mid - 1] >= arr[mid]) {
      return peak(arr, left, mid - 1);
    } else {
      return peak(arr, mid + 1, right);
    }
  }

  public static void main(String[] args) {
    int[] arr = { 5, 10, 15, 20, 7 };
    int[] arr2 = { 10, 20, 15, 5, 23, 90, 67 };

    System.out.println(peak(arr));
    System.out.println(peak(arr2));
  }
}