package com.ExpenseTracking.mapper;

import com.ExpenseTracking.dto.ExpenseDto;
import com.ExpenseTracking.entity.Expense;

public class ExpenseMapper {

    public static ExpenseDto mapToExpenseDto(Expense expense){
        ExpenseDto expenseDto = new ExpenseDto();
        expenseDto.setExpenseId(expense.getExpenseId());
        expenseDto.setExpenseName(expense.getExpenseName());
        expenseDto.setExpenseAmount(expense.getExpenseAmount());
        expenseDto.setExpenseDate(expense.getExpenseDate());
        expenseDto.setExpenseCategory(expense.getExpenseCategory());


        return expenseDto;
    }

    public static Expense mapToExpense(ExpenseDto expenseDto){
        Expense expense = new Expense();
        expense.setExpenseId(expenseDto.getExpenseId());
        expense.setExpenseName(expenseDto.getExpenseName());
        expense.setExpenseAmount(expenseDto.getExpenseAmount());
        expense.setExpenseDate(expenseDto.getExpenseDate());
        expense.setExpenseCategory(expenseDto.getExpenseCategory());


        return expense;
    }
}
