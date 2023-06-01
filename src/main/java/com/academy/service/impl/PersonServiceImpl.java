package com.academy.service.impl;

import com.academy.dto.PersonDto;
import com.academy.dto.UserDto;
import com.academy.mapper.PersonMapper;
import com.academy.mapper.UserMapper;
import com.academy.model.entity.Person;
import com.academy.model.entity.User;
import com.academy.model.repository.OrderRepository;
import com.academy.model.repository.PersonRepository;
import com.academy.model.repository.UserRepository;
import com.academy.service.PersonService;
import com.academy.service.UserService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
@Data
public class PersonServiceImpl implements PersonService {
    private final PersonMapper personMapper;
    private final UserMapper userMapper;

    private final PersonRepository personRepository;
    private final OrderRepository orderRepository;
    private final UserRepository userRepository;
    private final UserService userService;

    @Override
    public Person findById(Integer id) {
        Person person = personRepository.getReferenceById(id);
        return person;
    }

    @Transactional
    @Override
    public void save(PersonDto personDto) throws ParseException {
        LocalDate dateNow = LocalDate.now();
        int age = dateNow.getYear();
        personDto.setDateRegistration(dateNow);
        personDto.setMoneyOnTheAccount(0.0);
        LocalDate date = personDto.getDateOfIssueOfTheDriverLicense();
        int age2 = date.getYear();
        personDto.setDrivingExperience((double) (age - age2));
        Integer userId = userService.findUserIdSession();
        User user = userRepository.getReferenceById(userId);
        UserDto userDto = userMapper.toDto(user);
        personDto.setUserDto(userDto);
        Person person = personMapper.toModel(personDto);
        //person.setUser(user);
        personRepository.save(person);
    }

    //TODO
    @Override
    public List<PersonDto> findByPersonId(Integer id) {
        return null;
    }


    @Override
    public List<PersonDto> findNotCompletedPerson(Integer id) {
        return null;
    }

    @Override
    public void deletePerson(Integer id) {

    }
}
