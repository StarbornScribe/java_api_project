package ru.netology.gutuev;

public class CustomerOperationOutOfBoundException extends OperationRuntimeException {
    public static final String MESSAGE = "Exception while trying to save operation %s for customer %s";
    private int customerId;
    private int operationId;

    public CustomerOperationOutOfBoundException(int customerId, int operationId) {
        super(MESSAGE);
        this.customerId = customerId;
        this.operationId = operationId;
    }

    @Override
    public String getMessage() {
        return MESSAGE.formatted(operationId, customerId);
    }
}