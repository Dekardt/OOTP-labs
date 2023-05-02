# Technical Task

## Problem Statement

A chef needs to be able to prepare different types of food items that require different methods of cutting ingredients.
The chef wants to have a system in place that allows for easy switching between different cutting methods without
changing the chef's code.

## Overview

The Strategy Pattern is used to define a family of algorithms, encapsulate each one, and make them interchangeable. In
this implementation, we have a `Chef` class that takes a list of products and uses a `CuttingStrategy` interface to cut
them into smaller pieces.

The `Chef` class is designed to be flexible and can work with different `CuttingStrategy` implementations to cut the
products as needed.

In this example, we have two `CuttingStrategy` implementations - `DiceStrategy` and `SlicerStrategy`. The `Chef` class
can switch between these strategies as needed to cut the products in the desired way.