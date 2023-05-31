package com.academy.service;


import com.academy.dto.UserDto;
import com.academy.model.entity.User;

import java.security.Principal;
import java.util.List;

public interface UserService {
    UserDto findById(Integer id);

    void save(UserDto userDto);
    void save(User user);
    List<UserDto> findByUserId(Integer id);

    List<UserDto> findCompletedUser(Integer id);

    List<UserDto> findNotCompletedUser(Integer id);

    void deleteUser (Integer id);

     User registerNewUserAccount(UserDto accountDto);

     boolean saveUser(User user);

     Integer findUserIdSession();


}
