package Guess;
import java.util.Scanner;

public class Number {
    public static void main(String [] args) {
    }

    public static void guessingNumberGame() {

        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        sc.close();
        System.out.println("Привет, я загадал число от 1 до 5, попробуй угадать. У тебя 5 попыток :)");


        switch (number) {
            case "Нет":
                System.out.println("В другой раз повезет)");

        }

        int i = 1;
        int b = 5;

        for (i=0; i< b; i++ ) {


        }
    }

}
