public class SelectionSort {
  static void sort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {

      int min_idx = i;

      for (int j = i + 1; j < arr.length; j++) {
        if (arr[min_idx] > arr[j]) {
          min_idx = j;
        }
      }

      int temp = arr[min_idx];
      arr[min_idx] = arr[i];
      arr[i] = temp;
    }
  }

  public static void main(String[] args) {
    int[] arr = { 10, 5, 8, 20, 2, 18 };

    sort(arr);

    for (int a : arr) {
      System.out.println(a + " ");
    }
  }
}