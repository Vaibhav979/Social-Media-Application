package com.social.Social.config;

@Configuration
@EnableWebSecurity
public class AppConfig {

    SecurityFilterChain securityFilterChain (HttpSecurity http) throws Exception{

        http.auth
        return http.build();
    }

}
