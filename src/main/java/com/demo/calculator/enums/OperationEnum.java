package com.demo.calculator.enums;

public enum OperationEnum {
    add  (1),
    substrac (2),
    multiplication (3),
    division (4);

    private final int operationCode;

    OperationEnum(int operationCode) {
        this.operationCode = operationCode;
    }

    public int getOperationCode() {
        return this.operationCode;
    }

}