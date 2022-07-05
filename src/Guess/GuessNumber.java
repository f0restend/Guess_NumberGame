package Guess;
import java.util.Scanner;

public class GuessNumber {

    public static void guessingNumberGame() {

        Scanner sc = new Scanner(System.in);


        int number = 1 + (int) (10 * Math.random());

        int k = 5;

        int i, guess;

        System.out.println("Привет, выберите число от 1 до 10. " + "У тебя есть 5 попыток чтобы угадать");

        for (i = 0; i < k; i++) {

            System.out.println("Угадайте число");

            guess = sc.nextInt();
            //sc.close();

            if (number == guess) {
                System.out.println("Поздравляем! " + "Вы угадали число");
                break;
            } else if (number > guess && i != k - 1) {
                System.out.println("Число больше чем " + guess);
            } else if (number < guess && i != k - 1) {
                System.out.println("Число меньше чем " + guess);
            }
        }

        if (i == k) {
            System.out.println("Вы использовали все попытки. " + "Попробуйте еще раз :)");

            System.out.println("Номер был " + number);
            sc.close();
        }
    }

    public static void main(String[] args) {

        guessingNumberGame();
    }
}












