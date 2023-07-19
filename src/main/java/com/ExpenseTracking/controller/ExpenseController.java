package com.ExpenseTracking.controller;

import com.ExpenseTracking.dto.ExpenseDto;
import com.ExpenseTracking.entity.Expense;
import com.ExpenseTracking.service.ExpenseService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/expense")
public class ExpenseController {

    private final ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @PostMapping("/add")
    public Expense saveExpense(@RequestBody ExpenseDto expenseDto) {
        return expenseService.saveExpense(expenseDto);
    }

    @GetMapping("get/{expenseId}")
    public Optional<ExpenseDto> getExpenseById(@PathVariable Long expenseId) {
        return expenseService.getExpenseById(expenseId);
    }

    @PutMapping("/update/{expenseId}")
    public ExpenseDto updateExpense(@RequestBody ExpenseDto expenseDto, @PathVariable Long expenseId) {
        return expenseService.updateExpense(expenseDto, expenseId);
    }

    @DeleteMapping("/delete/{expenseId}")
    public Optional<Object> deleteExpense(@PathVariable Long expenseId) {
        return expenseService.deleteExpense(expenseId);
    }
}
