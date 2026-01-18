public class Stock {
  static int profit(int[] arr) {
    int res = 0;
    for (int i = arr.length - 1; i > 0; i--) {
      if (arr[i] > arr[i - 1]) {
        res = res + (arr[i] - arr[i - 1]);
      }
    }
    return res;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 5, 3, 8, 12 };
    int[] arr1 = { 30, 20, 10 };
    int[] arr2 = { 10, 20, 30 };
    int[] arr3 = { 1, 5, 3, 1, 2, 8 };

    System.out.println(profit(arr));
    System.out.println(profit(arr1));
    System.out.println(profit(arr2));
    System.out.println(profit(arr3));
  }
}
