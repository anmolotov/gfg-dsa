public class LargestElement {
  static int largest(int[] arr) {
    int elementIndex = 1;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > arr[elementIndex]) {
        elementIndex = i;
      }
    }
    return elementIndex;
  }

  public static void main(String[] args) {
    int[] arr = { 2, 9, 10, 3, 4, 57 };
    System.out.println(arr[largest(arr)]);

  }
}
