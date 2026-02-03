package Math;

public class PalindromeNumber {
  public boolean isPalindrome(int x) {
    int digit;
    int temp = x;
    long newNum = 0;
    while (x > 0) {
      digit = x % 10;
      x = x / 10;
      newNum = newNum * 10 + digit;
    }
    if (newNum != temp) {
      return false;
    }
    return true;
  }

  public static void main(String[] args) {
    PalindromeNumber palindromeNumber = new PalindromeNumber();
    System.out.println(palindromeNumber.isPalindrome(121));
  }
}
