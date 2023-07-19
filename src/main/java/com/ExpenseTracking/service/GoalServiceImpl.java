package com.ExpenseTracking.service;

import com.ExpenseTracking.dto.GoalDto;
import com.ExpenseTracking.entity.Goal;
import com.ExpenseTracking.mapper.GoalMapper;
import com.ExpenseTracking.repository.GoalRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GoalServiceImpl implements GoalService{

    private final GoalRepository goalRepository;

    public GoalServiceImpl(GoalRepository goalRepository) {
        this.goalRepository = goalRepository;
    }


    @Override
    public Goal saveGoal(GoalDto goalDto) {
        Goal goal = GoalMapper.mapToGoal(goalDto);
        return goalRepository.save(goal);
    }

    @Override
    public Optional<GoalDto> getGoalById(Long goalId) {
        Optional<Goal> goal = goalRepository.findById(goalId);
        return goal.map(goal1 -> GoalMapper.mapToGoalDto(goal1));
    }

    @Override
    public GoalDto updateGoal(Long goalId, GoalDto goalDto) {
        Optional<Goal> goal = goalRepository.findById(goalId);

        if (goal.isPresent()) {
            Goal existingGoal = goal.get();

            existingGoal.setGoalName(goalDto.getGoalName());
            existingGoal.setGoalTarget(goalDto.getGoalTarget());
            existingGoal.setGoalProgress(goalDto.getGoalProgress());
            existingGoal.setGoalDescription(goalDto.getGoalDescription());
            existingGoal.setGoalStartDate(goalDto.getGoalStartDate());
            existingGoal.setGoalEndDate(goalDto.getGoalEndDate());

            Goal updatedGoal = goalRepository.save(existingGoal);
            return GoalMapper.mapToGoalDto(updatedGoal);
        } else {
            return null;
        }
    }

    @Override
    public void deleteGoal(Long goalId) {
     Optional<Goal> goal = goalRepository.findById(goalId);

        if(goal.isPresent()){
            goalRepository.deleteById(goalId);
        }else {
            System.out.println("Goal not found");
        }

    }
}
