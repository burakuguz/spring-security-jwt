package com.buguz.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import com.buguz.model.JwtUser;
import org.springframework.stereotype.Component;

@Component
public class JwtValidator {

    private String secret = "spring-sec";

    public JwtUser validate(String token) {

        JwtUser jwtUser = null;
        try {
            Claims body = Jwts.parser()
                    .setSigningKey(secret)
                    .parseClaimsJws(token)
                    .getBody();

            jwtUser = new JwtUser();
            jwtUser.setUsername(body.getSubject());
            jwtUser.setId(Long.parseLong((String)body.get("userId")));
            jwtUser.setRole((String)body.get("role"));
        }catch (Exception e){
            System.out.println(e);
        }


        return jwtUser;
    }
}
