package ru.netology.gutuev;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("___Информация о транзакции___");
        transaction_data();
    }

    public static void transaction_data(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи дату транзакции: ");
        String dateScan = scanner.nextLine();
        LocalDate date = LocalDate.parse(dateScan, DateTimeFormatter.ofPattern("yyyy.MM.dd"));
        System.out.println("Введите id транзакции: ");
        int transaction_id = scanner.nextInt();
        System.out.println("Введите сумму транзакции: ");
        double transaction_sum = scanner.nextDouble();
        System.out.println(date + " " + transaction_id + " " + transaction_sum);
    }
}