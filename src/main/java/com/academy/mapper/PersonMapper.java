package com.academy.mapper;

import com.academy.dto.PersonDto;
import com.academy.model.entity.Person;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = UserMapper.class,
        injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface PersonMapper {
    @Mapping(target = "dateRegistration", source = "dateRegistration")
    @Mapping(target = "firstName", source = "firstName")
    @Mapping(target = "surname", source = "surname")
    @Mapping(target = "dateOfBirth", source = "dateOfBirth")
    @Mapping(target = "passportNumber", source = "passportNumber")
    @Mapping(target = "email", source = "email")
    @Mapping(target = "driverLicenseNumber", source = "driverLicenseNumber")
    @Mapping(target = "dateOfIssueOfTheDriverLicense", source = "dateOfIssueOfTheDriverLicense")
    @Mapping(target = "drivingExperience", source = "drivingExperience")
    @Mapping(target = "moneyOnTheAccount", source = "moneyOnTheAccount")
    @Mapping(target = "userDto", source = "user")
    PersonDto toDto(Person person);

    @Mapping(target = "dateRegistration", source = "dateRegistration")
    @Mapping(target = "firstName", source = "firstName")
    @Mapping(target = "surname", source = "surname")
    @Mapping(target = "dateOfBirth", source = "dateOfBirth")
    @Mapping(target = "passportNumber", source = "passportNumber")
    @Mapping(target = "email", source = "email")
    @Mapping(target = "driverLicenseNumber", source = "driverLicenseNumber")
    @Mapping(target = "dateOfIssueOfTheDriverLicense", source = "dateOfIssueOfTheDriverLicense")
    @Mapping(target = "drivingExperience", source = "drivingExperience")
    @Mapping(target = "moneyOnTheAccount", source = "moneyOnTheAccount")
    @Mapping(target = "user", source = "userDto")
    Person toModel(PersonDto personDto);

    List<PersonDto> modelsToDto(List<Person> persons);

    List<Person> dtoToModels(List<PersonDto> persons);
}

