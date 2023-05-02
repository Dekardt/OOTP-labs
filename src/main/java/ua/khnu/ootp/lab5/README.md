# Technical Task

## Problem Statement

A chef needs to cook a list of food items, but the order of cooking is important. Additionally, the chef wants to be
able to traverse the list of food items both forward and backward, while keeping the order of the list.

## Overview

The Iterator Pattern provides a way to access elements of an aggregate object without exposing its underlying
representation. This pattern involves creating an Iterator object, which is responsible for traversing the elements of
an aggregate object. The Iterator object provides a way to access the elements of an aggregate object sequentially,
without exposing its underlying representation.

In this implementation, we have a `FoodIterator` interface and a `FoodCollection` class that acts as the aggregate
object. The `FoodIterator` interface defines the methods that are necessary for iterating over the food items, such
as `hasNext()` and `next()`. The `FoodCollection` class contains a list of food items and implements the `FoodIterator`
interface, providing concrete implementations for the iteration methods. The `FoodCollection` class also provides two
additional methods, `getStraightIterator()` and `getReversedIterator()`, that return iterators that traverse the food
items in either the original order or in reverse order.

To use the Iterator Pattern, we create a `FoodCollection` object that holds the food items to be cooked. We can then
obtain iterators from the `FoodCollection` object and use them to iterate over the food items in the desired order. In
this implementation, we demonstrate the use of the Iterator Pattern by cooking the food items in both the original and
reverse order using the `FoodCollection` iterators.