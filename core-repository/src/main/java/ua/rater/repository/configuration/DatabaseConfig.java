package ua.rater.repository.configuration;

import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.authentication.UserCredentials;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import javax.annotation.Resource;
import java.net.UnknownHostException;

/**
 * Created by Maksym on 12/27/2015.
 */
@Configuration
public class DatabaseConfig {

    @Resource
    private Environment env;

    @Bean
    public MongoTemplate createMongoTemplate() throws UnknownHostException {
        MongoClient mongoClient = new MongoClient(env.getProperty("mongo.host"), Integer.parseInt(env
                .getProperty("mongo.port")));
        UserCredentials credentials = new UserCredentials(env.getProperty("mongo.user"),
                env.getProperty("mongo.password"));
        SimpleMongoDbFactory simpleMongoDbFactory = new SimpleMongoDbFactory(mongoClient,
                env.getProperty("mongo.db.name"), credentials);
        return new MongoTemplate(simpleMongoDbFactory);
    }

}
