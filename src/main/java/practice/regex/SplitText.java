package practice.regex;

public class SplitText {

  public static void main(String[] args) {

  }

  public static String splitTextIntoWords(String text) {
    if (text.isBlank()) {
      return "";
    }

    String regex = "[^a-zA-Z]";
    String[] split = text.split(regex);
    StringBuilder stringBuilder = new StringBuilder();

    for (String word : split) {
      if (!word.isBlank()) {
        stringBuilder.append(word.strip()).append(System.lineSeparator());
      }
    }

    return stringBuilder.toString().strip();
  }

}