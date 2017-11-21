package main.java.mongo.designpatterns;


import main.java.mongo.configs.SpringMongoConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;

/**
 * Ram de tek bir instance oluşup onu kulllanmamızı sağlar.sürekli instance açılmaz .ram şişmez.
 * kullanıldığı yerler db transaction,file işlemleri,log işlemleri
 */
public class SingletonPattern {


    private static SingletonPattern instance;


    private SingletonPattern(){


        System.out.println("Singleton(): Initializing Instance");

    }

    public static synchronized SingletonPattern getInstance(){

        if(instance==null){
            System.out.println("getInstance(): First time getInstance was invoked!");
            instance=new SingletonPattern();

        }
        return instance;

    }





    public MongoOperations connectDb(){

        System.out.println("instance created");

        org.springframework.context.ApplicationContext ctx =
                new AnnotationConfigApplicationContext(SpringMongoConfig.class);
        MongoOperations mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");

        return  mongoOperation;
    }



    public static void main(String args[] ){


       SingletonPattern.getInstance().connectDb();

    }






}
