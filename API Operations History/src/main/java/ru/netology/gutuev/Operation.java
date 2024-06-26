package ru.netology.gutuev;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;

public class Operation {
    private LocalDate date;
    private int clientId;
    private double transactionSum;

    public Operation() {

    }

    private void setDate(String dateScan) {
        LocalDate date = LocalDate.parse(dateScan, DateTimeFormatter.ofPattern("yyyy.MM.dd"));
        this.date = date;
    }
    private void setClientId(int clientId) {
//        if (customerId != Customer.getCustomerId()){
//            throw new IllegalArgumentException("Пользователь с ID:" + customerId + " не существует!" + " Создайте нового пользователя...");
//        }
        this.clientId = clientId;
    }
    private void setTransaction_sum(double transactionSum) {
        this.transactionSum = transactionSum;
    }

    public LocalDate getDate() {
        return date;
    }
    public int getClientId() {
        return clientId;
    }
    public double getTransactionSum() {
        return transactionSum;
    }

    // Метод вывода информации о транзакции в консоль
    public void print() {
        System.out.println("Дата: [" + getDate() + "]" + " ID пользователя: [" + getClientId() + "]" + " Сумма транзакции [" + getTransactionSum() + ']');
    }

    public void transaction_data() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи дату транзакции:");
        setDate(scanner.nextLine());

        System.out.println("Введите id пользователя:");
        setClientId(scanner.nextInt());

        System.out.println("Введите сумму транзакции:");
        setTransaction_sum(scanner.nextDouble());

        if (getClientId() > Main.arraysLength) {
            throw new CustomerOperationOutOfBoundException(getClientId(), Main.transactions_counter);
        }
    }
}
