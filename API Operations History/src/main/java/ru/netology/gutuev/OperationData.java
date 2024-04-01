package ru.netology.gutuev;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.file.Files;

public class OperationData implements Serializable {

    private Operation[] operations;
    private Customer[] customers;
    private int[][] statement;
    private int arraysLength;
    private int transactions_counter;


    public OperationData(Operation[] operations, Customer[] customers, int[][] statement, int arraysLength, int transactions_counter) {
        this.operations = operations;
        this.customers = customers;
        this.statement = statement;
        this.arraysLength = arraysLength;
        this.transactions_counter = transactions_counter;
    }

    public Operation[] getOperations() {
        return operations;
    }
}
