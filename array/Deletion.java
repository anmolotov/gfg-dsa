public class Deletion {
  static int delete(int[] arr, int size, int value) {
    int pos = -1;
    boolean found = false;
    for (int i = 0; i < size; i++) {
      pos++;
      if (arr[i] == value) {
        found = true;
        break;
      }

    }

    if (!found) {
      return size;
    }

    for (int j = pos; j < size - 1; j++) {
      arr[j] = arr[j + 1];
    }
    return size - 1;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 5, 3, 4, 6 };
    int size = delete(arr, arr.length, 5);

    for (int i = 0; i < size; i++) {
      System.out.println(arr[i]);
    }
  }
}
