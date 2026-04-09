# NEU Library Resource Management System

## Problem Statement
The NEU Library offers a variety of resources, including books, theses, capstones, internet access, journals, and newspapers. The initial implementation featured a `Student` object with tightly coupled methods like `borrowBook(title)` and `borrowJournal(title)`. This design violated the Dependency Inversion Principle (DIP) because the high-level module (`Student`) depended directly on low-level modules (`Book`, `Journal`). It also violated the Open-Closed Principle (OCP), as introducing new resource types (e.g., audiobooks, e-journals) would require modifying the existing `Student` class.

## Proposed Solution
The refactored solution applies SOLID principles, specifically focusing on the Dependency Inversion Principle (DIP) and the Open-Closed Principle (OCP). 

Instead of specific borrow methods for each type, we introduced a `LibraryResource` interface. All resource types (`Book`, `Journal`, `AudioBook`, etc.) implement this interface. The `Student` class now depends entirely on the `LibraryResource` abstraction, utilizing a single `borrowResource(LibraryResource resource)` method. This ensures loose coupling, allowing new resource types to be added seamlessly without altering the core `Student` logic.

## UML Class Diagram