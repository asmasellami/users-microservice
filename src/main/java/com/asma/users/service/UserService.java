package com.asma.users.service;

import java.util.List;


import com.asma.users.entities.Role;
import com.asma.users.entities.User;

public interface UserService {
User saveUser(User user);
User findUserByUsername (String username);
Role addRole(Role role);
User addRoleToUser(String username, String rolename);
List <User> findAllUsers();
}
