public class Insert {

  static void insertElement(int[] arr, int usedSpace, int capacity, int pos, int value) {
    if (pos <= 0 || pos > capacity) {
      System.out.println("enter a valid position!");
    } else if (usedSpace == capacity) {
      System.out.println("the array is full!");
      return;
    }

    for (int i = usedSpace; i >= pos; i--) {
      arr[i] = arr[i - 1];
    }

    for (int i = 0; i <= capacity; i++) {
      if (i == pos) {
        arr[pos - 1] = value;
        usedSpace++;
        return;
      }
    }

  }

  public static void main(String[] args) {
    int capacity = 5;
    int[] arr = new int[capacity];

    insertElement(arr, 0, capacity, 1, 2);

    for (int a : arr) {
      System.out.println(a);
    }
  }
}
