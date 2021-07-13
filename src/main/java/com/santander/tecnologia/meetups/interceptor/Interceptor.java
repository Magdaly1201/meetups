package com.santander.tecnologia.meetups.interceptor;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.annotation.security.RolesAllowed;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.collections4.map.DefaultedMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.santander.tecnologia.meetups.constants.ValidatorResult;
import com.santander.tecnologia.meetups.constants.ValidatorResult.ValidatorStatus;
import com.santander.tecnologia.meetups.exceptions.AccessDeniedException;
import com.santander.tecnologia.meetups.exceptions.InvalidTokenException;
import com.santander.tecnologia.meetups.exceptions.MissingTokenException;
import com.santander.tecnologia.meetups.security.JwtValidator;

/**
 * Class Interceptor extends HandlerInterceptorAdapter
 * 
 * @author Magdaly Santos
 * 
 */
public class Interceptor extends HandlerInterceptorAdapter {

    private static final Logger logger = LoggerFactory.getLogger(Interceptor.class);

    @Autowired
    private JwtValidator validator;

    public Interceptor() {
	setupHandlers();
    }

    private interface ResultHandler {
	void handle(HttpServletRequest request, HttpServletResponse response, Set<String> neededRoles,
		ValidatorResult result) throws Exception;
    }

    private Map<ValidatorStatus, ResultHandler> resultHandlers;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
	    throws Exception {
	String url = ((HttpServletRequest) request).getRequestURL().toString();
	logger.info("Interceptor preHandle: " + url);
	Set<String> neededRoles = getRolesForMethod((HandlerMethod) handler);
	ValidatorResult validatorResult = validator.validate(request, response);
	resultHandlers.get(validatorResult.getValidatorStatus()).handle(request, response, neededRoles,
		validatorResult);
	request.setAttribute("com.santander.tecnologia.meetups.model.jwt.UserJWT", validatorResult.getUser());
	return super.preHandle(request, response, handler);
    }

    private Set<String> getRolesForMethod(HandlerMethod handler) {
	if (!handler.hasMethodAnnotation(RolesAllowed.class)) {
	    return new HashSet<String>();
	}
	RolesAllowed annotation = handler.getMethodAnnotation(RolesAllowed.class);
	return new HashSet<String>(Arrays.asList(annotation.value()));
    }

    private void setupHandlers() {

	resultHandlers = new DefaultedMap<>((request, response, neededRoles, result) -> {
	    throw new InvalidTokenException();
	});

	resultHandlers.put(ValidatorStatus.INVALID_TOKEN, (request, response, neededRoles, result) -> {
	    throw new InvalidTokenException();
	});

	resultHandlers.put(ValidatorStatus.MISSING_TOKEN, (request, response, neededRoles, result) -> {
	    throw new MissingTokenException();
	});

	resultHandlers.put(ValidatorStatus.OK, (request, response, neededRoles, result) -> {
	    logger.info("needed roles: " + neededRoles);
	    logger.info("user role: " + result.getUser().getRole());
	    if (!neededRoles.contains(result.getUser().getRole())) {
		throw new AccessDeniedException();
	    }
	});

    }
}