// Encapsulation: Private variable with public getter/setter
class Person {
    private String name;
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}

// Inheritance: Employee class inherits from Person
class Employee extends Person {
    private double salary;

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
}

// Polymorphism: Method Overriding (different behavior in subclass)
class Developer extends Employee {
    public void work() {
        System.out.println("Developer writes code");
    }
}

// Abstraction: Abstract class with abstract method
abstract class Animal {
    abstract void makeSound(); // Abstract method with no body
}

// Concrete class implementing abstract method
class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}
