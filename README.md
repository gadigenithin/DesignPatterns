# Java Design Patterns

## Overview

This project showcases Java implementations of common design patterns, organized into three categories: **Creational**, **Structural**, and **Behavioral**. Each pattern is implemented in its own package, making it easy to explore and understand.

## Project Structure

The project is organized as follows:

<pre> ``` src/ ├── creational/ ├── structural/ └── behavioral/ ``` </pre>


Each folder contains sub-packages for individual design patterns.

### Creational Design Patterns
Creational patterns are focused on object creation mechanisms, trying to create objects in the best way for the situation at hand.

1. **Singleton**: Ensures that a class has only one instance and provides a global point of access to it.
2. **Factory Method**: Allows subclasses to alter the type of objects created by an interface.
3. **Abstract Factory**: Provides an interface for creating families of related or dependent objects without specifying their concrete classes.
4. **Builder**: Separates the construction of a complex object from its representation, allowing the same construction process to create different representations.
5. **Prototype**: Creates new objects by copying a prototypical instance.
6. **Object Pool**: Recycles objects that are expensive to create, reducing overhead.

### Structural Design Patterns
Structural patterns deal with the composition of classes and objects, focusing on simplifying relationships and making systems more manageable.

1. **Adapter**: Enables incompatible interfaces to work together by translating one interface into another.
2. **Bridge**: Decouples an abstraction from its implementation, allowing both to evolve independently.
3. **Composite**: Organizes objects into tree structures to represent part-whole hierarchies.
4. **Decorator**: Dynamically adds behavior to an object without affecting other objects of the same class.
5. **Facade**: Provides a simplified interface to a complex system, making it easier to use.
6. **Flyweight**: Reduces the number of objects created by sharing common data between multiple objects.
7. **Proxy**: Provides a surrogate for another object to control access to it.


### Behavioral Design Patterns
Behavioral patterns focus on how objects communicate with each other, allowing more flexibility in communication between them.

1. **Chain of Responsibility**: Passes a request through a chain of handlers where each one can process it or pass it along.
2. **Command**: Encapsulates a request as an object, allowing parameterization of clients with different requests.
3. **Iterator**: Provides a way to sequentially access elements in an aggregate object without exposing its internal structure.
4. **Mediator**: Defines an object that handles communication between other objects to reduce dependencies between them.
5. **Memento**: Captures and externalizes an object's internal state so it can be restored later without violating encapsulation.
6. **Observer**: Establishes a one-to-many dependency between objects, where one object notifies others of state changes.
7. **State**: Allows an object to change its behavior when its internal state changes, appearing as if it changed its class.
8. **Strategy**: Defines a family of algorithms and makes them interchangeable, allowing the client to select the appropriate one at runtime.
9. **Template Method**: Defines the skeleton of an algorithm and allows subclasses to implement certain steps.
10. **Visitor**: Lets you add operations to objects without modifying their classes.

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

