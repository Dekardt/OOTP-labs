# Technical Task

## Problem Statement

A restaurant wants to implement a system for interpreting orders of different types of food items. The restaurant offers
various types of food items, such as pasta, pizza, burgers, sandwiches, etc.

The goal is to implement a system that allows interpreting the orders using a common interface, so that the restaurant
can easily understand the customer's requests.

## Overview

The Interpreter pattern provides a way to interpret a language or a grammar. In this implementation, we have different
expression classes, such as `FoodItemExpression`, `FoodAndExpression`, and `FoodOrExpression`. These expressions are
used to interpret food items and food combinations.

The `FoodItemExpression` is used to interpret individual food items, while `FoodAndExpression` and `FoodOrExpression`
are used to interpret food combinations.

In this example, we have used the `FoodAndExpression` and `FoodOrExpression` classes to interpret the food items "Pasta"
and "Borshch". The `FoodAndExpression` class interprets a combination of two food items using the "AND" operator, while
the `FoodOrExpression` class interprets a combination of two food items using the "OR" operator.

The Interpreter pattern can be useful when there is a need to interpret a language or a grammar, and when the
expressions in the language or grammar can be represented using a class hierarchy.