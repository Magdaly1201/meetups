/**
 * 
 */
package com.santander.tecnologia.meetups.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.santander.tecnologia.meetups.dto.UserLoginDTO;
import com.santander.tecnologia.meetups.exceptions.AuthenticationFailedException;
import com.santander.tecnologia.meetups.model.jwt.UserJWT;
import com.santander.tecnologia.meetups.security.GeneratorJWT;
import com.santander.tecnologia.meetups.services.IUserService;

/**
 * Class AuthenticationController
 * 
 * @author Magdaly Santos
 *
 */
@Controller
public class AuthenticationController {

    @Autowired
    private GeneratorJWT generator;

    @Autowired
    private IUserService userService;

    /**
     * method to generate token JWT with the username and password
     * 
     * @param login
     * @return String jwt
     * @throws AuthenticationFailedException
     */
    public String generator(UserLoginDTO login) throws AuthenticationFailedException {
	UserJWT userJWT = this.userService.existUser(login);
	return this.generator.generate(userJWT);
    }

}
