package com.demo.calculator.Service;

import com.demo.calculator.api.model.CalculatorForm;
import com.demo.calculator.api.service.OperationInterface;
import com.demo.calculator.services.OperationService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
public class OperationServiceTests {

    @TestConfiguration
    static class EmployeeServiceImplTestContextConfiguration {

        @Bean
        public OperationInterface operationInterface() {
            return new OperationService();
        }
    }

    @Autowired
    private OperationInterface operationInterface;

    @Test
    public void shouldAddTwoNumbersWhenOperationIs1(){
        CalculatorForm calculatorForm = new CalculatorForm();
        calculatorForm.setA(1L);
        calculatorForm.setB(1L);
        calculatorForm.setOperation(1);

        Long result = operationInterface.calculate(calculatorForm);
        Long expected = 2L;

        assertEquals(expected, result);
    }

    @Test
    public void shouldSubtractTwoNumbersWhenOperationIs2(){
        CalculatorForm calculatorForm = new CalculatorForm();
        calculatorForm.setA(1L);
        calculatorForm.setB(1L);
        calculatorForm.setOperation(2);

        Long result = operationInterface.calculate(calculatorForm);
        Long expected = 0L;

        assertEquals(expected, result);
    }

    @Test
    public void shouldMultiplyTwoNumbersWhenOperationIs3(){
        CalculatorForm calculatorForm = new CalculatorForm();
        calculatorForm.setA(2L);
        calculatorForm.setB(2L);
        calculatorForm.setOperation(3);

        Long result = operationInterface.calculate(calculatorForm);
        Long expected = 4L;

        assertEquals(expected, result);
    }

    @Test
    public void shouldDivideTwoNumbersWhenOperationIs4(){
        CalculatorForm calculatorForm = new CalculatorForm();
        calculatorForm.setA(4L);
        calculatorForm.setB(2L);
        calculatorForm.setOperation(4);

        Long result = operationInterface.calculate(calculatorForm);
        Long expected = 2L;

        assertEquals(expected, result);
    }
}
