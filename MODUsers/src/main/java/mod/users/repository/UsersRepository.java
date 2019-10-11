package mod.users.repository;

import org.springframework.data.repository.CrudRepository;

//import java.util.List;


import mod.users.model.Users;

public interface UsersRepository extends CrudRepository<Users, Long>{
//		List<Users> findByUserName(String userName);

		Users findByUserName(String userName);

		//List<Users> findAdmin(String userName, String password);

	
}
