package com.academy.service.impl;

import com.academy.dto.UserDto;
import com.academy.model.entity.Role;
import com.academy.model.entity.User;
import com.academy.model.repository.UserRepository;
import com.academy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private  UserRepository userRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public User registerNewUserAccount(UserDto accountDto) throws UsernameNotFoundException {


        if (accountDto.equals(userRepository.findByUsername(accountDto.getUserName()))) {
            throw new UsernameNotFoundException
                    ("There is an account: " + accountDto.getUserName());
       }
        User user = new User();

        user.setUsername(accountDto.getUserName());
        user.setPassword(bCryptPasswordEncoder.encode(accountDto.getPassword()));

        user.setRoles(Arrays.asList(Role.valueOf("ROLE_USER")));
        return user;
    }

    @Override
    public UserDto findById(Integer id) {
        return null;
    }

    @Override
    public void save(UserDto userDto) {

    }

    @Override
    public List<UserDto> findByUserId(Integer id) {
        return null;
    }

    @Override
    public List<UserDto> findCompletedUser(Integer id) {
        return null;
    }

    @Override
    public List<UserDto> findNotCompletedUser(Integer id) {
        return null;
    }

    @Override
    public void deleteUser(Integer id) {

    }
}
