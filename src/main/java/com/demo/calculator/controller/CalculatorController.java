package com.demo.calculator.controller;

import com.demo.calculator.api.model.CalculatorForm;
import com.demo.calculator.api.service.OperationInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Controller
public class CalculatorController {

    @Autowired
    private OperationInterface operationInterface;

    @GetMapping("/")
    public String getNewAccount(Model model) {
        model.addAttribute("calculatorForm", new CalculatorForm());
        return "calculator";
    }

    @PostMapping("/")
    public String setOperation(@ModelAttribute @Validated CalculatorForm calculatorForm, Model model) {
        calculatorForm.setOperation(1);
        calculatorForm.setResult(operationInterface.calculate(calculatorForm));
        System.out.println(calculatorForm.getResult());
        model.addAttribute("calculatorForm", new CalculatorForm());
        return "calculator";
    }



}
