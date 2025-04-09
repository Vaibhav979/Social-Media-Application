package com.social.Social.config;

@Configuration
@EnableWebSecurity
public class AppConfig {

    @
    SecurityFilterChain securityFilterChain (HttpSecurity http) throws Exception{

        http.authorizeHttpRequests(Authorize -> Authorize
        .requestMatchers("/api/**").authenticated()
        .anyRequest().permitAll())
        .csrf(csrf -> csrf.disable());
        return http.build();
    }

}
