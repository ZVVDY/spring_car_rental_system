package com.academy.service;

import com.academy.dto.PersonDto;
import com.academy.model.entity.Person;
import com.academy.model.entity.User;

import java.text.ParseException;
import java.util.List;

public interface PersonService {
//    PersonDto findById(Integer id);
    Person findById(Integer id);
    void save(PersonDto userDto) throws ParseException;
    List<PersonDto> findByPersonId(Integer id);

//    List<PersonDto> findOrderPerson(Integer id);

    List<PersonDto> findNotCompletedPerson(Integer id);

    void deletePerson (Integer id);

}
