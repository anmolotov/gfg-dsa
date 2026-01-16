public class LeadersInArray {
  // static void leaders(int[] arr) { //iterate the whole array for every single
  // element until the loops ends or a larger element is found

  // for (int i = 0; i < arr.length; i++) {
  // boolean leader = true;

  // for (int j = i + 1; j < arr.length - 1; j++) {
  // if (arr[i] <= arr[j]) {
  // leader = false;
  // break;
  // }
  // }

  // if (leader) {
  // System.out.print(arr[i] + " ");
  // }
  // }
  // }

  static void leaders(int[] arr) { // iterate from the end to the beginning of the array with leader being the last
                                   // element, print if the current element is larger than the leader and then
                                   // update the leader
    int leader = arr.length - 1;
    System.out.print(arr[leader] + " ");

    for (int i = arr.length - 2; i >= 0; i--) {
      if (arr[i] > arr[leader]) {
        System.out.print(arr[i] + " ");
        leader = i;
      }
    }
    System.out.println("\n");
  }

  public static void main(String[] args) {
    int[] arr = { 7, 10, 4, 3, 6, 5, 2 };

    leaders(arr);
  }
}