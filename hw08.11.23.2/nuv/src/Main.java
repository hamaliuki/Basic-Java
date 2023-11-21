public class Main {
    public static void main(String[] args) {
        //Дано трехзначное число. Вывести на экран все цифры этого числа
        //Пример: 345
        //Вывод в консоль: Число 345 -> 3, 4, 5
        //Другой пример: 987
        //Вывод в консоль: Число 987 -> 9, 8, 7

        int num = 345;
        int hundreds = num / 100;
        int ten = num % 100 / 10;
        int one = num % 10;

        System.out.println("Число " + num + " -> " + hundreds + "," + ten + "," + one);
    }
}