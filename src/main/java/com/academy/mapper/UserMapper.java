package com.academy.mapper;

import com.academy.dto.UsersDto;
import com.academy.model.entity.Users;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UsersDto toDto(Users model);

    Users toModel(UsersDto usersDto);

    List<UsersDto> modelsToDto(List<Users> users);

    List<Users> dtoToModels(List<UsersDto> cards);
}
