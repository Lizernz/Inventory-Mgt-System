package com.example.demo.security;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.core.context.SecurityContextHolder;

import java.io.IOException;
import java.util.ArrayList;

public class JwtAuthenticationFilter extends UsernamePasswordAuthenticationFilter {

    private final AuthenticationManager authenticationManager;
    private final JwtTokenUtil jwtTokenUtil; // Declare the JwtTokenUtil

    // Constructor that injects both AuthenticationManager and JwtTokenUtil
    public JwtAuthenticationFilter(AuthenticationManager authenticationManager, JwtTokenUtil jwtTokenUtil) {
        this.authenticationManager = authenticationManager;
        this.jwtTokenUtil = jwtTokenUtil; // Initialize the jwtTokenUtil
    }

    @Override
public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
    // Get the JWT token from the Authorization header
    String header = request.getHeader("Authorization");

    if (header == null || !header.startsWith("Bearer ")) {
        throw new RuntimeException("JWT Token is missing or does not have Bearer prefix");
    }

    // Extract the token by removing the "Bearer " prefix
    String token = header.substring(7);

    // Log token value for debugging
    System.out.println("Received Token: " + token);

    // Extract the username from the token using JwtTokenUtil
    String username = jwtTokenUtil.getUsernameFromToken(token);
    System.out.println("Extracted Username: " + username);  // Log username

    if (username == null || !jwtTokenUtil.validateToken(token)) {
        throw new RuntimeException("Invalid or expired JWT token");
    }

    // Create an authentication token
    UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(
        username,
        null, // Password is not needed here as we authenticate via the token
        new ArrayList<>() // Authorities, can be extracted from the token if needed
    );

    // Authenticate the token using the authentication manager
    return authenticationManager.authenticate(authenticationToken);
}

@Override
protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain,
                                        Authentication authResult) throws IOException, ServletException {
    // Log successful authentication
    System.out.println("Authentication successful for: " + authResult.getName());
    // Add the authentication details to the SecurityContext
    SecurityContextHolder.getContext().setAuthentication(authResult);

    // Proceed with the filter chain to continue processing the request
    chain.doFilter(request, response);
}
}

   