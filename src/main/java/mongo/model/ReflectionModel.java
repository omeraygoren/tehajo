package main.java.mongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class ReflectionModel {

    @Id
    private String id;

    String methodName;

    String declaredMethod;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public String getDeclaredMethod() {
        return declaredMethod;
    }

    public void setDeclaredMethod(String declaredMethod) {
        this.declaredMethod = declaredMethod;
    }
}
