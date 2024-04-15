package dev.ankit.productservice.security;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;
@Service
public class TokenValidator {
    private RestTemplateBuilder restTemplateBuilder;

//
    public TokenValidator(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplateBuilder = restTemplateBuilder;
    }
//
    public Optional<JwtData> validateToken(String token) {
//        JwtData jwtData = new JwtData();
//    //use rest template to make a call to user sevice
////        RestTemplate restTemplate = new RestTemplateBuilder();
//    //use the token to make a call to user service
//
//    //if the token is valid, return the jwt data
//    //if the token is invalid, return empty
//        //***simply call the /validate api of the user service & make the return type as JwtData in user service
        return Optional.empty();
    }

}
