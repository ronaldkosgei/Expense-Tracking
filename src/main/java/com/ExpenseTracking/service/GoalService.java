package com.ExpenseTracking.service;

import com.ExpenseTracking.dto.GoalDto;
import com.ExpenseTracking.entity.Goal;

import java.util.Optional;

public interface GoalService {

    public Goal saveGoal(GoalDto goalDto);

    public Optional<GoalDto> getGoalById(Long goalId);

    public GoalDto updateGoal(Long goalId, GoalDto goalDto);

    public void deleteGoal(Long goalId);
}
