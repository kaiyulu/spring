package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Service("HelloWorld")
public class HelloWorld {
    private Add add;
    private String message;

    public void getMessage() {
        System.out.println("message  is "+message);
        System.out.println(add.addMethod());
    }

    public void setMessage(String message) {
        this.message = message;
    }
    @Autowired
    public void setAdd(Add add) {
        this.add = add;
    }

    public void init(){
        System.out.println("Bean is going through init.");
    }
    public void destroy(){
        System.out.println("Bean will destroy now.");
    }

}
