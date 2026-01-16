public class Frequencies {
  static void solution(int[] arr) {
    int freq = 1;

    if (arr.length == 1) {
      System.out.println(arr[0] + ": " + freq);
      return;
    }

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] == arr[i - 1]) {
        freq++;
      } else if (arr[i] != arr[i - 1]) {
        System.out.println(arr[i - 1] + ": " + freq);
        freq = 1;
      }
    }

    System.out.println(arr[arr.length - 1] + ": " + freq);
  }

  public static void main(String[] args) {
    int[] arr = { 10, 10, 10, 25, 30, 30 };
    int[] arr2 = { 10, 10, 10, 10 };
    solution(arr);
    System.out.println("------------------");
    solution(arr2);
  }
}