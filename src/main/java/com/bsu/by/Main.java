package com.bsu.by;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner inputRequest = new Scanner(new FileReader("Request.txt"))) {
            ArrayList<String> numbers = new ArrayList<>();
            while (inputRequest.hasNextLine()) {
                String number = inputRequest.nextLine();
                numbers.add(number);
            }
            for (String num : numbers) {
                System.out.println(num + " " + isValidNumber(num));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static boolean isValidNumber(String number) {
        return number.matches("^\\d{1,3}((,|\\s)\\d{3})*([,|.]\\d+)?$");
    }
}
