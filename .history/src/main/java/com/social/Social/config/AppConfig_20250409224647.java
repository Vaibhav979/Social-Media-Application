package com.social.Social.config;

@Configuration
@EnableWebSecurity
public class AppConfig {

    @Bean
    SecurityFilterChain securityFilterChain (HttpSecurity http) throws Exception{

        http.sessionManagement(
            management -> s
        http.authorizeHttpRequests(Authorize -> Authorize
        .requestMatchers("/api/**").authenticated()
        .anyRequest().permitAll())
        .csrf(csrf -> csrf.disable());
        return http.build();
    }

}
