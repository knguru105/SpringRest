package omniwyse.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = "omniwyse.spring")
public class CourseApi {
	
	
	public static void main(String[] args) {
		SpringApplication.run(CourseApi.class, args);

	}

}
