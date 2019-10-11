package mod.users.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mod.users.model.Users;
import mod.users.service.UsersService;

@RestController
@CrossOrigin("*")
@RequestMapping("/harish")

public class UsersController {
	@Autowired
	UsersService usersService;
//	@Autowired
//	Users users;
	@GetMapping("")
	public List<Users> getUsers()
	{
		return usersService.getAllUsers();
	}
	@GetMapping("/{id}")
	public Optional<Users> getUserById(@PathVariable Long id) {
		return usersService.getUserById(id);
	}
	@PostMapping("")
	public void saveUser(@RequestBody Users users)
	{
		usersService.saveUsers(users);
	}
	@GetMapping(value="/harish")
	public String hai()
	{
		return "helloooo";
	}
	@PutMapping()
	public Users updateUser(@RequestBody Users user) {
		return usersService.updateUser(user);
	}
	
	@DeleteMapping("/{id}")
	public String  deleteUser(@PathVariable Long id) {
		 usersService.deleteUser(id);
		 return "Deleted Sucessfully";
	}
//	@PostMapping("/{userName}/{password}")
//	public String getAdmin(@RequestBody String userName,String password)
//	{
//		if(users.getUserName()=="Harish" && users.getPassword()=="Harish@123")
//		{
//			return "Success";
//		}
//		return "success";
//	}
	@PutMapping("/add")
	public List<Users> addActiveUser(@RequestBody Users users)
	{
		if(!users.isActive())
			users.setActive(true);
		else
			users.setActive(false);
		usersService.updateUser(users);
		return usersService.getAllUsers();
		
	}
	   @GetMapping(path="/{userName}/{password}/user")
	     public Users authenticateuser(@PathVariable("userName") String userName,@PathVariable("password") String password)
	     {
	    return (Users) usersService.AuthenticateUser(userName,password);
	     }
	     @GetMapping(path="/{userName}/{password}/admin")
	     public Users authenticateadmin(@PathVariable("userName") String userName,@PathVariable("password") String password)
	     {
	    return (Users) usersService.AuthenticateAdmin(userName,password);
	     }
	     @GetMapping(path="/{userName}/{password}/mentor")
	     public Users authenticatementor(@PathVariable("userName") String userName,@PathVariable("password") String password)
	     {
	    return (Users) usersService.AuthenticateMentor(userName,password);
	     }
}
