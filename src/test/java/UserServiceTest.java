package test.java;


import main.java.mongo.configs.AppConfigForTest;
import main.java.mongo.model.User;
import main.java.mongo.service.UserService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


/*@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfigForTest.class})
*/
public class UserServiceTest {

 /*   @Autowired
    private UserService userService;

    @Before
    public void setUpUser() {


        User user = new User();
        user.setUsername("username");
        user.setPassword("password");

        userService.save(user);
    }

    @Test
    public void testFindAll(){
        Assert.assertNotNull(userService.getUserList());

    }


    @Test
    public void testSave(){

        List<User> users=userService.getUserList();


        User user=new User();

        user.setUsername("SULTAN");
        user.setPassword("AYGÖREN");
        userService.save(user);

        List<User> userList=userService.getUserList();

        Assert.assertNotEquals(users.size(),userList.size());


    }


    @Test
    public void testDelete(){


        List<User> users=userService.getUserList();


        userService.delete(users.get(0));

        List<User> userList=userService.getUserList();

        Assert.assertNotEquals(users.size(),userList.size());



    }
    */


}
