/**
 * 
 */
package com.santander.tecnologia.meetups.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;

import com.santander.tecnologia.meetups.dto.UserRequestDTO;
import com.santander.tecnologia.meetups.dto.UserResponseDTO;
import com.santander.tecnologia.meetups.services.IUserService;

/**
 * @author Magdaly Santos
 *
 */
@Controller
public class UserController {

    @Autowired
    private IUserService service;

    @Autowired
    private ModelMapper modelMapper;

    public UserResponseDTO create(UserRequestDTO userRequestDTO) {
	return this.modelMapper.map(this.service.create(userRequestDTO), UserResponseDTO.class);
    }

    public Page<UserResponseDTO> all(PageRequest pageRequest) {
	return this.service.all(pageRequest).map(d -> this.modelMapper.map(d, UserResponseDTO.class));
    }

}
