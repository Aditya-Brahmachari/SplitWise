package Controllers;

import Service.ExpenseService;

public class ExpenseController {
	
	ExpenseService expenseService;
	
	ExpenseController()
	{
		expenseService = new ExpenseService();
	}

}
