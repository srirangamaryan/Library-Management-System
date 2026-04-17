# Library Management System (LMS)

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Build](https://img.shields.io/badge/Build-Success-brightgreen?style=for-the-badge)

A high-performance, console-based **Library Management System** implemented in Java. This application manages book inventories using synchronized collection logic, featuring custom exception handling and a robust command-line interface.

## 🚀 Core Features

* **Dynamic Inventory:** Add and track books with specific author metadata.
* **State Management:** Seamlessly transition books between `Available` and `Issued` states.
* **Safe Iteration:** Utilizes `Iterator` patterns to ensure thread-safe collection modification, preventing `ConcurrentModificationException`.
* **Error Handling:** Implements a custom `BookNotFound` exception architecture for precise debugging and user feedback.
* **Transaction Logging:** Captures borrower names and issue dates during the checkout process.

---

## 🛠 Technical Stack

* **Language:** Java (JDK 8+)
* **Data Structures:** * `LinkedList` for efficient O(1) removals during book issuance.
    * `ArrayList` for structured storage of book attributes (Title, Author, Borrower, Date).
* **Package:** `CWH.Library_Management`

---

## 📂 Project Structure

```text
.
├── CWH/
│   └── Library_Management/
│       └── Database.java     # Main Logic & UI
└── README.md                 # Documentation
