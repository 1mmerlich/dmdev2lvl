package com.dmdev.lvl2.dz3;

import java.util.ArrayList;
import java.util.List;

/**
 * Дана строка с текстом, в котором есть цифры от 0 до 9.
 * Написать 2 метода:
 * - возвращающий массив цифр из переданной строки
 * - возвращающий сумму цифр из переданного целочисленного массива
 * Посчитать сумму всех чисел из строки
 * Например:
 * “Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?” -> 18 (8+1+2+4+3)
 */
public class Main {
    public static void main(String[] args) {
        String input = "Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?";
        int sum = calculateSumOfDigits(input);
        System.out.println(sum);
    }

    public static int calculateSumOfDigits(String input) {
        int[] digits = getDigitsFromString(input);
        int sum = sumDigits(digits);
        return sum;
    }

    public static int[] getDigitsFromString(String input) {
        List<Integer> digitList = new ArrayList<>();

        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                int digit = Character.getNumericValue(c);
                digitList.add(digit);
            }
        }

        int[] digits = new int[digitList.size()];
        for (int i = 0; i < digitList.size(); i++) {
            digits[i] = digitList.get(i);
        }

        return digits;
    }

    public static int sumDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }
}
