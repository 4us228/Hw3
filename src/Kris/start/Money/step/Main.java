package Kris.start.Money.step;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Random rm = new Random();

    public static void main(String[] args) {
        int x = (rm.nextInt(10));
        int y;
        System.out.println("Угадай число от 0 до 9");
        int k;
        int c = 3;

        for (int i = 0; i < 1; ) {
            {
                if (c == 0) {
                    System.out.println("Игра оконченна, хочешь повторить?");
                    System.out.println("Введи 1 если да, введи 0 если нет");
                    k = sc.nextInt();
                    if (k == 0) {
                        break;
                    }
                    if (k == 1) {
                        c += 3;
                    }
                }
            }
            if (c == 0) {
                break;
            }
            System.out.printf("У тебя " + "%s" + "%2d" + "%8s", trY2(c), c, trY(c));
            System.out.println("");
            System.out.println("Введи число");
            y = sc.nextInt();

            if (y == x) {
                System.out.println("Ты угадал, поздравляю");
                c = 0;
                continue;
            }
            if (y < x) {
                System.out.println("Загаданое число больше");
            }
            if (y > x) {
                System.out.println("Загаданое число меньше");
            }
            c--;
        }

    }

    public static String trY(int n) {
        if (n == 1) {
            return "попытка";
        }
        if (n == 2 || n == 3) {
            return "попытки";
        }
        return "";

    }

    public static String trY2(int n) {
        if (n == 1) {
            return "осталась";
        }
        if (n == 2 || n == 3) {
            return "остались";
        }
        return "";

    }
}

