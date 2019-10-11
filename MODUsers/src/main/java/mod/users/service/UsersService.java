package mod.users.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mod.users.model.Users;
import mod.users.repository.UsersRepository;

@Service
@Transactional
public class UsersService {
	
	@Autowired
	UsersRepository usersRepository;
	
	
	public List<Users> getAllUsers()
	{
		return (List<Users>) usersRepository.findAll();
	}
	
	public void saveUsers(Users users)
	{
		usersRepository.save(users);
	}
	public Optional<Users> getUserById(Long id) {
		return usersRepository.findById(id);
	}
	public Users updateUser(Users user) {
		return usersRepository.save(user);
	}
//	public void getAdmin(String userName,String password)
//	{
//		 usersRepository.findAdmin(userName,password);
//		
//	}
	
	public void deleteUser(Long id) {
		usersRepository.deleteById(id);
	}

	public Users AuthenticateUser(String userName, String password) {
		if(usersRepository.findByUserName(userName)==null)
			return null;
		if(usersRepository.findByUserName(userName).getRole().equals("user"))
		{
		
		

		if(usersRepository.findByUserName(userName).getPassword().equals(password))
		{
		return usersRepository.findByUserName(userName);
		}
		else
		return null;
		}
		
		else
		return null;
	
	}

	public Users AuthenticateAdmin(String userName, String password) {
		if(usersRepository.findByUserName(userName)==null)
			return null;
		if(usersRepository.findByUserName(userName).getRole().equals("admin"))
		{
		
		

		if(usersRepository.findByUserName(userName).getPassword().equals(password))
		{
		return usersRepository.findByUserName(userName);
		}
		else
		return null;
		}
		
		else
		return null;
		
	}

	public Users AuthenticateMentor(String userName, String password) {
		if(usersRepository.findByUserName(userName)==null)
			return null;
		if(usersRepository.findByUserName(userName).getRole().equals("mentor"))
		{
		
	
		

		if(usersRepository.findByUserName(userName).getPassword().equals(password))
		{
		return usersRepository.findByUserName(userName);
		}
		else
		return null;
		}
		
		else
		return null;
		
	}


	
}
