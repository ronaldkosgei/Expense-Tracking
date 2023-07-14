package com.ExpenseTracking.dto;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ExpenseDto {


    @Id
    private int expenseId;

    private String expenseName;

    private double expenseAmount;

    private String expenseDate;

    private String expenseCategory;
}
