//package com.ecom.api_gateway.security.service;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Profile;
//import org.springframework.security.oauth2.client.registration.ClientRegistration;
//import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
//import org.springframework.security.oauth2.client.registration.InMemoryClientRegistrationRepository;
//import org.springframework.security.oauth2.core.AuthorizationGrantType;
//import org.springframework.stereotype.Service;
//
//@Service
//@Profile("dev")
//public class KeycloakService {
//    public ClientRegistrationRepository clientRepository() {
//
//        ClientRegistration keycloak = keycloakClientRegistration();
//        return new InMemoryClientRegistrationRepository(keycloak);
//    }
//
//    private ClientRegistration keycloakClientRegistration() {
//
//        return ClientRegistration.withRegistrationId("Ecommerce")
//                .clientId("microservices-rest-api")
//                .clientSecret("fb1C7HnF9pWc6sri0xjX1vo3MJ0AbzgG")
//                .redirectUri("http://localhost:8085/login/oauth2/code/microservices-rest-api")
//                .authorizationGrantType(AuthorizationGrantType.AUTHORIZATION_CODE)
//                .issuerUri("http://localhost:8081/realms/Ecommerce")
//                .authorizationUri("http://localhost:8081/realms/Ecommerce/protocol/openid-connect/auth")
//                .tokenUri("http://localhost:8081/realms/Ecommerce/protocol/openid-connect/token")
//                .userInfoUri("http://localhost:8081/realms/Ecommerce/protocol/openid-connect/userinfo")
//                .build();
//    }
//}
