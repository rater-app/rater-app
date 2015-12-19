package ua.rater.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.security.access.SecurityConfig;

/**
 * Created by Maksym on 12/19/2015.
 */
@Configuration
@Import({ /*SecurityConfig.class, /*DatabaseConfig.class, SocialConfig.class,*/ MvcConfig.class })
@PropertySource("classpath:application.properties")
public class ApplicationContext {

    @Bean
    public PropertySourcesPlaceholderConfigurer propertyPlaceHolderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
