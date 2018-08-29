package com.test.factory;

import com.test.service.ServiceInvocationHandler;

import java.lang.reflect.Proxy;

public class ServiceFactory {

     // Factory for creating services.
    public static <T> T getService(Class<T> clazz) {
        return (T) Proxy.newProxyInstance(ServiceFactory.class.getClassLoader(), new Class[]{clazz}, new ServiceInvocationHandler());
    }
}
