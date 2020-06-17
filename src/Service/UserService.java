package Service;

import Model.User;
import Respository.UserRepository;
import Respository.UserRespositoryImpl;

public class UserService {
            
	UserRepository userRepository;
	
	public UserService()
	{
		userRepository = UserRespositoryImpl.getInstance();
	}
	
	public User createUser(User user)
	{
		return userRepository.createUser(user);
	}
	
}
