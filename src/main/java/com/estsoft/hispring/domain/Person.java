package com.estsoft.hispring.domain;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@ToString
public class Person {
    private String name;
    private int age;

    public String toString(){
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                        '}';
    }
}
