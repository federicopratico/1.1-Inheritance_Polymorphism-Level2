# ☕ Java OOP: Inheritance & Polymorphism Exercises

## 📄 Description
This repository contains a collection of Java exercises designed to reinforce fundamental Object-Oriented Programming (OOP) concepts. The project focuses on practicing **inheritance**, **polymorphism**, **static vs. final modifiers**, and **interface implementation** within a modular Java architecture.

## 📚 Exercise Details

### Level 1 - Fundamental OOP & Modifiers

**Exercise 1: Musical Instruments (Static Initialization)**
* **Goal:** Implement a hierarchy of musical instruments (Wind, String, Percussion) with an abstract `play()` method.
* **Key Challenge:** Demonstrate that class loading occurs only once by utilizing **static initialization blocks** versus instance initialization blocks. The exercise proves that loading is triggered by the first instance creation or accessing a static member.

**Exercise 2: Car Modification (Static vs Final)**
* **Goal:** Create a `Car` class to demonstrate the specific behaviors of Java modifiers:
    * `static final` (Constant, class-level)
    * `static` (Class-level variable)
    * `final` (Immutable instance variable)
* **Key Challenge:** Implement methods to test scopes: `brake()` (static) and `accelerate()` (non-static), and demonstrate how to invoke them correctly from the `main()` method.

### Level 2 - Advanced Abstraction

**Exercise 1: Smartphone (Multiple Interfaces)**
* **Goal:** Build a `Smartphone` class that combines inheritance and interface implementation.
    * **Inherits from:** `Phone` (provides `call()` logic).
    * **Implements:** `Camera` (provides `photograph()`) and `Clock` (provides `alarm()`).
* **Key Challenge:** Manage behavior from multiple sources (interfaces and superclass) within a single object instance.



## 💻 Technologies Used
* **Java 21** - Core programming language.
* **IDE** (IntelliJ IDEA / Eclipse / VS Code) - Development environment.
* **Git** - Version control system.

## 📋 Requirements
* **Java SE Development Kit (JDK) 17** or higher installed.
* A Java-compatible IDE or a terminal with access to `javac` and `java` commands.
* Basic understanding of Java syntax, classes, and methods.

## 🛠️ Install
1.  **Clone the repository:**
    ```bash
    git clone https://github.com/federicopratico/1.1-Inheritance_Polymorphism-Level2.git
    ```
    or with SSH
    ```bash
    git clone git@github.com:federicopratico/1.1-Inheritance_Polymorfism-Level2.git
    ```
    
3.  **Navigate to the project directory:**
    ```bash
    cd Java-OOP-Exercises
    ```
4.  **Open in IDE:**
    Open the folder in IntelliJ IDEA (or your preferred IDE) and let it index the source files.

## 🚀 Execute
This project is designed to be run directly inside a Java IDE (IntelliJ IDEA, Eclipse, or VS Code).

## 🤝 Contributions
Contributions are welcome! If you want to add new exercises or improve existing solutions:

1.  **Fork** the repository.
2.  Create a new **branch**:
    ```bash
    git checkout -b feature/NewExercise
    ```
3.  **Commit** your changes:
    ```bash
    git commit -m "feat: Added solution for Level 3"
    ```
4.  **Push** to the branch:
    ```bash
    git push origin feature/NewExercise
    ```
5.  Submit a **Pull Request**.

---
*Happy Coding!* 🚀
