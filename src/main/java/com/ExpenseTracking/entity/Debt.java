package com.ExpenseTracking.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_debt")
public class Debt {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "debt_id")
    private Long debtId;

    @Column(name = "debt_name", nullable = false, unique = true)
    private String debtName;

    @Column(name = "debt_amount", nullable = false)
    private double debtAmount;

    @Column(name = "visualization")
    private String visualization;

    @Column(name = "payoff_strategy")
    private String payoffStrategy;

    @Column(name = "due_date", nullable = false)
    private String dueDate;
}
