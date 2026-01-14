public class MoveZerosToEnd {
  static void moveZeros(int[] arr) {
    int nonZero = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != 0) {
        int temp = arr[i];
        arr[i] = arr[nonZero];
        arr[nonZero] = temp;
        nonZero++;
      }
    }
  }

  public static void main(String[] args) {
    int[] nums = { 0, 2, 4, 0, 0, 5, 0, 0, 0, 9 };

    moveZeros(nums);

    for (int i = 0; i < nums.length; i++) {
      System.out.println(nums[i]);
    }
  }
}