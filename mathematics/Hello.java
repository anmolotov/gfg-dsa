public class Hello {

  public static Boolean palindrome(int num) {
    int realNumber = num;
    int reverseNumber = 0;

    while (realNumber > 0) {
      reverseNumber *= 10;
      reverseNumber += realNumber % 10;
      realNumber /= 10;
    }

    return (reverseNumber == num);

  }

  public static void main(String[] args) {
    System.out.println(palindrome(121));
  }
}