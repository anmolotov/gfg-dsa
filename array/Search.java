public class Search {

  static boolean searchElement(int[] arr, int num) {
    int size = arr.length;

    for (int i = 0; i <= size; i++) {
      if (arr[i] == num) {
        System.out.println("value found at index: " + i);
        return true;
      }
    }

    System.out.println("value not found");
    return false;
  }

  public static void main(String[] args) {
    int[] arr = { 23, 5, 6, 32, 99 };

    searchElement(arr, 6);

  }
}