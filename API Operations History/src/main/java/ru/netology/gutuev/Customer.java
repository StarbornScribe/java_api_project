package ru.netology.gutuev;

import java.util.Scanner;

public class Customer {
//    private static int customerId;
    private String customerName;
    private int customerAge;
    private double amountCustomerTransactionPerMonth;
    Customer[] customerData = new Customer[10];

    // Инициализация конструктора класса
    public Customer() {

    }

    // Инициализация сеттеров
//    private void setCustomerId(int customerId) {
//        this.customerId = customerId;
//    }
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
//    public static int getCustomerId() {
//        return customerId;
//    }
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
        System.out.println("Создайте клиента:");
        System.out.println("________________");
        System.out.println("Введите имя клиента");
        setCustomerName(scanner.nextLine());
        System.out.println("Введите возраст клиента");
        setCustomerAge(scanner.nextInt());
    }
}
