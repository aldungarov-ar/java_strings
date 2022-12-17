package practice.regex;

import java.util.Scanner;

public class PhoneCleanerRegex {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
      if (input.equals("0")) {
        scanner.close();
        break;
      }

      // TODO:напишите ваш код тут, результат вывести в консоль.
      input = input.replaceAll("\\D", "");

      boolean startsCorrect = input.startsWith("8") || input.startsWith("7");
      if (!startsCorrect) {
        input = 7 + input;
      } else if (input.startsWith("8")) {
        input = input.replaceFirst("8", "7");
      }

      boolean lengthCorrect = input.length() == 11;
      if (lengthCorrect) {
        System.out.println(input);
      } else {
        System.out.println("Неверный формат номера");
      }
    }
  }

}
