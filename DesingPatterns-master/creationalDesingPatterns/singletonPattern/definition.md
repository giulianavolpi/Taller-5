## Definition

A **singleton pattern** restricts the istantation of a class to one "single" instance

The singleton design pattern solves problems like

- How can it be ensured that a class has only one instance?
- How can the sole instance of a class be accessed easily?
- How can a class control its instantiation?
- How can the number of instances of a class be restricted?
- How can a global variable be accessed?

The Singleton Pattern is generally considered an anti-pattern for the following reasons:

1. It cannot be inherited from. To add new functionality, a new class cannot be descended to contain that functionality, breaking **Separation of Concern**.
2. No control over creation. It is impossible to tell if a reference is of an existing instance or a new instance.
3. Prevents dependency injection. As there is only a single instance of the class, a dependency cannot be injected into it. If done via a property, the dependency is changed for all references to that instance

### Implementation

An implementation of the singleton pattern must:

- ensure that only one instance of the singleton class ever exists; and
- If a instance exist, provide global access to that instance.
- If a instance do not exist, create a new instance.

Typically, this is done by:

- declaring all constructors of the class to be private; and
- providing a static method that returns a reference to the instance.
