package com.social.Social.config;

@Configuration
@EnableWebSecurity
public class AppConfig {

    SecurityFilterChain securityFilterChain (HttpSecurity http) throws Exception{

        http.authorizeHttpRequests(Authorize -> )
        return http.build();
    }

}
