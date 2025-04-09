package com.social.Social.config;

@Configuration
@EnableWebSecurity
public class AppConfig {

    @Bean
    SecurityFilterChain securityFilterChain (HttpSecurity http) throws Exception{
        
        http.authorizeHttpRequests(Authorize -> Authorize
        .requestMatchers("/api/**").authenticated()
        .anyRequest().permitAll())
        .httpBasic
        .csrf(csrf -> csrf.disable());
        return http.build();
    }

}
