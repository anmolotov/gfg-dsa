public class ReverseArray {
  static int[] reverse(int[] arr) {
    int[] rev = new int[arr.length];

    for (int i = 0; i < arr.length; i++) {
      rev[arr.length - 1 - i] = arr[i];
    }

    return rev;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };
    int[] revArr = reverse(arr);

    for (int a : revArr) {
      System.out.println(a);
    }
  }
}