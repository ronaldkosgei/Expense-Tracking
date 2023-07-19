package com.ExpenseTracking.service;

import com.ExpenseTracking.dto.DebtDto;
import com.ExpenseTracking.entity.Debt;

import java.util.Optional;

public interface DebtService {

    public Debt saveDebt(DebtDto debtDto);

    public Optional<DebtDto> getDebtById(Long debtId);

    public DebtDto updateDebt(Long debtId, DebtDto debtDto);

    public Optional<Object> deleteDebt(Long debtId);

}
