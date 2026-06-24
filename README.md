# Java Programming - Core Concepts & Examples

This repository contains a collection of Java programs demonstrating core concepts of the Java programming language, ranging from basic operators and object-oriented programming to exception handling, multithreading, and GUI programming.

## Table of Contents
1. [Basic Java & Operators](#basic-java--operators)
2. [Object-Oriented Programming (OOP)](#object-oriented-programming-oop)
3. [Exception Handling](#exception-handling)
4. [Multithreading & Concurrency](#multithreading--concurrency)
5. [GUI Programming (Swing)](#gui-programming-swing)
6. [Repository Metrics & Key Information](#repository-metrics--key-information)

---

### Basic Java & Operators

Demonstrates basic control flows, arithmetic operations, logical statements, and ternary conditions.

*   **`ArmstrongNo.java`**: Calculates and verifies whether a given integer is an Armstrong number (a number that is equal to the sum of cubes of its digits, generalized to the power of the number of digits).
    *   *Key Concepts Demonstrated*: `while` loops, digit extraction, power calculations, string length retrieval, and basic conditional checks.
*   **`ConditionalOperator.java`**: Demonstrates the usage of the ternary operator (`? :`) for inline conditional checks.
    *   *Key Concepts Demonstrated*: Inline conditional checks, ternary operator, and variable assignment.
*   **`LogicalOperator.java`**: Illustrates logical operators, focusing on the logical AND (`&&`) operator.
    *   *Key Concepts Demonstrated*: Compound conditional statements, short-circuit evaluation, and `if-else` blocks.
*   **`combinedoperator.java`**: Illustrates shorthand assignment operators (`+=` and `-=`) to mutate variable values concisely.
    *   *Key Concepts Demonstrated*: Compound assignment operators and arithmetic operations.

---

### Object-Oriented Programming (OOP)

Covers the primary pillars of OOP including classes, constructor types, polymorphism, and inheritance structures.

*   **`bike1.java`**: Showcases object initialization and constructor overloading.
    *   *Key Concepts Demonstrated*: Default constructors, parameterized constructors, constructor overloading, and object instantiations.
*   **`functionOverloding.java`**: Demonstrates compile-time polymorphism through method overloading.
    *   *Key Concepts Demonstrated*: Method overloading (same method name, different parameter count), class structure, and instantiation.
*   **`inheritance1.java`**: Illustrates class extension where a subclass inherits properties and methods from a single superclass.
    *   *Key Concepts Demonstrated*: `extends` keyword, base/derived relationship, and inheriting method visibility.
*   **`in2.java`**: Demonstrates hierarchical inheritance structure where multiple subclasses inherit from a single superclass.
    *   *Key Concepts Demonstrated*: Class hierarchies, subclassing a single parent, and parent method sharing.
*   **`multilevel.java`**: Demonstrates multilevel inheritance where a subclass inherits from a derived subclass.
    *   *Key Concepts Demonstrated*: Multi-tiered class structures, cascading inheritance, and transitive method access.

---

### Exception Handling

Covers robust error handling using try-catch blocks, final execution, propagation, and custom exceptions.

*   **`CustomExceptionHandling.java`**: Illustrates how to define, instantiate, throw, and catch custom exceptions.
    *   *Key Concepts Demonstrated*: Extending the `Exception` class, `throw` keyword, and multiple `catch` blocks.
*   **`FinallyInJava.java`**: Demonstrates the behavior of the `finally` block which always runs regardless of whether an exception occurs.
    *   *Key Concepts Demonstrated*: `try-catch-finally` block, arrays index boundary exception, and guaranteed cleanup.
*   **`ThrowInJava.java`**: Shows how to explicitly throw exceptions when specific validation checks fail.
    *   *Key Concepts Demonstrated*: `throw` keyword, runtime exception initiation, and parameter validation.
*   **`ThrowsInJava.java`**: Demonstrates exception propagation by declaring exceptions in a method's signature.
    *   *Key Concepts Demonstrated*: `throws` keyword, exception forwarding, checked exceptions, and upstream error handling.

---

### Multithreading & Concurrency

Covers thread lifecycle management, simultaneous execution, synchronization, and advanced locking mechanisms.

*   **`ThreadDemo01.java` / `ThreadDemo02.java` / `ThreadDemo03.java`**: Outline basic thread creation by extending the `Thread` class and managing thread execution states.
    *   *Key Concepts Demonstrated*: Thread subclassing, `Thread.sleep()`, thread naming (`setName`/`getName`), checking state (`isAlive`, `isDaemon`), and thread interrupts.
*   **`ThreadUsingInterface.java`**: Demonstrates creating threads by implementing the lightweight `Runnable` interface.
    *   *Key Concepts Demonstrated*: `Runnable` implementation, passing runnables to `Thread` constructors, and starting threads with `run()`.
*   **`TradingUsingThread.java`**: Demonstrates the simultaneous execution of multiple thread instances.
    *   *Key Concepts Demonstrated*: Thread concurrency, parallel output, and time delays.
*   **`ThreadSynchronization.java`**: Shows how to prevent race conditions on shared objects using synchronized blocks.
    *   *Key Concepts Demonstrated*: Class-level monitor locks (`synchronized(this)`), thread interleaving, and joining threads (`join()`).
*   **`ThreadLock.java`**: Illustrates using explicit lock objects for thread coordination.
    *   *Key Concepts Demonstrated*: `ReentrantLock`, non-blocking locking (`tryLock`), time-limited lock attempts (`TimeUnit`), and unlocking inside a `finally` block.
*   **`FairnessLockExample.java`**: Demonstrates fair lock scheduling to prevent thread starvation.
    *   *Key Concepts Demonstrated*: Fair lock configuration (`new ReentrantLock(true)`) and First-In-First-Out (FIFO) lock allocation.
*   **`ReentrantExample.java`**: Showcases lock reentrancy, allowing a thread to acquire the same lock multiple times without deadlock.
    *   *Key Concepts Demonstrated*: Reentrant locks, nested lock requests, and matching lock/unlock counts.

---

### GUI Programming (Swing)

Demonstrates how to build desktop interfaces in Java.

*   **`SimpleFormUsingSwing.java`**: Constructs a simple Graphical User Interface (GUI) form.
    *   *Key Concepts Demonstrated*: `JFrame`, `FlowLayout`, `JLabel`, `JTextField`, `JButton`, custom styling (Fonts, Foreground/Background Colors), and window closing operations.

---

## Repository Metrics & Key Information

### File Summary
*   **Total Active Java Files**: 29
*   **Documentation Files**: 1 (`README.md`)
*   **Total Java Topics Covered**: 5 (Operators, OOP, Exception Handling, Multithreading, Swing GUI)
*   **Legacy Spaced/Extensionless Files**: 6 (Original filenames are fully preserved with their code and functionality intact, configured for compile safety)


### Crucial Concepts Highlighted
*   **Safe Thread Concurrency**: Demonstrated in `ThreadSynchronization.java` and `ThreadLock.java` to ensure resource safety.
*   **Type Safety & Checked Exceptions**: Practiced in the Exception Handling files to prevent program crashes during runtime.
*   **Polymorphic Behaviors**: Method overloading and class hierarchies are utilized to make structures flexible.
*   **Swing GUI Basics**: Visual UI components layout management using Java's standard GUI library.
