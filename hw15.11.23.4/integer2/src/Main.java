import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Пользователь вводит целое число. Напишите программу, которая делит это число на 2
        // и выводит результат. Остаток деления можно отбросить.
        // Операторы деления / и остатка от деления % применять нельзя.

        Scanner scr = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int num = scr.nextInt();

        int result = num >> 1;
        System.out.println("Результат деления на 2: " + result);
    }
}
