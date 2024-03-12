package ru.netology.gutuev;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;

public class Operation {
    private LocalDate date;
    private int customerId;
    private double transactionSum;

    public Operation(){

    }

    private void setDate(String dateScan) {
        LocalDate date = LocalDate.parse(dateScan, DateTimeFormatter.ofPattern("yyyy.MM.dd"));
        this.date = date;
    }
    private void setCustomerId(int customerId){
//        if (customerId != Customer.getCustomerId()){
//            throw new IllegalArgumentException("Пользователь с ID:" + customerId + " не существует!" + " Создайте нового пользователя...");
//        }
        this.customerId = customerId;
    }
    private void setTransaction_sum(double transactionSum) {
        this.transactionSum = transactionSum;
    }

    public LocalDate getDate(){
        return date;
    }
    public int getCustomerId(){
        return customerId;
    }
    public double getTransactionSum(){
        return transactionSum;
    }

    // Метод вывода информации о транзакции в консоль
    public void print() {
        System.out.println("Дата: [" + date + "]" + " ID пользователя: [" + customerId + "]" + " Сумма транзакции [" + transactionSum + ']');
    }

//    public String toString(){
//        return "Дата: [" + date + "]" + " ID пользователя: [" + customerId + "]" + " Сумма транзакции [" + transactionSum + "]";
//    }

    public void transaction_data() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи дату транзакции:");
        setDate(scanner.nextLine());

        System.out.println("Введите id пользователя:");
        setCustomerId(scanner.nextInt());

        System.out.println("Введите сумму транзакции:");
        setTransaction_sum(scanner.nextDouble());


//        while(true){
//            System.out.println("Введите дату начала периода:");
//            String sDate = scanner.nextLine();
//            LocalDate startDate = LocalDate.parse(sDate, DateTimeFormatter.ofPattern("yyyy.MM.dd"));
//            System.out.println("Введите дату окончания периода:");
//            String eDate = scanner.nextLine();
//            LocalDate endDate = LocalDate.parse(eDate, DateTimeFormatter.ofPattern("yyyy.MM.dd"));
//
//            for (int i = 0; i<transaction.length; i++){
//                System.out.println("Введите id транзакции:");
//                transaction_id[i] = scanner.nextInt();
//                scanner.nextLine(); // Этот сканер нужен для того, чтобы считать пустую строку после применения nextDouble() -- иначе выпадет ошибка
//
//                System.out.println("Введи дату транзакции:");
//                String dateScan = scanner.nextLine();
//                date[i] = LocalDate.parse(dateScan, DateTimeFormatter.ofPattern("yyyy.MM.dd"));
//
//                System.out.println("Введите сумму транзакции:");
//                transaction_sum[i] = scanner.nextDouble();
//
//                transaction[i] = ("id:" + transaction_id[i] + "| Дата: " + date[i] + "| Сумма: " + transaction_sum[i]);
//            }
//            for (int i = 0; i<transaction.length; i++){
//                Period currentRange = Period.between(startDate,date[i]);
//                if (!currentRange.isNegative() && ChronoUnit.DAYS.between(startDate, date[i]) <= ChronoUnit.DAYS.between(startDate, endDate)){
//                    System.out.println(transaction[i]);
//                }
//            }
//            break;
//        }
    }
}
