📦 Product Management System

A robust and scalable Product Management System built using Spring Boot, designed to manage product data efficiently through RESTful APIs. This project demonstrates strong backend development skills, clean architecture, and real-world application design.

🚀 Key Features
➕ Create new products
📋 Retrieve all products
✏️ Update existing product details
❌ Delete products
🔍 Search and filter products
⚡ RESTful API design with proper HTTP methods
🧩 Layered architecture (Controller → Service → Repository)
🛠️ Tech Stack
Category	Technologies Used
Backend	Java, Spring Boot, Spring MVC
Database	MySQL / H2 Database
ORM	Spring Data JPA, Hibernate
Build Tool	Maven
Testing	Postman
Version Control	Git, GitHub
🏗️ Project Architecture

The application follows a layered architecture for better scalability and maintainability:

product-management/
│── controller/     # Handles HTTP requests
│── service/        # Business logic layer
│── repository/     # Data access layer (JPA)
│── model/          # Entity classes
│── resources/      # Configuration files
│── pom.xml         # Maven dependencies
⚙️ API Endpoints
Method	Endpoint	Description
GET	/viewAllProducts	Fetch all products
POST	/addProduct	Add a new product
PUT	/updateProduct/{id}	Update product details
DELETE	/deleteProduct/{id}	Delete a product
GET	/search?keyword=	Search products
🧪 Sample Request (Add Product)
{
  "name": "Shampoo",
  "description": "Mild herbal shampoo",
  "price": 451.21,
  "photoUrl": "https://example.com/shampoo.jpg"
}
📸 API Testing
🔹 Add Product API

🔹 View All Products API

📌 Note: Place your screenshots inside an /images folder in the repository.

⚡ Getting Started
1️⃣ Clone the Repository
git clone https://github.com/ALOKKUMARSAW/Product_Management.git
cd Product_Management
2️⃣ Configure Database

Update your application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/product_db
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
3️⃣ Run the Application
mvn spring-boot:run

Application will start at:

http://localhost:8080
📈 Future Enhancements
🔐 JWT-based Authentication & Authorization
📊 Admin Dashboard with analytics
🛒 Integration with E-commerce platform
📦 Pagination & Sorting support
☁️ Deployment (AWS / Docker)
🧑‍💻 Author

Alok Kumar Saw

🔗 GitHub: https://github.com/ALOKKUMARSAW
💼 Java Backend Developer | Spring Boot Enthusiast
🌟 Support

If you found this project helpful:

👉 Give it a ⭐ on GitHub
👉 Share with your network
