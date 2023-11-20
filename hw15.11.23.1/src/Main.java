import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Дана длина в метрах. Напишите программу, которая переводит
        // указанное значение в км,мили, футы и аршины.
        // Выведите начальное и конвертированные значения на экран.
        Scanner scr = new Scanner(System.in);
        System.out.println("введите длинну в метрах");
        int metr = scr.nextInt();

        double kilometr = metr / 1000;
        double mile = metr * 0.0006;
        double fut = metr * 3.28;
        double arch = metr * 1.4;

        System.out.println("длинна в метрах" + metr);
        System.out.println("длинна в километрах" + kilometr);
        System.out.println("длинна в милях" + mile);
        System.out.println("длинна в футах" + fut);
        System.out.println("длинна в аршинах" + arch);
    }
}