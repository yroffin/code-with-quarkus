package org.yroffin.model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "value", "value2", "value3" })
public class ExampleModel {
    public String value3;
    public String value;
    // sample
    public String value2;
}