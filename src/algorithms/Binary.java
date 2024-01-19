package algorithms;

import java.util.Scanner;

public class Binary {

    // Бинарный поиск числа
    private static Scanner scanner = new Scanner(System.in);
    private static int secretNumber;
    private static int minNumber = 0;
    private static int maxNumber = 2_000_000_000;
    private static int resNumber;

    public static void main(String[] args) {

        number();

    }

    private static void number() {

        boolean flag = true;

        System.out.println("Одгодаю твоё число. Игра началась :(");
        System.out.println("Введи своё загаданное число ! От 0 до 2_000_000_000");

        secretNumber = scanner.nextInt();

        if (secretNumber < minNumber || secretNumber > maxNumber) {
            System.out.println("Ваше число должнл быть От 0 до 2_000_000_000");
        }

        resNumber = maxNumber / 2;
        while (flag) {

            if (resNumber != secretNumber) {
                resNumber = resNumber / 2;
            }

           
            System.out.println("Ваше число " + resNumber);

        }

    }

}
