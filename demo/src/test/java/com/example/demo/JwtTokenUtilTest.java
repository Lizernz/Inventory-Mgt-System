package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.example.demo.security.JwtTokenUtil;

@SpringBootTest
@ActiveProfiles("test")

  class JwtTokenUtilTest {

    @Autowired
private JwtTokenUtil jwtTokenUtil;

    @Test
    void testGenerateToken() {
        String token = jwtTokenUtil.generateToken("testUser");
        assertNotNull(token);
        assertTrue(token.startsWith("eyJ")); // JWT tokens typically start with "eyJ"
    }

    @Test
    void testValidateToken() {
        String token = jwtTokenUtil.generateToken("testUser");
        assertTrue(jwtTokenUtil.validateToken(token));
    }

    @Test
    void testGetUsernameFromToken() {
        String token = jwtTokenUtil.generateToken("testUser");
        String username = jwtTokenUtil.getUsernameFromToken(token);
        assertEquals("testUser", username);
    }

    @Test
    void testInvalidToken() {
        String invalidToken = "invalid.token.string";
        assertFalse(jwtTokenUtil.validateToken(invalidToken));
    }
}
