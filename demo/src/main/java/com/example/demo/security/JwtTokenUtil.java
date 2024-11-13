package com.example.demo.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.security.Keys;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JwtTokenUtil {

   

    // Secure key for signing and validating tokens (ensure key size is 256+ bits)
    private final byte[] secretKey = new byte[64]; // 512-bit key for HS512 algorithm
   //  private final String secret = "my-secret-key-my-secret-key-my-secret-key-my-secret-key"; // You can generate a secure key here

    public JwtTokenUtil() {
        // Fill the secretKey array to ensure 512-bit key
        java.util.Arrays.fill(secretKey, (byte) 0x01); // Just a filler for example; use a real secure key in production
    }

    // Generate a JWT token
    public String generateToken(String username, String role) {
        return Jwts.builder()
                .setSubject(username)
                .claim("role", role)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 86400000))  // example expiration time of 1 day
                .signWith(Keys.hmacShaKeyFor(secretKey), SignatureAlgorithm.HS512) // Use the strong key
                .compact();
    }

    // Validate the token
    public boolean validateToken(String token) {
        try {
            Jwts.parserBuilder()
                .setSigningKey(Keys.hmacShaKeyFor(secretKey)) // Ensure the same key is used for validation
                .build()
                .parseClaimsJws(token);  // Parse and validate the JWT
            return true;
        } catch (Exception e) {
            System.out.println("JWT token is invalid: " + e.getMessage());
        }
        return false;
    }

    // Get the username from the token
    public String getUsernameFromToken(String token) {
        Claims claims = Jwts.parserBuilder()
                            .setSigningKey(Keys.hmacShaKeyFor(secretKey)) // Use the same key for extraction
                            .build()
                            .parseClaimsJws(token)
                            .getBody();
        return claims.getSubject();
    }
   
}