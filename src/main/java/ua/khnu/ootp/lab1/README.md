# Technical Task

## Problem Statement

A restaurant wants to implement a system for managing the orders of different types of food items. The restaurant offers
various types of food items, such as pasta, pizza, burgers, sandwiches, etc.

The goal is to implement a system that allows to create these food items without exposing the creation logic, but using
a common interface

## Overview

The purpose of the Factory Pattern is to provide an interface for creating objects in a superclass, but allow subclasses
to alter the type of objects that will be created. This pattern is useful in situations where the client code needs to
be shielded from the creation process of objects and needs to use a common interface to access the created objects.

In this implementation, we have a `FoodFactory` class that creates `Food` objects based on the `FoodType`.