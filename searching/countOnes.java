public class countOnes {

  static int firstOccurence(int[] arr, int left, int right) {
    if (left > right) {
      return -1;
    }

    int mid = left + (right - left) / 2;

    if (arr[mid] < 1) {
      left = mid + 1;
      return firstOccurence(arr, left, right);
    } else {
      if (mid == 0 || arr[mid - 1] != arr[mid]) {
        return mid;
      } else {
        return firstOccurence(arr, left, mid - 1);
      }
    }
  }

  static int lastOccurence(int[] arr, int left, int right) {
    if (left > right) {
      return -1;
    }

    int mid = left + (right - left) / 2;

    if (arr[mid] < 1) {
      left = mid + 1;
      return lastOccurence(arr, left, right);
    } else {
      if (mid == arr.length - 1 || arr[mid + 1] != arr[mid]) {
        return mid;
      } else {
        return lastOccurence(arr, mid + 1, right);
      }
    }
  }

  static int count(int[] arr) {
    int first = firstOccurence(arr, 0, arr.length - 1);
    int last = lastOccurence(arr, 0, arr.length - 1);

    return last - first + 1;
  }

  public static void main(String[] args) {
    int[] arr = { 0, 0, 0, 1, 1, 1, 1 };
    int[] arr2 = { 1, 1, 1, 1, 1 };

    System.out.println(count(arr));
    System.out.println(count(arr2));
  }
}