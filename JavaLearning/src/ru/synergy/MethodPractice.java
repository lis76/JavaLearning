package ru.synergy;

import java.util.Scanner;

public class MethodPractice {
    public static void main(String[] args) {
/*        double num1 = getNumber(); // Просим ввести первое число
        double num2 = getNumber(); // Просим ввести второе число
        char operation = getOperation(); // Просим ввести операцию
        double result = calc(num1, num2, operation); // Вычесляем
        System.out.println("Result" + result); // Выводим результат*/

        int[] a = {10, 15, 20, 75, 30};
        writeArray(a);

        String[] strings = {"jhvkghk,nvkhgf", "jhygtfgcnbbk", "jgfytfvmnbvhkg", "5456132"};
        writeArray(strings);

        writeArray(strings, 2);

    }

    /*
     * //ПСЕВДОКОД
     * [модификаторы]<тип возвращаемого значения> <название метода>([параметры]){
     * тело метода
     * }
     */

    private static double calc(double num1, double num2, char operation) {
        switch (operation) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            default:
                return 0;
        }
    }

    private static char getOperation() {
        Scanner in = new Scanner(System.in); // 1 +, 2 -, 3 *,
        switch (in.nextInt()) {
            case 1:
                return '+';
            case 2:
                return '-';
            case 3:
                return '*';
            default:
                return '+';
        }
    }

    private static double getNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void writeArray(int[] arr) {
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println("Значение: " + (arr[i] + 1));
        }
    }

    public static void writeArray(String[] arr) {
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println("Значение: " + (arr[i] + 1));
        }

    }

    public static void writeArray(String[] arr, int numberOfPrints) {
        for (int i = 0; i <= numberOfPrints-1; i++) {
            System.out.println("Значение: " + (arr[i] + 1));
        }

    }

}

