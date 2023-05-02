# Technical Task

## Problem Statement

A restaurant offers various types of food items, such as pasta, pizza, burgers, sandwiches, etc.
The restaurant needs to implement a way to add extra flavor to the food items without modifying the existing code.

## Overview

The Decorator pattern allows adding additional behaviors or responsibilities to an object dynamically without modifying
its underlying code. The pattern uses a decorator class that wraps the original object and provides additional
functionality by adding new methods or modifying the behavior of existing methods.

In this implementation, we have a `Food` interface that defines the method for cooking the food. We also have
a `Borshch` class that implements the `Food` interface. We want to add extra flavors to `Borshch` without modifying its
code. We achieve this by creating decorator classes, `Salt` and `Pepper`, that implement the `Food` interface and wrap
the `Borshch` object. These decorator classes add additional behavior to the `Borshch` object by modifying the `cook()`
method.

In the `main` method of `DecoratorPattern` class, we create a `Borshch` object and wrap it with `Salt` and `Pepper`
decorators. Finally, we call the `cook()` method on the resulting object to cook the food.