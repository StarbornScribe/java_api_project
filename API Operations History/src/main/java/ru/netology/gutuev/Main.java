package ru.netology.gutuev;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

      Operation[] operations = new Operation[2];
      Customer[] customers = new Customer[2];
      int[][] statement = new int[2][2];

        for (int i = 0; i < operations.length; i++) {
            operations[i] = new Operation();
        }
        for (int i = 0; i < operations.length; i++) {
            operations[i].print();

        }
    }
}