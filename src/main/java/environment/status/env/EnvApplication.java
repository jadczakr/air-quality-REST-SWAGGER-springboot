package environment.status.env;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class EnvApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnvApplication.class, args);
	}
	
	
	
	@Bean
	public Docket get()
	{
		return new Docket(DocumentationType.SWAGGER_2)
					.select()
					.paths(PathSelectors.ant("/api/**"))
					.build().apiInfo(createApiInfo());
	}

	
	public ApiInfo createApiInfo()
	{
		return new ApiInfo("AIRQUA",
							"air quality of Polish's cities \n Data source: http://powietrze.gios.gov.pl/",
						   "1.0",
						   "",
						   new Contact("Rafal","https://www.google.pl","rafal.jadczak97@gmail.com"),
						   "open-source",
						   "",
						   Collections.emptyList());
	}
	
	

	
	
	
}
