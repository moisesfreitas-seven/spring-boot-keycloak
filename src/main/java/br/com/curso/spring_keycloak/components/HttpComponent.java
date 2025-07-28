package br.com.curso.spring_keycloak.components;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class HttpComponent {

    // Criou o componente pois sempre vai crfiar o heeaders
    @Bean
    public HttpHeaders httpHeaders() {
        return new HttpHeaders();
    }

    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
