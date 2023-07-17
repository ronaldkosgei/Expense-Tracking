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
@Table(name = "tbl_goal")
public class Goal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "goal_id")
    private Long goalId;

    @Column(name = "goal_name", nullable = false, unique = true)
    private String goalName;

    @Column(name = "goal_target", nullable = false)
    private double goalTarget;

    @Column(name = "goal_progress")
    private String goalProgress;

    @Column(name = "goal_description")
    private String goalDescription;

    @Column(name = "goal_start_date", nullable = false)
    private String goalStartDate;

    @Column(name = "goal_end_date")
    private String goalEndDate;
}
