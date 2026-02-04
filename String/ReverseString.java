package String;

public class ReverseString {
  public void reverseString(char[] s) {
    int i = 0, j = s.length - 1;
    char temp;
    for (i = 0; i <= s.length - 1; i++) {
      if (i != j && i < j) {
        temp = s[i];
        s[i] = s[j];
        s[j] = temp;
        j--;
      } else {
        break;
      }
    }
  }

  public static void main(String[] args) {
    char[] chracters = { 'H', 'a', 'n', 'n', 'a', 'h' }; // ["h","a","n","n","a","H"]
    ReverseString reverseString = new ReverseString();
    reverseString.reverseString(chracters);
  }
}
