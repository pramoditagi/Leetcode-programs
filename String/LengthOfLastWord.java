package String;

class LengthOfLastWord {
  public int lengthOfLastWord(String s) {
    String[] newString = s.trim().split(" ");
    return newString[newString.length - 1].length();
  }

  public static void main(String[] args) {
    LengthOfLastWord lastWord = new LengthOfLastWord();
    System.out.println(lastWord.lengthOfLastWord("   fly me   to   the moon  "));
  }
}