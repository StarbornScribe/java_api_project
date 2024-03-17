package ru.netology.gutuev;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Operation[] operations;
    private static Customer[] customers;
    private static int[][] statement;
    public static int input;

    public static void main(String[] args) {
        operations = new Operation[2];
        customers = new Customer[2];
        statement = new int[2][];

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
                // МОЖНО СМЕНИТЬ ЦИКЛЫ НА СЧЁТЧИК И ОБРАЩЕНИЕ К ИНДЕКСУ МАССИВА ПО ЗНАЧЕНИЮ СЧЁТЧИКА
                for (int i = 0; i < operations.length; i++) {
                    if (operations[i] == null) {
                        operations[i] = new Operation();
                        operations[i].transaction_data();       // вызываем метод создания транзакции
                        int clientId = operations[i].getClientId();      // получаем id клиента, чтобы положить в индекс массива statement
                        for (int j = 1; j<operations.length; j++){
                            if (statement[clientId] == null) {
                                statement[clientId] = new int[operations.length];
                                statement[clientId][0] = i;
                            } else if (statement[clientId][j] == 0) {
                                statement[clientId][j] = i;
                            }
                        }
                    } else {
                        continue;
                    } break;        // Завершает цикл for когда ввели данные по operations[i]
                }
            } else {
                getOperations(0);
            }
        }
    }
    public static void menu() {
        System.out.println("___Меню___");
        System.out.println("1 - Создать пользователя");
        System.out.println("2 - Ввести данные о транзакции");

        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();
    }

    public static Operation[] getOperations(int clientId) {
        int[] operationId = new int[statement[clientId].length];
        for (int i = 0; i<statement[clientId].length; i++) {
            operationId[i] = statement[clientId][i];
        }
        Operation[] clientOperations = new Operation[statement[clientId].length];
        for (int i = 0; i<clientOperations.length; i++){
            clientOperations[i] = operations[operationId[i]];
        }
        System.out.println(Arrays.deepToString(clientOperations));
        return clientOperations;
    }
}
