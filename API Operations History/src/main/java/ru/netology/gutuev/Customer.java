package ru.netology.gutuev;

import java.util.Scanner;

public class Customer {
    private String customerName;
    private int customerAge;
    private double amountCustomerTransactionPerMonth;
    private int customerOperationId;

    // Инициализация конструктора класса
    public Customer() {

    }

    // Инициализация сеттеров
    private void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    private void setCustomerAge(int customerAge) {
        this.customerAge = customerAge;
    }
    private void setAmountCustomerTransactionPerMonth(double amountCustomerTransactionPerMonth) {
        this.amountCustomerTransactionPerMonth = amountCustomerTransactionPerMonth;
    }

    // Инициализация геттеров
    public String getCustomerName() {
        return customerName;
    }
    public int getCustomerAge() {
        return customerAge;
    }
    public double getAmountCustomerTransactionPerMonth() {
        return amountCustomerTransactionPerMonth;
    }

    public void customerRegistration() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Создание клиента:");
        System.out.println("________________");
        System.out.println("Введите имя клиента");
        setCustomerName(scanner.nextLine());
        System.out.println("Введите возраст клиента");
        setCustomerAge(scanner.nextInt());
    }
}
