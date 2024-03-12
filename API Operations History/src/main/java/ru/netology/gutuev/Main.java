package ru.netology.gutuev;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Operation[] operations;
    private static Customer[] customers;
    private static int[][] statement;
    public static int input;
    private static int rowNumber;

    public static void main(String[] args) {
//        Operation[] operations = new Operation[2];
//        Customer[] customers = new Customer[2];
//        int[][] statement = new int[2][2];
        operations = new Operation[2];
        customers = new Customer[2];
        statement = new int[2][2];

        while(true){
            menu();
            if (input == 1) {
                for (int i = 0; i < customers.length; i++) {
                    if (customers[i] != null) {
                        continue;
                    } else {
                        customers[i] = new Customer();
                        customers[i].customerRegistration();        // Вызываем метод создания пользователя из класса Customer
                        System.out.println("Создан пользователь " + customers[i].getCustomerName() + " | " + customers[i].getCustomerAge() + " лет | ID: " + i);
                    } break;
                }
            } else if(input == 2) {
                for (int i = 0; i < operations.length; i++) {
                    if (operations[i] == null) {
                        operations[i] = new Operation();
                        operations[i].transaction_data();       // вызываем метод создания транзакции
                        int clientId = operations[i].getCustomerId();      // получаем id клиента, чтобы положить в индекс массива statement
                        for (int n = 0; i < operations.length; n++){
                            if (statement[clientId][n] == 0) {
                                statement[clientId][n] = i;
                            } else {
                                continue;
                            } break;
                        }
                    } else {
                        continue;
                    } break;        // Завершает цикл for когда ввели данные по operations[i]
                }
            } else {
                System.out.println(Arrays.toString(statement));
            }
        }
//        for (int i = 0; i < operations.length; i++) {
//            operations[i].print();
//        }
//        for (int i = 0; i < operations.length; i++){
//            for (int x = 0; x < customers.length; x++){
//                statement[i][x] = operations[i].getCustomerId();        // i - id клиента из массива customers, x - порядковый номер операции клиента из массива operations
//            }
//        }

    }
    public static void menu() {
        System.out.println("___Меню___");
        System.out.println("1 - Создать пользователя");
        System.out.println("2 - Ввести данные о транзакции");

        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();
    }

    public static int customerTest(){
        for (int i = 0; i < operations.length; i++){
            int x = operations[i].getCustomerId();
//            if (statement[clientId][i] == 0) {
//
//            }
        }
        return rowNumber;
    }
}
