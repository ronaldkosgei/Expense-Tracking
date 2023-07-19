package com.ExpenseTracking.service;

import com.ExpenseTracking.dto.ExpenseDto;
import com.ExpenseTracking.entity.Expense;

import java.util.Optional;

public interface ExpenseService {

    public Expense saveExpense(ExpenseDto expenseDto);

    public Optional<ExpenseDto> getExpenseById(Long id);

    public ExpenseDto updateExpense(ExpenseDto expenseDto, Long id);

    public Optional<Object> deleteExpense(Long id);
}
