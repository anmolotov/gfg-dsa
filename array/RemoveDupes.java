public class RemoveDupes {
  static int remove(int[] arr) {
    int size = 1;

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] != arr[i - 1]) {
        arr[size] = arr[i];
        size++;
      }
    }

    return size;
  }

  public static void main(String[] args) {
    int[] sortedArr = { 1, 1, 1, 2, 2, 2, 3, 3, 3 };

    int newSize = remove(sortedArr);
    for (int i = 0; i < newSize; i++) {
      System.out.println(sortedArr[i]);
    }
  }
}