public class SquareRoot {

  static int root(int num) {
    return root(num, 1, num);
  }

  static int root(int num, int left, int right) {
    if (left > right) {
      return right;
    }

    int mid = left + (right - left) / 2;

    if (mid * mid == num) {
      return mid;
    } else if (mid * mid < num) {
      return root(num, mid + 1, right);
    } else {
      return root(num, left, mid - 1);
    }
  }

  public static void main(String[] args) {
    System.out.println(root(4));
    System.out.println(root(14));
    System.out.println(root(25));
  }
}