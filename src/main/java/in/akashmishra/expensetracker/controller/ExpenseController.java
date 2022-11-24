
package in.akashmishra.expensetracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.akashmishra.expensetracker.model.Expense;
import in.akashmishra.expensetracker.service.ExpenseService;

@RestController
@RequestMapping("/api")
public class ExpenseController {
	
	@Autowired
	ExpenseService expenseService;
	
	
	@GetMapping("/expenses")
	public ResponseEntity<List<Expense>> getAllExpense(){
		
		List<Expense> expenses=expenseService.findAll();
		System.out.println(expenses);
		return new ResponseEntity<List<Expense>>(expenses,HttpStatus.OK);
		}
	
	@PostMapping("/expenses")
	public ResponseEntity<Expense> saveExpense(@RequestBody Expense expense ){
		
		
		Expense exp=this.expenseService.saveExpense(expense);
		return new ResponseEntity<Expense>(exp,HttpStatus.OK);
	}
	
	@GetMapping("/expenses/{id}")
	public ResponseEntity<Expense> get(@PathVariable("id") Long id){
		
		Expense expenses=expenseService.finById(id);
		//System.out.println(expenses);
		return new ResponseEntity<Expense>(expenses,HttpStatus.OK);
		}
	
	@DeleteMapping("/expenses/{id}")
	public ResponseEntity<String> delete(@PathVariable("id")Long id){
		
		     expenseService.delete(id);
		     
		return new ResponseEntity<String>("expense Deleted",HttpStatus.OK);
	}
		
		
	}


