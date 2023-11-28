package com.asma.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import com.asma.users.entities.Role;
import com.asma.users.entities.User;
import com.asma.users.service.UserService;
import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class UsersMicroservice1Application {

	
	 @Autowired
		UserService userService;
	 
	public static void main(String[] args) {
		SpringApplication.run(UsersMicroservice1Application.class, args);
	}

	
	 /* @PostConstruct
		void init_users() {
			//ajouter les rôles
			userService.addRole(new Role(null,"ADMIN"));
			userService.addRole(new Role(null,"USER"));
			
			//ajouter les users
			userService.saveUser(new User(null,"admin","admin",true,null));
			userService.saveUser(new User(null,"asma","123456789",true,null));
			userService.saveUser(new User(null,"amal","123456789",true,null));
			
			//ajouter les rôles aux users
			userService.addRoleToUser("admin", "ADMIN");
			userService.addRoleToUser("admin", "USER");
			
			userService.addRoleToUser("asma", "USER");
			userService.addRoleToUser("amal", "USER");		
		}  */
	    
	    @Bean
		BCryptPasswordEncoder getBCE() {
			return new BCryptPasswordEncoder();
		}

}
