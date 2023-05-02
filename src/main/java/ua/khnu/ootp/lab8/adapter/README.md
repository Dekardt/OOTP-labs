# Technical Task

## Problem Statement

A food delivery system needs to be implemented, but the delivery methods may vary depending on the source of the food.

The sources may include restaurants, cafes, and even home kitchens. Each of these sources has its own implementation of
the `FoodDelivery` interface.

## Overview

The Adapter pattern is used to convert the interface of one class into the interface of another class. It allows classes
with incompatible interfaces to work together by creating a common interface that can be used by all the classes.

In this implementation, we have three classes that implement the `FoodDelivery` interface - `Restaurant`, `Cafe`,
and `HomeKitchen`. However, the `HomeKitchen` class does not implement the `FoodDelivery` interface, so an adapter is
created to convert its interface to the `FoodDelivery` interface.

The `HomeKitchenToDeliveryAdapter` class is the adapter class that implements the `FoodDelivery` interface and
internally uses the `HomeKitchen` class to order the food. The `orderFood()` method in the adapter class takes
a `String` argument that represents the type of food to be ordered.

The `AdapterPattern` class is the main class that demonstrates the use of the Adapter pattern. It creates objects of
the `Restaurant`, `Cafe`, and `HomeKitchenToDeliveryAdapter` classes, and calls the `orderFood()` method on each of them
with the same argument.