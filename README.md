# Java Design Patterns

## Overview

This project showcases Java implementations of common design patterns, organized into three categories: **Creational**, **Structural**, and **Behavioral**. Each pattern is implemented in its own package, making it easy to explore and understand.

## Project Structure

The project is organized as follows:

<pre> ``` src/ 
 ├── creational/
 ├── structural
 └── behavioral ``` </pre>


Each folder contains sub-packages for individual design patterns.

### Creational Design Patterns
*Focus on how objects are created in a flexible and reusable way.*

- **Singleton**: Ensures only one instance of a class exists and provides a global access point to it.  
- **Factory Method**: Defines an interface for creating objects, letting subclasses decide which class to instantiate.  
- **Abstract Factory**: Provides a way to create related objects without specifying their concrete classes.  
- **Builder**: Constructs complex objects step-by-step, separating construction from representation.  
- **Prototype**: Creates new objects by copying an existing one.  


### Structural Design Patterns
*Help organize classes and objects to form larger structures in a clear, efficient way.*

- **Adapter**: Converts one interface into another that clients expect.  
- **Bridge**: Separates an abstraction from its implementation so both can vary independently.  
- **Composite**: Allows you to treat individual objects and groups of objects the same way.  
- **Decorator**: Adds responsibilities to an object dynamically without changing its structure.  
- **Facade**: Provides a simplified interface to a complex system.  
- **Flyweight**: Reduces memory use by sharing common parts of objects.  
- **Proxy**: Controls access to another object, adding extra behavior when needed.


### Behavioral Design Patterns
*Manage how objects interact and respond to events or changes.*

- **Chain of Responsibility**: Passes requests through a chain of handlers until one handles it.  
- **Command**: Encapsulates a request as an object, allowing actions to be executed, queued, or undone.  
- **Iterator**: Provides a way to access elements of a collection sequentially without exposing its structure.  
- **Mediator**: Defines a central object to coordinate communication between other objects.  
- **Memento**: Captures an object's internal state so it can be restored later.  
- **Observer**: Establishes a one-to-many dependency, notifying observers of changes in another object.  
- **State**: Allows an object to change its behavior when its internal state changes.  
- **Strategy**: Defines a family of algorithms, allowing them to be selected at runtime.  
- **Template Method**: Defines the structure of an algorithm, allowing subclasses to override specific steps.  
- **Visitor**: Separates an algorithm from the objects it operates on, making it easier to add new operations.

## How to Use

1. Clone the repository:
   ```bash
   git clone https://github.com/gadigenithin/DesignPatterns.git

2. Explore the patterns in the `src` folder.

3. To test a pattern, navigate to its sub-package and run the main class.

## License

This project is open-source and available under the MIT License.

## References

- **GeeksforGeeks**: [Design Patterns in Java](https://www.geeksforgeeks.org/design-patterns-in-java/)
- **Refactoring Guru**: [Design Patterns](https://refactoring.guru/design-patterns)
- **LinkedIn Learning**: [Complete Guide to Java Design Patterns](https://www.linkedin.com/learning/complete-guide-to-java-design-patterns-creational-behavioral-and-structural/)

