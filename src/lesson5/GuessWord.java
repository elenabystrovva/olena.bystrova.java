package lesson5;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class GuessWord {
    // Массив слов, одно из которых будет выбрано для игры
    private static final String[] WORDS = {
            "ЯБЛОКО", "КОМПЬЮТЕР", "ПРОГРАММА", "КНИГА", "КОФЕ",
            "ШОКОЛАД", "СНЕГ", "СОЛНЦЕ", "ИНТЕРНЕТ", "ГОРОД"
    };

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("Игра: Угадай слово");
        System.out.println("Слова для игры: " + Arrays.toString(WORDS));
        System.out.println("Вводите ОДНУ букву или целое слово. Регистр не важен.");


            int randomIndex = rnd.nextInt(WORDS.length);   // случайный индекс
            String secret = WORDS[randomIndex];            // загаданное слово
            playOneRound(in, secret);
            // -------------------------------------------------------

            System.out.print("Хотите сыграть ещё раз? (y/n): ");

        in.close();
    }

    private static void playOneRound(Scanner in, String secret) {
        char[] progress = new char[secret.length()];
        Arrays.fill(progress, '*');

        char[] tried = new char[33];  // храним уже введённые буквы
        int triedCount = 0;

        in.nextLine(); // очищаем буфер после предыдущего next()

        while (true) {
            System.out.println("\nСекретное слово: " + new String(progress));
            System.out.print("Ваш ход (буква или слово): ");
            String raw = in.nextLine().trim();

            if (raw.isEmpty()) {
                System.out.println("Пустой ввод. Попробуйте ещё раз.");
                continue;
            }

            String guess = raw.toUpperCase();

            // 1) Если введена одна буква
            if (guess.length() == 1) {
                char ch = guess.charAt(0);

                boolean alreadyTried = false;
                for (int i = 0; i < triedCount; i++) {
                    if (tried[i] == ch) {
                        alreadyTried = true;
                        break;
                    }
                }
                if (alreadyTried) {
                    System.out.println("Эту букву вы уже вводили. Попробуйте другую.");
                    continue;
                }

                tried[triedCount++] = ch;

                boolean found = false;
                for (int i = 0; i < secret.length(); i++) {
                    if (secret.charAt(i) == ch) {
                        progress[i] = ch;
                        found = true;
                    }
                }

                if (found) {
                    System.out.println("Есть такая буква! Позиции обновлены: " + new String(progress));
                } else {
                    System.out.println("Такой буквы нет. Продолжаем!");
                }

                if (isSolved(progress)) {
                    System.out.println("ВЫ ПОБЕДИЛИ! Слово: " + secret);
                    return;
                }
            }
        }
    }

    private static boolean isSolved(char[] progress) {
        for (char c : progress) if (c == '*') return false;
        return true;
    }
}
