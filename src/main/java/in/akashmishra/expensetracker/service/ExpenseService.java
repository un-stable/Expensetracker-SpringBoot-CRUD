package in.akashmishra.expensetracker.service;


import java.util.List;

import in.akashmishra.expensetracker.model.Expense;

public interface ExpenseService {
	
List<Expense> findAll();

Expense saveExpense(Expense exp);
Expense finById(Long id);
void delete(Long id);

}
