package com.ExpenseTracking.mapper;

import com.ExpenseTracking.dto.GoalDto;
import com.ExpenseTracking.entity.Goal;

public class GoalMapper {

    public static Goal mapToGoal(GoalDto goalDto){
        Goal goal = new Goal();
        goal.setGoalId(goalDto.getGoalId());
        goal.setGoalName(goalDto.getGoalName());
        goal.setGoalTarget(goalDto.getGoalTarget());
        goal.setGoalProgress(goalDto.getGoalProgress());
        goal.setGoalDescription(goalDto.getGoalDescription());
        goal.setGoalStartDate(goalDto.getGoalStartDate());
        goal.setGoalEndDate(goalDto.getGoalEndDate());

        return goal;
    }

    public static GoalDto mapToGoalDto(Goal goal){
        GoalDto goalDto = new GoalDto();
        goalDto.setGoalId(goal.getGoalId());
        goalDto.setGoalName(goal.getGoalName());
        goalDto.setGoalTarget(goal.getGoalTarget());
        goalDto.setGoalProgress(goal.getGoalProgress());
        goalDto.setGoalDescription(goal.getGoalDescription());
        goalDto.setGoalStartDate(goal.getGoalStartDate());
        goalDto.setGoalEndDate(goal.getGoalEndDate());

        return goalDto;
    }
}
