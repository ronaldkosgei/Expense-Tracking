package com.ExpenseTracking.service;

import com.ExpenseTracking.dto.ExpenseDto;
import com.ExpenseTracking.entity.Expense;
import com.ExpenseTracking.mapper.ExpenseMapper;
import com.ExpenseTracking.repository.ExpenseRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ExpenseServiceImpl implements ExpenseService{

    private final ExpenseRepository expenseRepository;

    public ExpenseServiceImpl(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    @Override
    public Expense saveExpense(ExpenseDto expenseDto) {
        Expense expense = ExpenseMapper.mapToExpense(expenseDto);
        return expenseRepository.save(expense);
    }

    @Override
    public Optional<ExpenseDto> getExpenseById(Long id) {
        Optional<Expense> expense = expenseRepository.findById(id);
        return expense.map(expense1 -> ExpenseMapper.mapToExpenseDto(expense1));
    }

    @Override
    public ExpenseDto updateExpense(ExpenseDto expenseDto, Long id) {
        Optional<Expense> expense = expenseRepository.findById(id);

        if (expense.isPresent()) {
            Expense existingExpense = expense.get();

            existingExpense.setExpenseName(expenseDto.getExpenseName());
            existingExpense.setExpenseAmount(expenseDto.getExpenseAmount());
            existingExpense.setExpenseDate(expenseDto.getExpenseDate());
            existingExpense.setExpenseCategory(expenseDto.getExpenseCategory());

            Expense updatedExpense = expenseRepository.save(existingExpense);
            return ExpenseMapper.mapToExpenseDto(updatedExpense);
        }
        return null;
    }

    @Override
    public Optional<Object> deleteExpense(Long id) {
        Optional<Expense> expense = expenseRepository.findById(id);
        if (expense.isPresent()) {
            expenseRepository.deleteById(id);
            return Optional.of("Expense Deleted Successfully");
        }
        return Optional.empty();
    }
}
