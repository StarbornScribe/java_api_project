package ru.netology.gutuev;

public class Customer {
    private int customerId;
    private String customerName;
    private int customerAge;
    private double amountCustomerTransactionPerMonth;

    // Инициализация конструктора класса
    public Customer(int customerId, String customerName, int customerAge, double amountCustomerTransactionPerMonth){
        setCustomerId(customerId);
        setCustomerName(customerName);
        setCustomerAge(customerAge);
        setAmountCustomerTransactionPerMonth(amountCustomerTransactionPerMonth);
    }

    // Инициализация сеттеров
    public void setCustomerId(int customerId){
    this.customerId = customerId;
    }
    public void setCustomerName(String customerName){
    this.customerName = customerName;
    }
    public void setCustomerAge(int customerAge){
    this.customerAge = customerAge;
    }
    public void setAmountCustomerTransactionPerMonth(double amountCustomerTransactionPerMonth){
    this.amountCustomerTransactionPerMonth = amountCustomerTransactionPerMonth;
    }

    // Инициализация геттеров
    public int getCustomerId(){
        return customerId;
    }
    public String getCustomerName(){
        return customerName;
    }
    public int getCustomerAge(){
        return customerAge;
    }
    public double getAmountCustomerTransactionPerMonth(){
        return amountCustomerTransactionPerMonth;
    }

}
