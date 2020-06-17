package Controllers;

import Model.User;
import Service.UserService;

public class UserController {
   private  UserService userService;
 
	public UserController() {
		// TODO Auto-generated constructor stub
	   userService = new UserService();   
	}
   
   public User createUser(User user)
   {
	   return userService.createUser(user);
   }
     
     
}
