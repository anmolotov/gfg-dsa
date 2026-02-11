public class BubbleSort {
  static void sort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
  }

  public static void main(String[] args) {
    int[] arr = { 3, 5, 10, 20, 40 };
    sort(arr);

    for (int a : arr) {
      System.out.println(a + " ");
    }
  }
}