# Technical Task

## Problem Statement

A chef needs a system for executing multiple commands in a single step. The commands represent actions that the chef
performs on a particular ingredient, such as cutting, slicing, or peeling.

The goal is to implement a system that allows the chef to execute multiple commands as a single operation, without
exposing the details of individual commands.

## Overview

The Macrocommands Pattern is a behavioral pattern that allows grouping multiple individual commands into a single macro
command. The macro command can then be executed as a single operation, without exposing the details of the individual
commands.

In this implementation, we have a `MacroCommand` class that takes a list of individual commands (such as `CutCommand`
and `SliceCommand`) and executes them as a single macro command. This allows the chef to perform multiple actions on a
particular ingredient in a single step.