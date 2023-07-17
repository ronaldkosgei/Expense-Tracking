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
public class GoalDto {

    @Id
    private Long goalId;

    private String goalName;

    private double goalTarget;

    private String goalProgress;

    private String goalDescription;

    private String goalStartDate;

    private String goalEndDate;
}
