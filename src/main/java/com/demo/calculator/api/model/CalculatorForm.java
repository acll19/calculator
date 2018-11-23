package com.test.calculator.api.model;

import javax.validation.constraints.NotNull;

public class CalculatorForm {

    @NotNull
    private Long a;

    @NotNull
    private Long b;

    @NotNull
    private int operation;

    private Long result;

    public int getOperation() {
        return operation;
    }

    public void setOperation(int operation) {
        this.operation = operation;
    }

    public Long getResult() {
        return result;
    }

    public void setResult(Long result) {
        this.result = result;
    }

    public Long getA() {
        return a;
    }

    public void setA(Long a) {
        this.a = a;
    }

    public Long getB() {
        return b;
    }

    public void setB(Long b) {
        this.b = b;
    }

}
