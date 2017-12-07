package swaggertest;

import io.swagger.models.Contact;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class App {
    public static void main(String...args){

        SpringApplication.run(App.class, args);
    }
    @Bean
    public Docket invoiceApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select().apis(RequestHandlerSelectors.basePackage("swaggertest.invoice"))
                .build()
                .apiInfo(metadata());
    }
    private ApiInfo metadata(){
        ApiInfo apiInfo = new ApiInfo(
                "a title",
                "a description",
                "1.0",
                "my terms",
                "beta.lambda@gmail.com",
                "Apache License Version 2.0",
                "https://www.apache.org/licenses/LICENSE-2.0");
        return apiInfo;
    }
}
