package me.dio.spring_api_rest_em_nuvem_java_railway;

import io.github.cdimascio.dotenv.Dotenv;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(servers = {@Server(url = "/", description = "Default Server URL")})
@SpringBootApplication
public class SpringPublicandoApiRestEmNuvemJavaRailwayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringPublicandoApiRestEmNuvemJavaRailwayApplication.class, args);
	}

}
