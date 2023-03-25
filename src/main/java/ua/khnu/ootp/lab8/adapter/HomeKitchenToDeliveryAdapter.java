package ua.khnu.ootp.lab8.adapter;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class HomeKitchenToDeliveryAdapter implements FoodDelivery {

    private final HomeKitchen homeKitchen;

    @Override
    public void orderFood(String food) {
        String products = homeKitchen.buyNeededProductsFor(food);
        homeKitchen.cookFoodFrom(food, products);
    }
}
