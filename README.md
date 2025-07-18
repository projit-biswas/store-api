# 🏪 Store API

A Spring Boot-based RESTful API for managing products, customers, carts, and orders — ideal for online store or e-commerce platforms.

## 🔧 Technology Stack

- **Java 17+**
- **Spring Boot** (Web, Data JPA, Security)
- **Hibernate** for ORM
- **MySQL** for relational database
- **JWT** for secure token-based authentication
- **Lombok** to reduce boilerplate code
- **Swagger UI** for API documentation and testing
- **Maven** for project management

---

## ✨ Features

### 🔐 Authentication & Authorization
- JWT-based login system
- Role-based access (Admin & Customer)
- Secure password handling

### 👤 User Management
- Register a new customer
- Admin user support
- Update/delete user profiles

### 📦 Product Management
- Admin: Create, update, delete products
- Customer: View and filter products

### 🛒 Cart Operations
- Add/remove products from cart
- Update quantities
- View cart details
- Clear cart

### 📦 Order Management
- Place orders from cart
- Cancel orders
- View order history (Customer/Admin)
- Track order status

### 🗺️ Address Management
- Add/update/remove address linked to users
- Associate address during order placement

### ⚙️ Additional Highlights
- Centralized exception handling
- Data Transfer Objects (DTOs) for clean separation
- Layered architecture (Controller-Service-Repository)

---

## 🚀 Getting Started

### ✅ Prerequisites

- Java 17 or higher
- Maven 3.x
- MySQL Server

### 📁 Clone the Repo

```bash
git clone https://github.com/projit-biswas/store-api.git
cd store-api
