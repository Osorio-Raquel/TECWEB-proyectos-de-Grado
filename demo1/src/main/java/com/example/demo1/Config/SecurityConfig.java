package com.example.demo1.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.http.HttpMethod;
import static org.springframework.security.config.Customizer.withDefaults;


@Configuration
@EnableWebSecurity
public class SecurityConfig {

    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
            .authorizeHttpRequests(requests -> 
                requests
                    .requestMatchers(HttpMethod.GET, "/", "/hello").permitAll()
                     .anyRequest().authenticated()
            )
            .formLogin(AbstractHttpConfigurer::disable) // Puedes personalizar la configuración de formLogin o deshabilitarla
            .oauth2Login(withDefaults())  // Usa el método estático withDefaults() para configuraciones predeterminadas
            .logout(logout -> 
                logout
                    .logoutUrl("/logout")  // URL para cerrar sesión
                    .invalidateHttpSession(true)  // Invalida la sesión
                    .deleteCookies("JSESSIONID")  // Elimina la cookie de sesión
                    .logoutSuccessUrl("/")  // Redirecciona después del logout
            )
            .build();
    }
}
