package ru.netology.gutuev;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        transaction_data();
    }

    public static void transaction_data(){
        String transaction;
        Scanner scanner = new Scanner(System.in);

        StringBuilder output = new StringBuilder();
        String result;
        while(true){
            for (int i = 0; i<5; i++){
                System.out.println("Введите id транзакции: ");
                int transaction_id = scanner.nextInt();
                scanner.nextLine(); // Этот сканер нужен для того, чтобы считать пустую строку после применения nextDouble() -- иначе выпадет ошибка

                System.out.println("Введи дату транзакции: ");
                String dateScan = scanner.nextLine();
                LocalDate date = LocalDate.parse(dateScan, DateTimeFormatter.ofPattern("yyyy.MM.dd"));

                System.out.println("Введите сумму транзакции: ");
                double transaction_sum = scanner.nextDouble();

                transaction = ("id:" + transaction_id + "| Дата: " + date + "| Сумма: " + transaction_sum);

                output.append(transaction + '\n'); // Добавляет в StingBuilder output результаты текущего ввода тем самым накапливая там данные
            }
            result = output.toString(); // Превращает output в String после того как выполнен цикл for
            break;
        }
        System.out.println("___Информация о транзакциях___" + '\n' + result);
    }
}