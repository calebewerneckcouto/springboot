package br.com.springboot.curso_jdev_treinamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.SpringServletContainerInitializer;

/**
 *
 * Spring Boot application starter class
 */
@SpringBootApplication
public class Application {
	
    public static void main(String[] args) {
    	
        SpringApplication.run(Application.class, args);/*É a linha principal que roda o projeto Java Spring Boot*/
        
    }
    
}
