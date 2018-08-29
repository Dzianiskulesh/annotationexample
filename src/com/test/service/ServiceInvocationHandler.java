package com.test.service;

import com.test.annotation.PathAnnotation;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

// Class will identify proxy logic.
public class ServiceInvocationHandler implements java.lang.reflect.InvocationHandler {

    private static final String basePath = "http://mytestserver.com";

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object response = null;
        // Get annotation.
        PathAnnotation annotation = method.getAnnotation(PathAnnotation.class);
        if (annotation != null) {
            // if annotation present take it path parameter.
            String path = annotation.path();
            // paster parameter values to path instead of ${0},${1},${2}
            Parameter[] parameters = method.getParameters();
            for (int i = 0; i < parameters.length; i++) {
                path = path.replace("${" + i + "}", args[i].toString());
            }
            response = sendHttpRequest(path);
        }
        return response;
    }


    public Object sendHttpRequest(String path) {
        // here will be code for getting http response and parse it
        System.out.println("Sending http request to - " + basePath + path);
        // returning parsed object
        return new Object();
    }
}
