package br.com.gazin.location;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import br.com.gazin.location.service.PostmonService;

@SpringBootApplication
public class PostmonJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostmonJavaApplication.class, args);
	}

	@Bean
	public RestOperations restOperations() {
		return new RestTemplate();
	}
	@Bean
	public br.com.gazin.location.service.Localizable Localizable(){
		return new PostmonService();
	}
}
