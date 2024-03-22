package com.spring.core.chap01;

public class AsianRestaurant implements IRestaurant{

    private IChef chef;
    private SushiCourse course = new SushiCourse();


    public void order() {
        System.out.println("스시 오마카세를 주문합니다.");
        course.combineMenu();
        chef.cook();
    }
}
