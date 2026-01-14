public class SecondLargest {
  // static int solution(int[] arr) {
  // int largestIndex = 1;
  // int res = 0;

  // for (int i = 0; i < arr.length; i++) {
  // if (arr[i] > arr[largestIndex]) {
  // largestIndex = i;
  // }
  // }

  // for (int i = 0; i < arr.length; i++) {
  // if (arr[i] > arr[res] && arr[i] < arr[largestIndex]) {
  // res = i;
  // }
  // }

  // return res;
  // }

  static int solution(int[] arr) {
    int res = -1;
    int largest = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > arr[largest]) {
        res = largest;
        largest = i;
      } else if (arr[i] != arr[largest]) {
        if (res == -1 || arr[i] > arr[res]) {
          res = i;
        }
      }
    }

    return res;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 3, 5, 11, 67, 2, 80 };

    System.out.println(arr[solution(arr)]);

  }
}
