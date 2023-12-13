package com.musicplayer.musicplayer.security.mapper;

import com.musicplayer.musicplayer.security.dto.AuthenticatedUserDto;
import com.musicplayer.musicplayer.security.dto.RegistrationRequest;
import com.musicplayer.musicplayer.model.User;


import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {

	UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

	User convertToUser(RegistrationRequest registrationRequest);

	AuthenticatedUserDto convertToAuthenticatedUserDto(User user);

	User convertToUser(AuthenticatedUserDto authenticatedUserDto);

}
