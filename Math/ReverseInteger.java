package Math;

public class ReverseInteger {
  public int reverse(int x) {
    int digit;
    // Need to use long as using int might break for values ranging
    // from -2^31 to 2^31 - 1
    long newNumber = 0;
    int temp = x;
    if (x < 0) {
      x *= -1;
    }
    while (x > 0) {
      digit = x % 10;
      x /= 10;
      newNumber = newNumber * 10 + digit;
    }
    if (newNumber < Integer.MIN_VALUE || newNumber > Integer.MAX_VALUE) {
      return 0;
    }
    if (temp < 0) {
      return (int) newNumber * -1;
    }
    return (int) newNumber;
  }

  public static void main(String[] args) {
    ReverseInteger reverseInteger = new ReverseInteger();
    System.out.println(reverseInteger.reverse(1534236469));
  }
}
