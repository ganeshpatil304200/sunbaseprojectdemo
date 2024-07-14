//package com.example.sunbaseproject.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.userdetails.UserDetailsService;
//
////config/SecurityConfig.java
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
// @Autowired
// private UserDetailsService userDetailsService;
// 
// @Override
// protected void configure(HttpSecurity http) throws Exception {
//     http.csrf().disable()
//             .authorizeRequests()
//             .antMatchers("/api/authenticate").permitAll()
//             .anyRequest().authenticated()
//             .and()
//             .addFilter(new JWTAuthenticationFilter(authenticationManager()));
// }
// 
// @Override
// protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//     auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
// }
// 
// @Bean
// public PasswordEncoder passwordEncoder() {
//     return new BCryptPasswordEncoder();
// }
//}