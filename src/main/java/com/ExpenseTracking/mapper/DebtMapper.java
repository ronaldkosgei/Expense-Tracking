package com.ExpenseTracking.mapper;

import com.ExpenseTracking.dto.DebtDto;
import com.ExpenseTracking.entity.Debt;

public class DebtMapper {

    public static Debt mapToDebt(DebtDto debtDto){
        Debt debt = new Debt();
        debt.setDebtId(debtDto.getDebtId());
        debt.setDebtName(debtDto.getDebtName());
        debt.setDebtAmount(debtDto.getDebtAmount());
        debt.setVisualization(debtDto.getVisualization());
        debt.setPayoffStrategy(debtDto.getPayoffStrategy());
        debt.setDueDate(debtDto.getDueDate());

        return debt;
    }

    public static DebtDto mapToDebtDto(Debt debt){
        DebtDto debtDto = new DebtDto();
        debtDto.setDebtId(debt.getDebtId());
        debtDto.setDebtName(debt.getDebtName());
        debtDto.setDebtAmount(debt.getDebtAmount());
        debtDto.setVisualization(debt.getVisualization());
        debtDto.setPayoffStrategy(debt.getPayoffStrategy());
        debtDto.setDueDate(debt.getDueDate());

        return debtDto;
    }
}
