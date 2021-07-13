package com.santander.tecnologia.meetups.security;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.santander.tecnologia.meetups.constants.JwtConstants;
import com.santander.tecnologia.meetups.constants.ValidatorResult;
import com.santander.tecnologia.meetups.constants.ValidatorResult.ValidatorStatus;
import com.santander.tecnologia.meetups.model.jwt.UserJWT;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

@Component
public class JwtValidator {

    private static final Logger logger = LoggerFactory.getLogger(JwtValidator.class);

    public ValidatorResult validate(HttpServletRequest request, HttpServletResponse response) {

	ValidatorResult validatorResult = new ValidatorResult();
	String header = request.getHeader(JwtConstants.AUTHORIZATION_HEADER);

	if (header == null || "".contentEquals(header) || " ".contentEquals(header)) {
	    validatorResult.setValidatorStatus(ValidatorStatus.MISSING_TOKEN);
	    return validatorResult;
	}

	if (!header.startsWith(JwtConstants.BEARER_TOKEN)) {
	    validatorResult.setValidatorStatus(ValidatorStatus.INVALID_TOKEN);
	    return validatorResult;
	}

	String authenticationToken = header.substring(7);

	System.out.println("authenticationToken " + authenticationToken);

	UserJWT userJWT = validate(authenticationToken);
	if (userJWT != null) {
	    validatorResult.setUser(userJWT);
	    validatorResult.setValidatorStatus(ValidatorStatus.OK);
	} else {
	    validatorResult.setValidatorStatus(ValidatorStatus.INVALID_TOKEN);
	}

	return validatorResult;
    }

    private UserJWT validate(String token) {
	UserJWT userJWT = null;
	try {
	    Claims body = Jwts.parser().setSigningKey(JwtConstants.YOUR_SECRET).parseClaimsJws(token).getBody();
	    userJWT = new UserJWT();
	    userJWT.setUsername(body.getSubject());
	    userJWT.setId(Long.parseLong((String) body.get(JwtConstants.USER_ID)));
	    userJWT.setRole((String) body.get(JwtConstants.ROLE));
	} catch (Exception e) {
	    logger.error(e.toString(), e);
	    userJWT = null;
	}

	return userJWT;
    }

}
