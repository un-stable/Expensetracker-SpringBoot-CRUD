package in.akashmishra.expensetracker.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

//for table name if we want to keep name as expense keep it just @Table

@Entity
@Table(name="tbl_expenses")
@Setter
@Getter
public class Expense {
	@Id //for p key for column name with different name use column annotation
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String expense;
	private String Description;
	private BigDecimal amount;
	
	
	

}
