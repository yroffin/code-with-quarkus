package org.yroffin;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ExampleService {

    public ExampleModel hello() {
        ExampleModel data = new ExampleModel();
        data.value = "test";
        data.value2 = "test2";
        return data;
    }
}