package japonics.newspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;
@Service

@SpringBootApplication

public class NewspringApplication {
public static void main(String[] args) {
		SpringApplication.run(NewspringApplication.class, args);
	}
//	@Bean
//	public Validator validator(MessageSource messageSource) {
//		LocalValidatorFactoryBean factory = new LocalValidatorFactoryBean();
//		factory.setValidationMessageSource(messageSource);
//		return factory;

}