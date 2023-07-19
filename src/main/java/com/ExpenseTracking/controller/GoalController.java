package com.ExpenseTracking.controller;


import com.ExpenseTracking.dto.GoalDto;
import com.ExpenseTracking.entity.Goal;
import com.ExpenseTracking.service.GoalService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/goal")
public class GoalController {

    private final GoalService goalService;

    public GoalController(GoalService goalService) {
        this.goalService = goalService;
    }

    @PostMapping("/create")
    public Goal saveGoal(@RequestBody GoalDto goalDto) {
        return goalService.saveGoal(goalDto);
    }

    @GetMapping("/get/{goalId}")
    public GoalDto getGoalById(@PathVariable Long goalId) {
        return goalService.getGoalById(goalId).orElse(null);
    }

    @PutMapping("/update/{goalId}")
    public GoalDto updateGoal(@PathVariable Long goalId, @RequestBody GoalDto goalDto) {
        return goalService.updateGoal(goalId, goalDto);
    }

    @DeleteMapping("/delete/{goalId}")
    public void deleteGoal(@PathVariable Long goalId) {
        goalService.deleteGoal(goalId);
    }


}
