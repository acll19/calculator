package com.demo.calculator.services;

import com.demo.calculator.api.model.CalculatorForm;
import com.demo.calculator.api.service.OperationInterface;
import com.demo.calculator.enums.OperationEnum;
import org.springframework.stereotype.Service;

@Service
public class OperationService implements OperationInterface {

    private String operation;

    private Long add(Long a, Long b, boolean add) {
        return add ? (a + b) : (a - b);
    }

    private Long multiplication(Long a, Long b) {
        return (a * b);
    }

    private Long divide(Long a, Long b){
        return (a / b);
    }

    @Override
    public Long calculate(CalculatorForm calculatorForm) {
        if(OperationEnum.add.getOperationCode() == calculatorForm.getOperation()){
            return add(calculatorForm.getA(), calculatorForm.getB(), true);
        } else if (OperationEnum.substrac.getOperationCode() == calculatorForm.getOperation()){
            return add(calculatorForm.getA(), calculatorForm.getB(), false);
        } else if (OperationEnum.multiplication.getOperationCode() == calculatorForm.getOperation()){
            return multiplication(calculatorForm.getA(), calculatorForm.getB());
        } else if (OperationEnum.division.getOperationCode() == calculatorForm.getOperation()){
            return divide(calculatorForm.getA(), calculatorForm.getB());
        }
        return 0L;
    }

}
