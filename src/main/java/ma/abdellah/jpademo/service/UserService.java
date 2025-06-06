package ma.abdellah.jpademo.service;

import ma.abdellah.jpademo.entities.Role;
import ma.abdellah.jpademo.entities.User;

public interface UserService {
    User addNewUser(User user);
    Role addNewRole(Role role);
    User findUserByUserName(String userName);
    Role findRoleByRoleName(String roleName);
    void addRoleToUser(String userName,String roleName);
    User authenticate(String userName,String password);
}
