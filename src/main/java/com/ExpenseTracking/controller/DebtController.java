package com.ExpenseTracking.controller;

import com.ExpenseTracking.dto.DebtDto;
import com.ExpenseTracking.entity.Debt;
import com.ExpenseTracking.service.DebtService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/debt")
public class DebtController {

    private final DebtService debtService;

    public DebtController(DebtService debtService) {
        this.debtService = debtService;
    }

    @PostMapping("/add")
    public Debt saveDebt(@RequestBody DebtDto debtDto) {
        return debtService.saveDebt(debtDto);
    }

    @GetMapping("/get/{debtId}")
    public Optional<DebtDto> getDebtById(@PathVariable Long debtId) {
        return debtService.getDebtById(debtId);
    }

    @PutMapping("/update/{debtId}")
    public DebtDto updateDebt(@PathVariable Long debtId, @RequestBody DebtDto debtDto) {
        return debtService.updateDebt(debtId, debtDto);
    }

    @DeleteMapping("/delete/{debtId}")
    public Optional<Object> deleteDebt(@PathVariable Long debtId) {
        return debtService.deleteDebt(debtId);
    }
}
