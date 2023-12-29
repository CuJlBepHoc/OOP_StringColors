package Homework.HM_006;

public class ChangeColor {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public static void main(String[] args) {
        // System.out.println(ANSI_YELLOW + "green" + ANSI_RESET);
        // System.out.println("standard");
        // System.out.println(ANSI_RED + "red" + ANSI_RESET);

        printIndicator(24); // красный
        printIndicator(30); // красный
        printIndicator(31); // желтый
        printIndicator(74); // желтый
        printIndicator(76); // зеленый
        printIndicator(100); // зеленый

        printIndicator(-5); // некорректно
        printIndicator(101); // некорректно
    }

    static void printIndicator(int value) {
        String[] colors = {
                ANSI_RED, // [0, 30]
                ANSI_YELLOW, // [31, 75]
                ANSI_GREEN // [76, 100]
        };

        int[] ranges = { 30, 75, 100 };

        int colorIndex = 0;
        while (colorIndex < ranges.length && value > ranges[colorIndex]) {
            colorIndex++;
        }

        if (colorIndex < colors.length && value >= 0 && value <= 100) {
            System.out.println(colors[colorIndex] + value + ANSI_RESET);
        } else {
            System.out.println("Некорректное значение");
        }
    }
}