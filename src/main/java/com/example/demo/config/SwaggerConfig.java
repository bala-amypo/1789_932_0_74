package com.example.demo.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.List;

@Configuration
public class SwaggerConfig {

    @Bean
    public swagger customOpenAPI() {
        return new swagger()
                // You need to change the port as per your server
                .servers(List.of(
                        new Server().url("https://9005.vs.amypo.ai")
                ));
        }
}