package ru.netology.gutuev;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        transaction_data();
    }

    public static void transaction_data(){
        Scanner scanner = new Scanner(System.in);
        LocalDate[] date = new LocalDate[5];
        int[] transaction_id = new int[5];
        double[] transaction_sum = new double[5];
        String[] transaction = new String[5];

        while(true){
            System.out.println("Введите дату начала периода:");
            String sDate = scanner.nextLine();
            LocalDate startDate = LocalDate.parse(sDate, DateTimeFormatter.ofPattern("yyyy.MM.dd"));
            System.out.println("Введите дату окончания периода:");
            String eDate = scanner.nextLine();
            LocalDate endDate = LocalDate.parse(eDate, DateTimeFormatter.ofPattern("yyyy.MM.dd"));

            for (int i = 0; i<transaction.length; i++){
                System.out.println("Введите id транзакции:");
                transaction_id[i] = scanner.nextInt();
                scanner.nextLine(); // Этот сканер нужен для того, чтобы считать пустую строку после применения nextDouble() -- иначе выпадет ошибка

                System.out.println("Введи дату транзакции:");
                String dateScan = scanner.nextLine();
                date[i] = LocalDate.parse(dateScan, DateTimeFormatter.ofPattern("yyyy.MM.dd"));

                System.out.println("Введите сумму транзакции:");
                transaction_sum[i] = scanner.nextDouble();

                transaction[i] = ("id:" + transaction_id[i] + "| Дата: " + date[i] + "| Сумма: " + transaction_sum[i]);
            }
            for (int i = 0; i<transaction.length; i++){
                Period currentRange = Period.between(startDate,date[i]);
                if (!currentRange.isNegative() && ChronoUnit.DAYS.between(startDate, date[i]) <= ChronoUnit.DAYS.between(startDate, endDate)){
                    System.out.println(transaction[i]);
                }
            }
            break;
        }
    }
}