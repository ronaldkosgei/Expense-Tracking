package com.ExpenseTracking.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_expense")
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "expense_id")
    private int expenseId;

    @Column(name = "expense_name")
    private String expenseName;

    @Column(name = "expense_amount")
    private double expenseAmount;

    @Column(name = "expense_date")
    private String expenseDate;

    @Column(name = "expense_category")
    private String expenseCategory;

}
