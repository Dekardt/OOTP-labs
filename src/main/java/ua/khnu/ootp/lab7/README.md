# Technical Task

## Problem Statement

A restaurant is developing a new ordering system that allows customers to customize their food orders, including
choosing the type of sauce they want on their pasta dishes. The restaurant wants to implement a way to allow customers
to modify their orders and then undo those modifications if necessary.

## Overview

The Memento Pattern is a behavioral design pattern that provides a way to capture and save the internal state of an
object without exposing its implementation details.

In this implementation, we have a `Pasta` class that represents a pasta dish with a sauce. We also have a `PastaMemento`
class that allows us to save and restore the state of a `Pasta` object. We use the `PastaMemento` class to capture the
state of a `Pasta` object before making modifications to its sauce. After making modifications, we can restore
the `Pasta` object to its previous state using the `PastaMemento`.