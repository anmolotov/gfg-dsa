public class Trap {
  static int volume(int[] arr) {
    int res = 0;
    int[] lmax = new int[arr.length];
    int[] rmax = new int[arr.length];

    lmax[0] = arr[0];
    for (int i = 1; i < arr.length; i++) {
      lmax[i] = Math.max(lmax[i - 1], arr[i]);
    }

    rmax[rmax.length - 1] = arr[arr.length - 1];
    for (int i = arr.length - 2; i >= 0; i--) { // i is initialized to len-2 because the last element is already rmax
      rmax[i] = Math.max(rmax[i + 1], arr[i]); // rmax[i+1] is the last element of rmax
    }

    for (int i = 1; i < arr.length - 1; i++) {
      res += (Math.min(lmax[i], rmax[i]) - arr[i]);
    }

    return res;
  }

  public static void main(String[] args) {
    int[] container1 = { 2, 0, 2 };
    int[] container2 = { 3, 0, 1, 2, 5 };
    int[] container3 = { 5, 0, 6, 2, 3 };

    System.out.println(volume(container1));
    System.out.println(volume(container2));
    System.out.println(volume(container3));
  }
}