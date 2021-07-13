/**
 * 
 */
package com.santander.tecnologia.meetups.security;

import org.springframework.stereotype.Component;

import com.santander.tecnologia.meetups.constants.JwtConstants;
import com.santander.tecnologia.meetups.model.jwt.UserJWT;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

/**
 * @author mxs690
 *
 */
@Component
public class GeneratorJWT {

    public String generate(UserJWT userJWT) {
	Claims claims = Jwts.claims().setSubject(userJWT.getUsername());
	claims.put(JwtConstants.USER_ID, String.valueOf(userJWT.getId()));
	claims.put(JwtConstants.ROLE, userJWT.getRole());
	return Jwts.builder().setClaims(claims).signWith(SignatureAlgorithm.HS256, JwtConstants.YOUR_SECRET).compact();

    }
}
