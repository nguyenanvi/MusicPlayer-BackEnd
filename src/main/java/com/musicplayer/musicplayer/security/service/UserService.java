package com.musicplayer.musicplayer.security.service;

import com.musicplayer.musicplayer.security.dto.RegistrationRequest;
import com.musicplayer.musicplayer.security.dto.AuthenticatedUserDto;
import com.musicplayer.musicplayer.security.dto.RegistrationResponse;
import com.musicplayer.musicplayer.model.User;

public interface UserService {

	User findByUsername(String username);

	RegistrationResponse registration(RegistrationRequest registrationRequest);

	AuthenticatedUserDto findAuthenticatedUserByUsername(String username);

}