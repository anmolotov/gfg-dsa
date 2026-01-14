public class MoveZerosToEnd {
  static void moveZeros(int[] arr) {
    int nonZero = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != 0) { // skip when the element is zero
        int temp = arr[i]; // swapping arr[0] with arr[0] in first loop
        arr[i] = arr[nonZero];
        arr[nonZero] = temp;
        nonZero++; // this variable only increments when a non zero element is encountered so it
                   // always stays at the position available for swap
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