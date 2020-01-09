package lt.sdacademy.university;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "lt.sdacademy.university")
public class UniversityApplication {

	public static void main(String[] args) {

		SpringApplication.run(UniversityApplication.class, args);
	}
// ENDPOINTAS univerisity (title, person, lecturer)
}
