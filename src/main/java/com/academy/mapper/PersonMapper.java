package com.academy.mapper;

import com.academy.dto.PersonDto;
import com.academy.model.entity.Person;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = UserMapper.class,
        injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface PersonMapper {
    PersonDto toDto(Person model);

    Person toModel(PersonDto personDto);

    List<PersonDto> modelsToDto(List<Person> persons);

    List<Person> dtoToModels(List<PersonDto> persons);
}
