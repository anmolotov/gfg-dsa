public class TwoPointersApproach {
  static boolean twoSum(int[] arr, int val) {
    int i = 0, j = arr.length - 1;

    while (i < j) {
      if (arr[i] + arr[j] == val) {
        System.out.println("(" + i + "," + j + ")");
        return true;
      } else if (arr[i] + arr[j] < val) {
        i++;
      } else {
        j--;
      }
    }
    System.out.println("no such pairs found!");
    return false;
  }

  public static void main(String[] args) {
    int[] arr = { 2, 5, 8, 12, 30, 31, 32, 35 };

    twoSum(arr, 67);
    twoSum(arr, 27);
  }
}