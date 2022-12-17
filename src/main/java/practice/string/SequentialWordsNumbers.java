package practice.string;

public class SequentialWordsNumbers {

    public static String sequentialWordsNumbers(String text) {
        if (text.isBlank()) {
            return "";
        }

        int index = 0;
        StringBuilder stringBuilder = new StringBuilder();
        int counter = 1;
        int wordEnd = -1;

        while (wordEnd != text.length()) {
            wordEnd = text.indexOf(' ', index + 1) != -1 ?
                    text.indexOf(' ', index + 1) : text.length();
            String word = text.substring(index, wordEnd).strip();
            stringBuilder.append(" (")
                    .append(counter)
                    .append(") ")
                    .append(word);

            index = text.indexOf(' ', index + 1);
            counter++;
        }

        return stringBuilder.toString().strip();
    }
}
