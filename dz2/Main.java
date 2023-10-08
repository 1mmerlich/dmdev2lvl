package com.dmdev.lvl2.dz2;

/**
 * Дана строка.
 * Удалить из нее все повторяющиеся символы без учета регистра, если они идут друг за другом. Также удалить пробелы.
 * Результат привести к верхнему регистру.
 * Например:
 * "abc Cpddd Dio OsfWw" -> "ABCPDIOSFW"
 */
public class Main {
    public static void main(String[] args) {
        String input = "abc Cpddd Dio OsfWw";
        String result = removeConsecutiveDuplicates(input);
        System.out.println(result);
    }

    public static String removeConsecutiveDuplicates(String input) {
        input = input.replaceAll(" ", "");
        input = input.toUpperCase();

        StringBuilder sb = new StringBuilder();
        char prevChar = '\0';

        for (char c : input.toCharArray()) {
            if (c != prevChar) {
                sb.append(c);
                prevChar = c;
            }
        }
        return sb.toString();
    }
}
