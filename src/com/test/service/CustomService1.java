package com.test.service;

import com.test.annotation.PathAnnotation;

public interface CustomService1 {

    @PathAnnotation(path = "/test/${0}")
    public Object method1(String id);

    @PathAnnotation(path = "/test/${0}/${1}")
    public Object method2(String name, String path);
}
