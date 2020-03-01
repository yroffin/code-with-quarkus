package org.yroffin;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "value" })
class ExampleModel {
    public String value;
    public String value2;
}