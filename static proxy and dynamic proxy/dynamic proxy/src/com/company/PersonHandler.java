package com.company;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PersonHandler implements InvocationHandler {

    private Object obj;

    public PersonHandler(Object obj){
        this.obj=obj;
    }


    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {

        System.out.println("早");
        Object result = method.invoke(obj, args);
        System.out.println("晚");
        return result;
    }

}

