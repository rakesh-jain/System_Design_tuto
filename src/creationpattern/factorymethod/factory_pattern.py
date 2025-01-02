'''Factory Method Design Pattern

Definition:

The Factory Method Design Pattern provides an interface for creating
objects in a super class but allows subclasses to alter the type of 
objects that will be created. It promotes loose coupling by delegating 
the responsibility of object creation to a factory class or method.


When to Use Factory Method:

-When the object creation logic is complex: If creating an object involves multiple steps or significant logic, using a factory method abstracts that complexity.
-When the exact type of object to be created is not known beforehand: Factory methods allow flexibility by deciding which class to instantiate at runtime based on input or configuration.
-To adhere to the Open/Closed Principle: Adding new classes or objects doesn't require modifying the existing factory method; you simply extend the factory to support new types.
-For loose coupling: The client code doesn't need to know the details of how objects are created or which class to instantiate.


Real-World Use Cases:

-Web Frameworks: Dynamically creating forms or views.
-Game Development: Creating entities like enemies or power-ups.
-Payment Gateways: Choosing between PayPal, Stripe, etc.
-Logging Systems: Selecting loggers dynamically (file, console).


Advantages of Factory Method Pattern:

-Promotes reusability and maintainability.
-Reduces coupling between client code and concrete classes.
-Makes it easier to introduce new types of objects without modifying existing code.

Disadvantages:

-Can lead to an increase in the number of classes or methods in the system.
-May add unnecessary complexity for simple object creation.






EXAMPLE:'''

from abc import ABCMeta, abstractmethod

class IPerson(metaclass=ABCMeta):
    @abstractmethod
    def person_info(self):
        pass  # Abstract instance method, not static

class Student(IPerson):
    def __init__(self):
        self.name = "student name"

    def person_info(self):
        print(" i am a student")

class Teacher(IPerson):
    def __init__(self):
        self.name = "teacher name"

    def person_info(self):
        print("i am a teacher")

class Factory:
    @staticmethod
    def buildperson(person_type):
        if person_type == "student":
            return Student()  # Return the created instance
        elif person_type == "teacher":
            return Teacher()  # Return the created instance
        else:
            return None  # Use None for invalid cases

if __name__ == "__main__":
    choice = input("Enter 'student' or 'teacher': ").strip().lower()
    person = Factory.buildperson(choice)
    if person:
        person.person_info()
    else:
        print("Invalid choice!")
