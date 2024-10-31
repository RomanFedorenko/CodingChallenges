package com.challenge.dinglemouse;

/**
 * https://www.codewars.com/kata/5b0a80ce84a30f4762000069/java
 */
public class Dinglemouse {
    String helloFormat = "Hello.";
    String name;
    int age;
    char sex;

    public Dinglemouse() {
    }

    public Dinglemouse setAge(int age) {
        if (!helloFormat.contains(" I am [age].")) helloFormat += " I am [age].";
        this.age = age;
        return this;
    }

    public Dinglemouse setSex(char sex) {
        if (!helloFormat.contains(" I am [sex].")) helloFormat += " I am [sex].";
        this.sex = sex;
        return this;
    }

    public Dinglemouse setName(String name) {
        if (!helloFormat.contains(" My name is [name].")) helloFormat += " My name is [name].";
        this.name = name;
        return this;
    }

    public String hello() {
        return helloFormat.replace("[age]", String.valueOf(age))
                .replace("[sex]", sex == 'M' ? "male" : "female")
                .replace("[name]", String.valueOf(name) );
    }

}
