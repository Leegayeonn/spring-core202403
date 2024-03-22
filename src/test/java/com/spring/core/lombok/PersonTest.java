package com.spring.core.lombok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    // test 진행시 아노테이션 @test 작성!
    @Test
    void lombokTest() {
        Person p = new Person();
        p.setName("유사범");
        p.setAge(28);

        String name = p.getName();

        System.out.println("p = " + p);

        Person p2 = new Person("이가연", 29);
        System.out.println("p2 = " + p2);
    }

}