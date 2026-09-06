# Java OOP: Dive Club Inventory

A Java-based system for managing diving equipment, focused on core OOP principles and clean code structure.

## Project Goal
This is a focused exercise in Object-Oriented Programming (OOP). Instead of building a large system, the goal was to take a real-world scenario - a dive club's inventory - and model it using readable and well-organized Java code.

## Core Concepts
Rather than focusing on scale, I focused on applying the fundamentals correctly:

* **Abstraction**: Using abstract classes to define clear gear contracts.
* **Inheritance**: Creating a logical hierarchy for different types of equipment.
* **Polymorphism**: Managing diverse gear types in a single collection while keeping specific behaviors.
* **Patterns & Safety**: Using a Factory pattern for object creation and custom exceptions for safety logic.
* **Encapsulation**: Proper use of private fields and defensive copying to protect data integrity.

## tructure
The project follows a simple hierarchy:

* **DiveGear**: The base abstract class for all equipment.
* **Specialized Classes**: Specific logic for Cylinders, Regulators, and Computers (maintenance, battery checks, etc).
* **Inventory Manager**: Handles the storage and reporting using Java Collections.
