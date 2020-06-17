package Respository;

import Model.Expense;
import java.util.*;

public class ExpenseRepositoryImpl implements ExpenseRepository {

	List<Expense> expenseDb;
	private static ExpenseRepositoryImpl expenseRepository = null;
	private ExpenseRepositoryImpl()
	{
		expenseDb = new ArrayList<>();
	}
	
	public ExpenseRepositoryImpl getInstance()
	{
		if(expenseRepository==null)
			expenseRepository = new ExpenseRepositoryImpl();
		return expenseRepository;
	}
	@Override
	public Expense createExpense(Expense expense) {
		// TODO Auto-generated method stub
		return null;
	}

}
