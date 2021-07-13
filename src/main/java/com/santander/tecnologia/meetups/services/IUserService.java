/**
 * 
 */
package com.santander.tecnologia.meetups.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.santander.tecnologia.meetups.dto.UserLoginDTO;
import com.santander.tecnologia.meetups.dto.UserRequestDTO;
import com.santander.tecnologia.meetups.exceptions.AuthenticationFailedException;
import com.santander.tecnologia.meetups.model.IUser;
import com.santander.tecnologia.meetups.model.jwt.UserJWT;

/**
 * @author mxs690
 *
 */
public interface IUserService {

    UserJWT existUser(UserLoginDTO login) throws AuthenticationFailedException;

    IUser create(UserRequestDTO userRequestDTO);

    Page<IUser> all(PageRequest pageRequest);

}
