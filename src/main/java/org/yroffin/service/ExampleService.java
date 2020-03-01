package org.yroffin.service;

import javax.enterprise.context.ApplicationScoped;

import org.yroffin.model.ExampleModel;

@ApplicationScoped
public class ExampleService {

    public ExampleModel hello() {
        ExampleModel data = new ExampleModel();
        data.value = "test";
        data.value2 = "test2";
        data.value3 = "test3 de plus";
        return data;
    }
}