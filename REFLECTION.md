# Library Project Reflection

## What OOP feature helped most?

**Polymorphism** proved to be the most valuable OOP feature in this library system. By implementing the `getLoanDays()` method in the base `LibraryItem` class and overriding it in subclasses (`Book` returns 21 days, `DVD` returns 7 days), we achieved flexible behavior without complex conditional logic.

This polymorphic design allowed the `Library` class to work with mixed collections of different item types seamlessly. When displaying loan periods or implementing business rules, the system automatically calls the correct version of `getLoanDays()` based on the actual object type at runtime. This made the code more maintainable and extensible - adding new item types with different loan periods requires only creating a new subclass and overriding the method.

**Encapsulation** was also crucial for data integrity, ensuring that checkout/return state could only be modified through controlled methods that enforce business rules. **Inheritance** eliminated code duplication between item types, while **Collections** enabled efficient management of multiple items and patrons.

The combination of these OOP principles created a robust, scalable system that clearly separates concerns and follows real-world library management patterns.