package Respository;

import Model.User;
import java.util.*;
//singleton 
public class UserRespositoryImpl implements UserRepository {
    private List<User> userDb; 
    private   static UserRespositoryImpl repository=null;
	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		User newUser = new User(user.getName(),user.getEmail());
		userDb.add(newUser);
		return newUser;
	}
	
	private UserRespositoryImpl()
	{
		userDb = new ArrayList<>();
	}
	public static UserRespositoryImpl getInstance() {
		// TODO Auto-generated method stub
		if(repository==null)
			repository = new UserRespositoryImpl();
		return repository;
	}

}
