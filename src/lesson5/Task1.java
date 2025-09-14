package lesson5;

public class Task1 {
    public static void main(String[] args) {
        // Создаем двумерный массив 8x8
        String[][] chessBoard = new String[8][8];

        // Заполняем массив
        for (int i = 0; i < 8; i++) {          // строки
            for (int j = 0; j < 8; j++) {      // столбцы
                // Если сумма индексов четная – белая клетка (W), иначе черная (B)
                if ((i + j) % 2 == 0) {
                    chessBoard[i][j] = "W";
                } else {
                    chessBoard[i][j] = "B";
                }
            }
        }

        // Выводим результат
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(chessBoard[i][j] + " ");
            }
            System.out.println();
        }
    }
}
