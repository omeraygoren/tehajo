package main.java.mongo.service;

import main.java.mongo.configs.ApplicationContextMongo;
import main.java.mongo.model.User;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@Component
public class UserService {


    ApplicationContextMongo applicationContext = new ApplicationContextMongo();

    MongoOperations mongoOperations = applicationContext.mongoOperations();

    @Transactional
    public boolean delete(User user) {


        boolean isSaved = false;
        try {

            mongoOperations.remove(user);
            isSaved = true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return isSaved;

    }

    @Transactional
    public User save(User user) {

        try {

            mongoOperations.save(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

    public User searchByUserName(String userName) {

        // query to search user
        Query searchUserQuery = new Query(Criteria.where("username").is(userName));

        return  mongoOperations.findOne(searchUserQuery, User.class);
    }

    public User update(User user){


        Query searchUserQuery = new Query(
                Criteria.where("password").is(user.getPassword() ));


        // update password
        mongoOperations.updateFirst(searchUserQuery,
                Update.update("password", "321"),User.class);

        return user;
    }

    public List<User> getUserList(){
        List<User> listUser = mongoOperations.findAll(User.class);
        return  listUser;
    }


}
