# Technical Task

## Problem Statement

A restaurant wants to optimize their cooking process by reusing existing cooked food items. They would like to implement
a system that allows them to easily create multiple servings of a particular dish without having to cook it from scratch
each time.

The goal is to implement a system that allows the restaurant staff to create multiple servings of a particular dish by
cloning an existing cooked dish, rather than cooking the dish from scratch each time.

## Overview

The Prototype Pattern is a creational design pattern that allows objects to be cloned instead of creating a new object
each time. This pattern is useful when an application needs to create a large number of similar objects, but creating
each object from scratch would be time-consuming and resource-intensive.

In this implementation, we have a `FoodCache` class that holds a cache of pre-cooked `Food` objects. The `getFood`
method in the `FoodCache` class clones an existing cooked dish to create a new instance of the dish. This allows the
restaurant staff to easily create multiple servings of a particular dish by cloning an existing cooked dish, rather than
cooking the dish from scratch each time.