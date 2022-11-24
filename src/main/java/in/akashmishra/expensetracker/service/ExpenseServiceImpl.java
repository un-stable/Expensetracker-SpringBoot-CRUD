package in.akashmishra.expensetracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.akashmishra.expensetracker.model.Expense;
import in.akashmishra.expensetracker.repository.ExpenseRepository;

@Service
public class ExpenseServiceImpl implements ExpenseService {
	
	@Autowired
	ExpenseRepository expenseRepository;

	@Override
	public List<Expense> findAll() {
		// TODO Auto-generated method stub
		
	return	expenseRepository.findAll();
	
	}

	@Override
	public Expense saveExpense(Expense exp) {
		// TODO Auto-generated method stub
		return expenseRepository.save(exp);
	}

	@Override
	public Expense finById(Long id) {
		// TODO Auto-generated method stub
    if(expenseRepository.findById(id).isPresent()) {
    	return expenseRepository.findById(id).get();
    }
    return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
	Expense expense=finById(id);
	expenseRepository.delete(expense);
	
		
	}

}
