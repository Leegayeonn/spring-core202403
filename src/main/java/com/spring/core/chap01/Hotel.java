package com.spring.core.chap01;

import lombok.Setter;

public class Hotel {


    //의존관계: 어떤 객체가 정상 동작하기 위해 어떤 객체를 필요로 하는것.
    private IRestaurant restaurant;
    private IChef chef;

    public Hotel(IRestaurant restaurant, IChef chef) {
        this.restaurant = restaurant;
        this.chef = chef;
    }

    // 레스토랑 예약기능
    public void reserve() {
        System.out.printf("우리 호텔의 레스토랑은 %s입니다. 쉐프는 %s입니다."
                , restaurant.getClass().getSimpleName()
                , chef.getClass().getSimpleName());

        // 예약을 수행하려면 레스토랑에 연락해서 예약을 넣어야 함.
        restaurant.order();
    }





}
