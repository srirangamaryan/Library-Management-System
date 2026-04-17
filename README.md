# 📚 Library Management System (LMS)

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Build](https://img.shields.io/badge/Build-Success-brightgreen?style=for-the-badge)

A high-performance, console-based **Library Management System** built using Java.  
This application efficiently manages book inventories with synchronized collection handling, custom exception logic, and a robust CLI interface.

---

## 🚀 Core Features

- 📖 **Dynamic Inventory**  
  Add and manage books with author metadata.

- 🔄 **State Management**  
  Transition books between `Available` and `Issued` states.

- 🛡️ **Safe Iteration**  
  Uses `Iterator` to safely modify collections and avoid `ConcurrentModificationException`.

- ⚠️ **Error Handling**  
  Custom `BookNotFound` exception for precise debugging and user feedback.

- 🧾 **Transaction Logging**  
  Stores borrower name and issue date during checkout.

---

## 🛠️ Technical Stack

- **Language:** Java (JDK 8+)
- **Data Structures:**
  - `LinkedList` → Efficient O(1) removals (book issuing)
  - `ArrayList` → Structured attribute storage
- **Package:** `CWH.Library_Management`



---

## ⚙️ Installation & Execution

### 1️⃣ Clone the Repository
```bash
git clone https://github.com/yourusername/LMS-Java.git
cd LMS-Java
```

### 2️⃣ Compile

```bash
javac -d . Database.java
```

### 3️⃣ Run

```bash
java CWH.Library_Management.Database
```



## 🎮 How to Use

Once the application starts, choose from the menu:

* 📚 **Available Books** → View all available books
* 📕 **Issued Books** → View borrowed books and details
* 📤 **Issue Book** → Assign a book to a borrower
* 📥 **Return Book** → Return a borrowed book
* ➕ **Add Book** → Add new books to the system
* ❌ **Exit** → Close the application

---

## 🧠 Code Logic Overview

The system uses two primary collections:

* **`books` List**
  Stores available books → `[Title, Author]`

* **`issuedbooks` List**
  Stores issued books → `[Title, Author, Borrower, Date]`

### 🔁 Return Flow

When a book is returned:

* Borrower data is removed
* Book is re-added to the main inventory
* Ensures memory efficiency and consistent structure

---

## 🤝 Contributing

Contributions are welcome!

1. Fork the repository
2. Create a feature branch

   ```bash
   git checkout -b feature/NewFeature
   ```
3. Commit changes

   ```bash
   git commit -m "Add NewFeature"
   ```
4. Push to GitHub

   ```bash
   git push origin feature/NewFeature
   ```
5. Open a Pull Request

---

## 📜 License

This project is licensed under the **MIT License**.
See the `LICENSE` file for details.

---

## ⭐ Support

If you like this project, consider giving it a ⭐ on GitHub!


If you want, I can also make a **more premium README (with screenshots, GIF demo, or badges like contributors & stars)**.
