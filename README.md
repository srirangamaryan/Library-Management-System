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

## ⚙️ Installation & Execution

### 1. Clone the Repository
```bash
git clone [https://github.com/yourusername/LMS-Java.git](https://github.com/yourusername/LMS-Java.git)
cd LMS-Java

2. Compile

Compile the source code into the proper package directory:
Bash

javac -d . Database.java

3. Run

Launch the application using the fully qualified class name:
Bash

java CWH.Library_Management.Database

🎮 How to Use

Once the application starts, navigate using the following menu options:

    Available Books: View the current list of titles ready for borrowing.

    Issued Books: Check which books are currently out and who has them.

    Issue Book: Remove a book from inventory and assign it to a borrower.

    Return Book: Check a book back into the system.

    Add Book: Manually expand the library's collection.

    Exit: Terminate the session securely.

📝 Code Logic Overview

The system utilizes two primary lists to maintain data integrity:

    books List: Contains [Title, Author] for all available items.

    issuedbooks List: Contains [Title, Author, Borrower, Date] for all active loans.

When a book is returned, the system intelligently strips the borrower metadata and re-indexes the book into the primary inventory to save memory and maintain consistent data shapes.
🤝 Contributing

Contributions are welcome!

    Fork the Project.

    Create your Feature Branch (git checkout -b feature/NewFeature).

    Commit your Changes (git commit -m 'Add NewFeature').

    Push to the Branch (git push origin feature/NewFeature).

    Open a Pull Request.

📜 License

Distributed under the MIT License. See LICENSE for more information.
