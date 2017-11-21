package main.java.mongo.controller;

import java.util.List;

import main.java.mongo.configs.ApplicationContextMongo;
import main.java.mongo.designpatterns.SingletonPattern;
import main.java.mongo.model.User;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;


public class DemoCrudAppMongo {

    public static void main(String[] args) {

        // For XML
        //ApplicationContextMongo ctx = new GenericXmlApplicationContext("SpringConfig.xml");


        ApplicationContextMongo applicationContext = new ApplicationContextMongo();


        // For Annotation
        // MongoOperations mongoOperation= applicationContext.mongoOperations();


        /**
         * with singleton pattern
         */
        MongoOperations mongoOperation = SingletonPattern.getInstance().connectDb();

        User user = new User();
        user.setUsername("omers");
        user.setPassword("1234");

        // save
        mongoOperation.save(user);

        // now user object got the created id.
        System.out.println("1. user : " + user);

        // query to search user
        Query searchUserQuery = new Query(Criteria.where("omer").is("123"));

        // find the saved user again.
        User savedUser = mongoOperation.findOne(searchUserQuery, User.class);
        System.out.println("2. find - savedUser : " + savedUser);

        // update password
        mongoOperation.updateFirst(searchUserQuery,
                Update.update("password", "new password"), User.class);

        // find the updated user object
        User updatedUser = mongoOperation.findOne(searchUserQuery, User.class);

        System.out.println("3. updatedUser : " + updatedUser);

        // delete
        mongoOperation.remove(searchUserQuery, User.class);

        // List, it should be empty now.
        List<User> listUser = mongoOperation.findAll(User.class);
        System.out.println("4. Number of user = " + listUser.size());

    }

}
