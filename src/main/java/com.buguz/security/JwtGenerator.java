package com.buguz.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import com.buguz.model.JwtUser;
import org.springframework.stereotype.Component;

@Component
public class JwtGenerator {
    public String generate(JwtUser jwtUser) {
        Claims claims = Jwts.claims()
                .setSubject(jwtUser.getUserName());
        claims.put("userId", String.valueOf(jwtUser.getUserId()));
        claims.put("role", jwtUser.getRole());

        return Jwts.builder().setClaims(claims)
                .signWith(SignatureAlgorithm.HS512, "spring-sec")
                .compact();
    }
}
