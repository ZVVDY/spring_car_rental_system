package com.academy.service.impl;

import com.academy.dto.UserDto;
import com.academy.mapper.UserMapper;
import com.academy.model.entity.Role;
import com.academy.model.entity.User;
import com.academy.model.repository.PersonRepository;
import com.academy.model.repository.UserRepository;
import com.academy.service.UserService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
@Data
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PersonRepository personRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    private final UserMapper userMapper;

    @Override
    public User registerNewUserAccount(UserDto accountDto) throws UsernameNotFoundException {


        if (accountDto.equals(userRepository.findByUsername(accountDto.getUsername()))) {
            throw new UsernameNotFoundException
                    ("There is an account: " + accountDto.getUsername());
        }
        User user = new User();

        user.setUsername(accountDto.getUsername());
        user.setPassword(bCryptPasswordEncoder.encode(accountDto.getPassword()));

        user.setRoles(Arrays.asList(Role.valueOf("ROLE_USER")));
        return user;
    }

    @Override
    public UserDto findById(Integer id) {
        return null;
    }


    @Transactional
    @Override
    public void save(UserDto userDto) {

//        UserDetails userRegistration = userRepository.findByUsername(userDto.getUsername());
//
//        if (userRegistration == null || userRegistration.isEnabled() || userRegistration.isAccountNonLocked()) {
//            throw new UsernameNotFoundException("There is an account: " + userDto.getUsername());
//        }
        userDto.setEnabled(true);
        userDto.setAccountNonExpired(true);
        userDto.setCredentialsNonExpired(true);
        userDto.setAccountNonLocked(true);
        userDto.setPassword(bCryptPasswordEncoder.encode(userDto.getPassword()));
        userDto.setRoles(Arrays.asList(Role.valueOf("ROLE_USER")));
        User user = userMapper.toEntity(userDto);
        userRepository.save(user);
    }

    @Override
    public boolean saveUser(User user) {
        User userFromDB = userRepository.findByUsername(user.getUsername());

        if (userFromDB != null) {
            return false;
        }
        return true;
    }

    @Override
    public Integer findUserIdSession() {
        User principal = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Integer id = principal.getId();
        return id;
    }

    @Transactional
    @Override
    public void save(User user) {

//        user.setEnabled(true);
//        user.setAccountNonExpired(true);
//        user.setCredentialsNonExpired(true);
//        user.setAccountNonLocked(true);
//        user.setUsername(user.getUsername());
//        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
//        user.setRoles(Arrays.asList(Role.valueOf("ROLE_USER")));
//        userRepository.save(user);
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
