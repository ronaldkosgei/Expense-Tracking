package com.ExpenseTracking.dto;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DebtDto {

    @Id
    private Long debtId;

    private String debtName;

    private double debtAmount;

    private String visualization;

    private String payoffStrategy;

    private String dueDate;
}
