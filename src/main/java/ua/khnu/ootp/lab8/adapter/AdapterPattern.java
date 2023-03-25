package ua.khnu.ootp.lab8.adapter;

import ua.khnu.ootp.core.food.FoodType;

public class AdapterPattern {

    public static void main(String[] args) {
        String food = FoodType.PIZZA.name();

        FoodDelivery delivery = new Restaurant();
        delivery.orderFood(food);

        delivery = new Cafe();
        delivery.orderFood(food);

        delivery = new HomeKitchenToDeliveryAdapter(new HomeKitchen());
        delivery.orderFood(food);
    }
}
