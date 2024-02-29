package Homework2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DecisionAndLoopsHomework {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        guessNumber();
        guessWord();
    }
    public static void guessNumber() {
        final int SECRET_NUMBER = (int) (Math.random() * 100);
        guessNumber(SECRET_NUMBER, in);
    }

    public static void guessNumber(int number, Scanner in) {
        System.out.println("Key in your process: ");
        int answer = in.nextInt();
        int countAttempt = 1;
        while (answer != number) {
            if (answer < number) {
                System.out.println("Try higher");
            } else {
                System.out.println("Try lower");
            }
            answer = in.nextInt();
            countAttempt++;
        }
        System.out.println("You got it in " + countAttempt + " trials!");
    }

    public static void guessWord() {
        final int WORD_INDEX = (int) (Math.random() * 10);
        ArrayList<String> wordArray = new ArrayList<>();
        String fileName = "D:\\Users\\Asus\\IntellijProjects\\OOP\\src\\Homework2\\word"; // Thay đổi đường dẫn tới tệp của bạn
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = br.readLine()) != null) {
                wordArray.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        final String WORD = wordArray.get(WORD_INDEX);
        guessWord(WORD, in);
    }

    public static void guessWord(String guessedString, Scanner in) {

        int countAttemp = 1;
        int checkWin = 1;

        boolean[] checkChar = new boolean[guessedString.length()];
        boolean[] allTrue = new boolean[guessedString.length()];

        for (int i = 0; i < allTrue.length; i++) {
            allTrue[i] = true;
        }

        System.out.println("Key in one character or your guess word: ");

        while (!Arrays.equals(checkChar, allTrue)) {
            System.out.print("Trials " + countAttemp + ": ");
            String input = in.nextLine();
            countAttemp++;
            for (int i = 0; i < guessedString.length(); i++) {
                if (guessedString.charAt(i) == input.charAt(0)) {
                    checkChar[i] = true;
                }
            }

            for (int i = 0; i < checkChar.length; i++) {
                if (checkChar[i]) {
                    System.out.print(guessedString.charAt(i));
                } else {
                    System.out.print("_");
                }
            }
            System.out.println();
        }
        System.out.println("You got it in " + countAttemp + " times!");
    }
}
