/**
 * 
 */
package com.santander.tecnologia.meetups.controllers.rest;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.santander.tecnologia.meetups.constants.JwtConstants;
import com.santander.tecnologia.meetups.controllers.AuthenticationController;
import com.santander.tecnologia.meetups.dto.UserLoginDTO;
import com.santander.tecnologia.meetups.exceptions.AuthenticationFailedException;

import io.swagger.annotations.ApiOperation;

/**
 * Class AuthenticationRestController
 * 
 * @author Magdaly Santos
 */
@RestController
@RequestMapping("/token")
public class AuthenticationRestController {

    @Autowired
    private AuthenticationController authController;

    /**
     * method to generate jwt with username and password
     * 
     * @param login
     * @return jwt bearer
     * @throws AuthenticationFailedException
     */
    @PostMapping
    @ApiOperation(value = "Generate token JWT with usename and password", notes = "")
    public ResponseEntity<?> generate(@Valid @RequestBody final UserLoginDTO login)
	    throws AuthenticationFailedException {
	String token = authController.generator(login);
	return new ResponseEntity<String>(JwtConstants.BEARER_TOKEN.concat(token), HttpStatus.OK);

    }

}
