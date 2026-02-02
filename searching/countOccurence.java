public class countOccurence {
  static int firstOccurence(int[] arr, int left, int right, int val) {
    if (left > right) {
      return -1;
    }

    int mid = left + (right - left) / 2;

    if (arr[mid] < val) {
      left = mid + 1;
      return firstOccurence(arr, left, right, val);
    } else if (arr[mid] > val) {
      right = mid - 1;
      return firstOccurence(arr, left, right, val);
    } else {
      if (mid == 0 || arr[mid - 1] != arr[mid]) {
        return mid;
      } else {
        return firstOccurence(arr, left, mid - 1, val);
      }
    }
  }

  static int lastOccurence(int[] arr, int left, int right, int val) {

    if (left > right) {
      return -1;
    }

    int mid = left + (right - left) / 2;

    if (arr[mid] < val) {
      left = mid + 1;
      return lastOccurence(arr, left, right, val);
    } else if (arr[mid] > val) {
      right = mid - 1;
      return lastOccurence(arr, left, right, val);
    } else {
      if (mid == arr.length - 1 || arr[mid + 1] != arr[mid]) {
        return mid;
      } else {
        return lastOccurence(arr, mid + 1, right, val);
      }
    }
  }

  static int count(int[] arr, int val) {
    int left = 0;
    int right = arr.length - 1;

    if (firstOccurence(arr, left, right, val) == 0) {
      return 0;
    }

    return (lastOccurence(arr, left, right, val) - firstOccurence(arr, left, right, val)) + 1;
  }

  public static void main(String[] args) {
    int[] arr = { 10, 20, 20, 20, 30, 30 };

    System.out.println("First occurence: " + firstOccurence(arr, 0, arr.length - 1, 30));
    System.out.println("Last occurence: " + lastOccurence(arr, 0, arr.length - 1, 30));
    System.out.println("Total count: " + count(arr, 30));

  }
}
