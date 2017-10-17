package main.java.mongo.configs;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;

public class ApplicationContextMongo {


    public MongoOperations mongoOperations(){
        org.springframework.context.ApplicationContext ctx =
                new AnnotationConfigApplicationContext(SpringMongoConfig.class);
        MongoOperations mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");

        return  mongoOperation;
    }



}
