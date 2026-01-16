public class LeftRotate {
  static void rotate(int[] arr) {
    int temp = arr[0];

    for (int i = 0; i < arr.length - 1; i++) {
      arr[i] = arr[i + 1];
    }

    arr[arr.length - 1] = temp;
  }

  static void rotateBy(int[] arr, int r) {
    int[] temp = new int[r];

    for (int i = 0; i < r; i++) {
      temp[i] = arr[i];
    }

    for (int i = r; i < arr.length; i++) {
      arr[i - r] = arr[i];
    }

    for (int i = 0; i < r; i++) {
      arr[arr.length - r + i] = temp[i];
    }
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4, 5 };
    int[] nums1 = { 1, 2, 3, 4, 5 };

    rotate(nums);

    rotateBy(nums1, 2);

    for (int a : nums1) {
      System.out.println(a);
    }
  }
}