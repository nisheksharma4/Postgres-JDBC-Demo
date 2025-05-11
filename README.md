# Postgres-JDBC-Demo

This is a simple Java project demonstrating how to connect to a PostgreSQL database using JDBC.

## ✅ Features
- Connects to PostgreSQL using JDBC
- Creates a `users` table if it doesn't exist
- Inserts a sample user (only if not already present)
- Fetches and displays all users from the database

## 🚀 How to Run

1. Set up PostgreSQL:
   - Create a database (e.g., `testdb`)
   - Make sure PostgreSQL is running
   - Update your DB username and password in `Main.java`:
     ```java
     String url = "jdbc:postgresql://localhost:5432/testdb";
     String user = "your_postgres_username";
     String password = "your_postgres_password";
     ```

2. Build and Run the Project:
   - Use Eclipse or any Java IDE
   - Run the `Main.java` file

## 🧾 Dependencies
- Java 8 or above
- PostgreSQL JDBC Driver  
  (Make sure it's added to your project's classpath)

## 📂 Project Structure
|__ src/
|__ com/
|__ jdbcProject/
|__ Main.java

OUTPUT:-
-> RUN as Java App
<img width="1008" alt="Screenshot 2025-05-11 at 4 13 18 PM" src="https://github.com/user-attachments/assets/7ace20a3-cccc-47fa-8b0f-7baf972999dd" />

-> postgresql database
<img width="1280" alt="Screenshot 2025-05-11 at 4 11 04 PM" src="https://github.com/user-attachments/assets/da06be34-240c-4b19-9279-417e772d0d0e" />



## 🔗 Useful Links
- [PostgreSQL JDBC Driver](https://jdbc.postgresql.org/)
- [Official PostgreSQL Docs](https://www.postgresql.org/docs/)

---



