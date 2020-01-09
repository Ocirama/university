package lt.sdacademy.university.configs;

import lombok.extern.slf4j.Slf4j;
import lt.sdacademy.university.model.dto.University;
import lt.sdacademy.university.services.UniversityService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableJpaRepositories(basePackages ={ "lt.sdacademy.university"})
@Slf4j
public class AppConfig {

}

