package io.cucumber.shouty.support;

import io.cucumber.java.ParameterType;
import io.cucumber.shouty.Person;

public class ParameterTypes {
    @ParameterType("Sean|Lucy")
    public Person person(String name){
        return new Person();
    }
}
