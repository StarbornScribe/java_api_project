package ru.netology.gutuev;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    private static Operation[] operations;
    private static Customer[] customers;
    private static int[][] statement;
    public static int input;
    static int arraysLength = 2;
    protected static int transactions_counter = 0;
    static Path data = Paths.get("C:\\Users\\Denis\\java_transactions\\save.ser");

    public static void main(String[] args) {
        operations = new Operation[arraysLength];
        customers = new Customer[arraysLength];
        statement = new int[arraysLength][];

        try (OutputStream fileOutputStream = Files.newOutputStream(data)) {
            OperationData operationData = new OperationData(operations, customers, statement, arraysLength, transactions_counter);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(operationData);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (InputStream fileInputStream = Files.newInputStream(data)) {
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            OperationData operationData = (OperationData) objectInputStream.readObject();

            System.out.println(operationData);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


        while(true){
            menu();
            if (input == 1) {
                create_customer();
            } else if(input == 2) {
                create_operation2();
            } else if(input == 3) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите ID нужной транзакции: ");
                int id = scanner.nextInt();
                operations[id].print();
            } else if (input == 4) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите ID пользователя: ");
                int id = scanner.nextInt();
                getOperations(id);
            } else {
                getOperations(0);
            }
        }


    }
    public static void menu() {
        System.out.println("___Меню___");
        System.out.println("1 - Создать пользователя");
        System.out.println("2 - Ввести данные о транзакции");
        System.out.println("3 - Получить данные о транзакции в консоль");
        System.out.println("4 - Получить информацию об операциях клиента");

        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();
    }

    // Создание операции для клиента
    public static void create_operation2() {
        transactions_counter += 1;
        operations[transactions_counter] = new Operation();
            operations[transactions_counter].transaction_data();
            int clientId = operations[transactions_counter].getClientId();
            if (statement[clientId] == null) {
                statement[clientId] = new int[arraysLength];
                statement[clientId][0] = transactions_counter;
            } else {
                for (int i: statement[clientId]) {
                    if (statement[clientId][i] == 0) {
                        statement[clientId][i] = transactions_counter;
                    }
                }
            }
    }

    // Создание пользователя
    public static void create_customer() {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] != null) {
                continue;
            } else {
                customers[i] = new Customer();
                customers[i].customerRegistration(); // Вызываем метод создания пользователя из класса Customer
                System.out.println("Создан пользователь " + customers[i].getCustomerName() + " | " + customers[i].getCustomerAge() + " лет | ID: " + i);
            } break;
        }
    }


    // Выводит информацию по операциям клиента в консоль
    public static Operation[] getOperations(int clientId) {
        int[] operationId = new int[statement[clientId].length];
        for (int i = 0; i<statement[clientId].length; i++) {
            operationId[i] = statement[clientId][i];
            System.out.println(operationId[i]);
        }
        Operation[] clientOperations = new Operation[statement[clientId].length];
        for (int i = 0; i<clientOperations.length; i++) {
            clientOperations[i] = operations[operationId[i]];       // Получаем в clientOperations[] данные об i-той транзакции
            clientOperations[i].print();
        }
        return clientOperations;
    }
}
