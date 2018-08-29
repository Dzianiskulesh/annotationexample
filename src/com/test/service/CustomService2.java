package com.test.service;

import com.test.annotation.PathAnnotation;

public interface CustomService2 {

    @PathAnnotation(path = "/anotherendpoint/${0}")
    public Object method3(String id);

    @PathAnnotation(path = "/hello/howareyou/${0}/${1}")
    public Object method4(String name, int index);
}
