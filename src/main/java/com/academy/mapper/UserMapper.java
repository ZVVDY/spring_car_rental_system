package com.academy.mapper;

import com.academy.dto.UsersDto;
import com.academy.model.entity.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UsersDto toDto(User model);

    User toModel(UsersDto usersDto);

    List<UsersDto> modelsToDto(List<User> users);

    List<User> dtoToModels(List<UsersDto> cards);
}
