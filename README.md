# 🤿 Java OOP Fundamentals: Dive Club Management

A hands-on implementation of a diving equipment management system, focused on applying core Java programming concepts and structural design.

## 🚀 Project Goal
This is a focused exercise in Object-Oriented Programming (OOP). Rather than building a large-scale system, the goal was to take a real-world scenario—a dive club's inventory—and model it using clean, readable, and well-structured Java code.

## 🛠️ Core Concepts Demonstrated
Instead of focusing on scale, this project emphasizes the **correct application** of core OOP principles:

* **Abstraction**: Ensuring clear contracts through abstract base classes.
* **Inheritance**: Building a logical hierarchy that makes sense for the diving domain.
* **Polymorphism**: Handling different gear types (Cylinders, Regulators, Computers) in a single collection while maintaining type-specific behavior.
* **Design Patterns & Error Handling**: Utilizing the **Factory Pattern** for object creation and **Custom Exceptions** to enforce domain-specific safety logic.
* **Encapsulation**: Strict adherence to data hiding and defensive programming practices.

## 📐 Architecture
The project is built around a logical hierarchy of diving gear:

* **DiveGear (Abstract)**: Defines the common state and the shared safety contract.
* **Specialized Subclasses**: Each implements its own unique business logic for maintenance (e.g., dive counts, battery levels, or test dates).
* **Inventory Manager**: Handles the lifecycle, rentals, and reporting using the Java Collections API.

