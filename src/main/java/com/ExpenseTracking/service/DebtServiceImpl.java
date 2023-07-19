package com.ExpenseTracking.service;

import com.ExpenseTracking.dto.DebtDto;
import com.ExpenseTracking.entity.Debt;
import com.ExpenseTracking.mapper.DebtMapper;
import com.ExpenseTracking.repository.DebtRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DebtServiceImpl implements DebtService{

    private final DebtRepository debtRepository;

    public DebtServiceImpl(DebtRepository debtRepository) {
        this.debtRepository = debtRepository;
    }

    @Override
    public Debt saveDebt(DebtDto debtDto) {
        Debt debt = DebtMapper.mapToDebt(debtDto);
        return debtRepository.save(debt);
    }

    @Override
    public Optional<DebtDto> getDebtById(Long debtId) {
        Optional<Debt> debt = debtRepository.findById(debtId);
        return debt.map(debt1 -> DebtMapper.mapToDebtDto(debt1));

    }

    @Override
    public DebtDto updateDebt(Long debtId, DebtDto debtDto) {
        Optional<Debt> debt = debtRepository.findById(debtId);

        if (debt.isPresent()) {
            Debt existingDebt = debt.get();

            existingDebt.setDebtName(debtDto.getDebtName());
            existingDebt.setDebtAmount(debtDto.getDebtAmount());
            existingDebt.setDebtAmount(debtDto.getDebtAmount());
            existingDebt.setVisualization(debtDto.getVisualization());
            existingDebt.setPayoffStrategy(debtDto.getPayoffStrategy());
            existingDebt.setDueDate(debtDto.getDueDate());

            Debt updatedDebt = debtRepository.save(existingDebt);
            return DebtMapper.mapToDebtDto(updatedDebt);
        } else {
            return null;
        }

    }

    @Override
    public Optional<Object> deleteDebt(Long debtId) {
        Optional<Debt> debt = debtRepository.findById(debtId);

        if (debt.isPresent()) {
            debtRepository.deleteById(debtId);
            return Optional.of("Debt cleared!!");
        } else {
            return Optional.empty();
        }

    }
}
