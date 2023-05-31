package com.academy.mapper;

import com.academy.dto.UserDto;
import com.academy.model.entity.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User model);

    User toEntity (UserDto usersDto);

    List<UserDto> modelsToDto(List<User> users);

    List<User> dtoToModels(List<UserDto> user);
}
