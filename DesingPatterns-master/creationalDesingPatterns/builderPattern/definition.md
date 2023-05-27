## Definition

The intent of the **Builder design pattern** is to separate the construction of a complex object from its representation.

The Builder design pattern solves problems like:[2]

- How can a class (the same construction process) create different representations of a complex object?
- How can a class that includes creating a complex object be simplified?
  
Creating and assembling the parts of a complex object directly within a class is inflexible. It commits the class to creating a particular representation of the complex object and makes it impossible to change the representation later independently from (without having to change) the class.

The Builder design pattern describes how to solve such problems:

- Encapsulate creating and assembling the parts of a complex object in a separate Builder object.
- A class delegates object creation to a Builder object instead of creating the objects directly.


A class (the same construction process) can delegate to different Builder objects to create different representations of a complex object.

Advantages of the Builder pattern include:
-
- Allows you to vary a product's internal representation.
- Encapsulates code for construction and representation.
- Provides control over steps of construction process.

Disadvantages of the Builder pattern include:
-
- A distinct ConcreteBuilder must be created for each type of product.
- Builder classes must be mutable.
- May hamper/complicate dependency injection