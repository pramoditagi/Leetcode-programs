package String;

public class DetectCapital {
  public boolean detectCapitalUse(String word) {

    if (word.equals(word.toUpperCase()) || word.equals(word.toLowerCase())
        || (word.substring(1).equals(word.substring(1).toLowerCase()))
            && (word.substring(0, 1).equals(word.substring(0, 1).toUpperCase()))) {
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    DetectCapital dc = new DetectCapital();
    System.out.println(dc.detectCapitalUse("Google"));
  }
}
